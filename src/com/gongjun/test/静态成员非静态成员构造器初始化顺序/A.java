package com.gongjun.test.静态成员非静态成员构造器初始化顺序;

/**
 * Created with IntelliJ IDEA
 * Description:
 * Author:GongJun
 * Date:2018/3/13
 * Time:16:14
 * Chinawiserv Technologies Co., Ltd.
 */
public class A {
    static {
        System.out.println("1");
    }
    public A(){
        System.out.println("2");
    }
}
