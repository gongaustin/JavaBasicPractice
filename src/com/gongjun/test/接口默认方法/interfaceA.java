package com.gongjun.test.接口默认方法;

/**
 * Created with IntelliJ IDEA
 * Description:
 * Author:GongJun
 * Date:2017/8/11
 * Time:11:24
 */
public interface interfaceA {
    int calc(int a);
    default int calcAdd(int b){
        return ++b;
    }
}
