package com.lakers.convert;

/**
 * Created on 2022/11/14 14:21
 *
 * @author lakers
 */
public class StuConverter implements Converter {
    public static void main(String[] args) {
        byte a = 127;
        int c = -1;
        System.out.println(Integer.toBinaryString(c));
        byte b = (byte) (a + 1);

        System.out.println(b);
    }

    @Override
    public boolean support(Class type) {
        return type == Stu.class;
    }

    @Override
    public Object convert(String str, Class type) {
        String[] split = str.split(",");
        Stu stu = new Stu();
        stu.setName(split[0]);
        stu.setAge(Integer.valueOf(split[1]));
        return stu;
    }
}
