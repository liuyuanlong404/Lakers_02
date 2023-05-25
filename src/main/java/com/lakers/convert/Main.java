package com.lakers.convert;

/**
 * Created on ${DATE} ${TIME}
 *
 * @author ${USER}
 */
public class Main {
    public static void main(String[] args) {
        String num = "123";
        String stu = "lakers,25";

        Object convert = new BaseConverter2().convert(num, Float.class);
        System.out.println(convert);
        System.out.println(convert.getClass());
    }

    private static Object convert(String num, Class type) {
        if (type == Integer.class || type == int.class) {
            return Integer.parseInt(num);
        }
        throw new IllegalArgumentException();
    }
}