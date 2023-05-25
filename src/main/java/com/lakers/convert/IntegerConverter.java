package com.lakers.convert;

/**
 * Created on 2022/11/14 13:35
 *
 * @author lakers
 */
public class IntegerConverter implements Converter {

    @Override
    public boolean support(Class type) {
        return type == int.class || type == Integer.class;
    }

    @Override
    public Integer convert(String str, Class type) {
        return Integer.parseInt(str);
    }


}
