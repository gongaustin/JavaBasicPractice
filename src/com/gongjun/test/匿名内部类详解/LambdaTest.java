package com.gongjun.test.匿名内部类详解;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created with IntelliJ IDEA
 * Description:
 * Author:GongJun
 * Date:2018/3/13
 * Time:15:37
 */
public class LambdaTest {

    @Test
    public void one() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread is running!");
            }
        }).start();
    }
    /**
     * 使用lambda表达式简化
     * */
    @Test
    public void two() {
        new Thread(
                () -> System.out.println("Thread is running!")
        ).start();
    }

    /**
     * ------------------------------------------华丽分割线------------------------------------------
     * */

    /**
     * 通过内部类重载了Comparator接口的compare()方法，实现比较逻辑
     * */
    @Test
    public void three(){
        // JDK7 匿名内部类写法
        List<String> list = Arrays.asList("I", "love", "you", "too");
        Collections.sort(list, new Comparator<String>(){// 接口名
            @Override
            public int compare(String s1, String s2){// 方法名
                if(s1 == null)
                    return -1;
                if(s2 == null)
                    return 1;
                return s1.length()-s2.length();
            }
        });
        System.out.println(list);
    }

    /**
     * 使用lambda表达式简化
     * */
    @Test
    public void four(){
        List<String> list = Arrays.asList("I", "love", "you", "too");
        Collections.sort(list,(s1,s2)->{
            if(s1 == null)
                return -1;
            if(s2 == null)
                return 1;
            return s1.length()-s2.length();
        });
        System.out.println(list);
    }

}
