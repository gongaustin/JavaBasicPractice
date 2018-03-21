package com.gongjun.test.正则表达式运用;


import org.junit.jupiter.api.Test;

/**
 * Created with IntelliJ IDEA
 * Description:
 * Author:GongJun
 * Date:2017/12/1
 * Time:15:15
 */
public class test {
    @Test
    public void trimString(){
        String s = "     5 4 6 5 4 7 5 b h y j h y t   ";
        System.out.println(s.length());
        /**
         * 去除两边的空格
         * */
        s = s.replaceAll("(^\\s*)|(\\s*$)","");
        System.out.println(s);
        /**
         * 去除所有的空格
         * */
        s = s.replaceAll(" ","");
        System.out.println(s);
    }
    @Test
    public void andMethod(){
        System.out.println(128 | 127);
    }
}
