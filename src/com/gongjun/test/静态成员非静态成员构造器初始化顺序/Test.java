package com.gongjun.test.静态成员非静态成员构造器初始化顺序;

/**
 * Created with IntelliJ IDEA
 * Description:
 * Author:GongJun
 * Date:2018/3/13
 * Time:16:16
 */
public class Test {

    public static void main(String[] args) {
        A aa = new B(); //子类的对象指向父类的引用
        aa = new B();
    }
}
