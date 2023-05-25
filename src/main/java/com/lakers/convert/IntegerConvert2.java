package com.lakers.convert;

/**
 * Created on 2022/11/14 15:15
 *
 * @author lakers
 */
public class IntegerConvert2 implements Convert2 {

    @Override
    public boolean support(Class type) {
        return type == Integer.class || type == int.class;
    }

    @Override
    public Object convert(String str, Class type) {
        return Integer.parseInt(str);
    }
}
