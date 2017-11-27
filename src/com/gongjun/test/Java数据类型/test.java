package com.gongjun.test.Java数据类型;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA
 * Description:
 * Author:GongJun
 * Date:2017/9/7
 * Time:14:47
 * Chinawiserv Technologies Co., Ltd.
 */
public class test {
    //******************Java基本类型****************
    static int a;
    static boolean b;
    static short c;
    static char d;
    static double e;
    static float f;
    static long g;
    static byte h;
    //******************包装类型********************
    static Integer A;
    static Boolean B;
    static Short C;
    static Character D;
    static Double E;
    static Float F;
    static Long G;
    static Byte H;

    public static void main(String[] args) {

        Arrays.asList(a, b, c, d, e, f, g, h).stream().forEach(System.out::println);

        Arrays.asList(A, B, C, D, E, F, G, H).stream().forEach(System.out::println);

        h = 127;

        System.out.println(h);

        c = 1;

        //直接写成c=c+1是不能编译通过的，需要显示转换为short类型
        c = (short) (c + 1);

        c += 1;

        System.out.println(c);

    }
}
