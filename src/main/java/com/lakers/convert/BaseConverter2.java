package com.lakers.convert;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2022/11/14 15:18
 *
 * @author lakers
 */
public class BaseConverter2 implements Convert2 {

    private List<Convert2> convert2List = new ArrayList<>();


    public BaseConverter2() {
        convert2List.add(new IntegerConvert2());
        convert2List.add(new FloatConvert2());
    }


    @Override
    public boolean support(Class type) {
        return convert2List.stream().anyMatch(t -> t.support(type));
    }

    @Override
    public Object convert(String str, Class type) {
        for (Convert2 convert2 : convert2List) {
            if (convert2.support(type)) {
                return convert2.convert(str, type);
            }
        }
        throw new IllegalArgumentException();
    }
}
