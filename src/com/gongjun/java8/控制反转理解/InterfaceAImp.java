package com.gongjun.java8.控制反转理解;

/**
 * Created with IntelliJ IDEA
 * Description:
 * Author:GongJun
 * Date:2017/8/15
 * Time:11:08
 * Chinawiserv Technologies Co., Ltd.
 */
public class InterfaceAImp implements InterfaceA {
    @Override
    public void sing() {
        System.out.println("I'm singing");
    }
}
