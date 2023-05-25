package com.lakers.convert;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2022/11/14 13:52
 *
 * @author lakers
 */
public class BaseConverter implements Converter {

    static List<Converter> converterList = new ArrayList<>();

    static {
        converterList.add(new IntegerConverter());
        converterList.add(new FloatConverter());
    }


    public void register(Converter converter) {
        converterList.add(converter);
    }

    @Override
    public boolean support(Class type) {
        return converterList.stream().anyMatch(t -> t.support(type));
    }

    @Override
    public Object convert(String str, Class type) {
        for (Converter converter : converterList) {
            if (converter.support(type)) {
                return converter.convert(str, type);
            }
        }
        throw new IllegalArgumentException();
    }
}
