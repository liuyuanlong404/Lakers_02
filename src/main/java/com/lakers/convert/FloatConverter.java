package com.lakers.convert;

/**
 * Created on 2022/11/14 13:37
 *
 * @author lakers
 */
public class FloatConverter implements Converter {

    @Override
    public boolean support(Class type) {
        return type == float.class || type == Float.class;
    }

    @Override
    public Float convert(String str, Class type) {
        return Float.parseFloat(str);
    }
}
