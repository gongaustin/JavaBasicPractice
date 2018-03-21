package com.gongjun.test.枚举练习;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA
 * Description:
 * Author:GongJun
 * Date:2018/3/7
 * Time:15:36
 */
public class EnumTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        switch (AttributeEnum.valueOf(s)) {
            case A:
                System.out.println(AttributeEnum.A.getValue());
                break;
            case B:
                System.out.println(AttributeEnum.B.getValue());
                break;
            case C:
                System.out.println(AttributeEnum.C.getValue());
                break;
            case D:
                System.out.println(AttributeEnum.D.getValue());
                break;
        }
    }
}
