package com.lakers.convert;

/**
 * Created on 2022/11/14 15:14
 *
 * @author lakers
 */
public interface Convert2 {

    boolean support(Class type);

    Object convert(String str, Class type);
}
