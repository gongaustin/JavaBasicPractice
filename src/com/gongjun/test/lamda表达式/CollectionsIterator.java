package com.gongjun.test.lamda表达式;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created with IntelliJ IDEA
 * Description:
 * Author:GongJun
 * Date:2017/11/13
 * Time:15:02
 */
public class CollectionsIterator {
    @Test
    public void test() {
        String[] arr = new String[]{"abc", null, "123", null, "456"};
        List<String> list = Arrays.asList(arr);
        System.out.println(list);
        /**
         * 满足条件的新list
         * */
        List<String> listOne = list.stream().filter(e -> e != null).collect(Collectors.toList());
        System.out.println(listOne);
        /**
         * 统计满足过滤条件的Count
         * */

        long a = list.stream().filter(e -> "abc".equals(e)).count();
        System.out.println(a);

        list.stream().forEach(e -> e = e + "abc");
        /**
         * 打印编辑后的list
         * */
        System.out.println("------------------------");
        System.out.println(list);
        /**
         * map方法和reduce方法
         * */
        list.stream().map(e -> e + "test").forEach(System.out::println);

        String s = list.stream().map(e -> e + "test").reduce((sum, e) -> sum + e).get();

        System.out.println("s:"+s);
        /**
         * 对String list操作
         * */
        List<String> Homelands = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada");

        String HomelandsString = Homelands.stream().map(e -> e.toUpperCase()).collect(Collectors.joining(","));

        System.out.println("HomelandsString:"+HomelandsString);
    }

    @Test
    public void TestOne() {
        System.out.println("32132");
    }
}
