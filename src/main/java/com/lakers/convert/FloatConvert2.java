package com.lakers.convert;

/**
 * Created on 2022/11/14 15:15
 *
 * @author lakers
 */
public class FloatConvert2 implements Convert2 {

    @Override
    public boolean support(Class type) {
        return type == Float.class || type == float.class;
    }

    @Override
    public Object convert(String str, Class type) {
        return Float.parseFloat(str);
    }
}
