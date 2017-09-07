package com.gongjun.java8.控制反转理解;

/**
 * Created with IntelliJ IDEA
 * Description:
 * Author:GongJun
 * Date:2017/8/15
 * Time:11:07
 * Chinawiserv Technologies Co., Ltd.
 */
public class ClassA {
    InterfaceA a;
    ClassA(){

    }
    InterfaceA AMethod(){
        return new InterfaceAImp();
    }

    void BMethod(){
        a = AMethod();
        a.sing();
    }

    public static void main(String[] args) {
        new ClassA().BMethod();
    }
}
