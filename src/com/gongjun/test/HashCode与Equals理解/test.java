package com.gongjun.test.HashCode与Equals理解;

import org.junit.jupiter.api.Test;

/**
 * Created with IntelliJ IDEA
 * Description:
 * Author:GongJun
 * Date:2018/3/7
 * Time:17:52
 * Chinawiserv Technologies Co., Ltd.
 */
public class test {
    @Test
    public void one(){
        Integer a = new Integer(3);
        int b = 3;
        System.out.println(a.hashCode()==b);
    }
}
