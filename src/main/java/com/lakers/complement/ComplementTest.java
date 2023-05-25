package com.lakers.complement;

/**
 * Created on 2023/5/6 14:07
 *
 * @author lakers
 */
public class ComplementTest {

    public static void main(String[] args) {
        byte a = 64;
        byte b = (byte) (a << 1);
        System.out.println(b);

        byte c = 65;
        byte d = (byte) (c >> 1);
        System.out.println(d);

        byte e = -127;
        byte f = (byte) (e << 1);
        System.out.println(f);

        System.out.println(-6|3);

        System.out.println(-6 >>> 1);

        System.out.println(~-6);

        int i = tableSizeFor(5);
        System.out.println(i);
    }

    public static int tableSizeFor(int cap) {
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 :n + 1;
    }
}
