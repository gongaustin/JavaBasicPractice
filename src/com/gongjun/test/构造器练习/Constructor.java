package com.gongjun.test.构造器练习;

/**
 * Created with IntelliJ IDEA
 * Description:
 * Author:GongJun
 * Date:2018/3/7
 * Time:16:08
 * Chinawiserv Technologies Co., Ltd.
 */
public class Constructor {
    Constructor(int a,int b){
        System.out.println(a==b);
    }
    Constructor(int a,int b,int c){
        System.out.println((a+b)==c);
    }
}
