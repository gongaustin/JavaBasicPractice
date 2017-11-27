package com.gongjun.test.判断回文数;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * Description:判断一个给定的五位数是否是回文数。例如12321是回文数
 * Author:GongJun
 * Date:2017/11/27
 * Time:10:37
 * Chinawiserv Technologies Co., Ltd.
 */

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字:");
        while (true) {
            String str = scanner.nextLine();
            if ("exit".equals(str)) return;
            char[] chars = str.toCharArray();
            boolean flag = false;
            for (int i = 0; i < chars.length / 2; i++) {
                if (chars[i] != chars[chars.length - 1 - i]) {
                    flag = false;
                    break;
                } else {
                    flag = true;
                }
            }
            if (flag) System.out.println(str + "是回文数");
            else System.out.println(str + "不是回文数");
        }
    }
}
