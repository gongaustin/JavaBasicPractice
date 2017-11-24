package com.gongjun.test.递归练习;
/**
 * Created with IntelliJ IDEA
 * Description:
 * Author:GongJun
 * Date:2017/9/6
 * Time:14:58
 * Chinawiserv Technologies Co., Ltd.
 */

/**
 * 解决 1 1 2 3 5 8 ... 第30个是多少？
 * 分析
 * 第： 1 2 3 4 5 6 7  8  9  ...
 * 结： 1 1 2 3 5 8 13 21 34 ...
 * 第一、二个数均为1，第三个数开始结果为前两个之和F(n-1)+F(n-2)
 */
public class test {
    public static void main(String[] args) {
        int i = foo(30);
        System.out.println(i);
    }

    public static int foo(int i) {
        switch (i) {
            case 1:
                return 1;
            case 2:
                return 1;
            default:
                return foo(i - 1) + foo(i - 2);
        }
    }
}
