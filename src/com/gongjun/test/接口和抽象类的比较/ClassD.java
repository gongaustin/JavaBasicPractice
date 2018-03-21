package com.gongjun.test.接口和抽象类的比较;

import org.junit.jupiter.api.Test;

/**
 * Created with IntelliJ IDEA
 * Description:
 * Author:GongJun
 * Date:2018/3/12
 * Time:10:04
 */
public class ClassD {
    String a = "a";
    String b = "b";
    Character c = 'a';
    public String riding(){
        return "riding";
    }
    @Test
    void test(){
        System.out.println(c instanceof Character);
    }
}
