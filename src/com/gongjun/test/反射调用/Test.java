package com.gongjun.test.反射调用;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA
 * Description:
 * Author:GongJun
 * Date:2017/11/6
 * Time:10:44
 */
public class Test {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("com.gongjun.test.反射调用.Person");
            Field[] fields = clazz.getDeclaredFields();
            Arrays.stream(fields).forEach(field -> System.out.println("属性为："+field));
            System.out.println("------------------------------");
            Method[] methods = clazz.getDeclaredMethods();
            Arrays.stream(methods).forEach(method -> System.out.println("方法为："+method));
            Constructor constructorOne = clazz.getDeclaredConstructor(String.class,Integer.class,String.class);
            Constructor constructorTwo = clazz.getDeclaredConstructor();
            Object instanceOne = constructorOne.newInstance("张三",22,"成都市");
            Object instanceTwo = constructorTwo.newInstance();
            Person person = (Person)instanceOne;
            System.out.println(person.getName());
            ((Person)instanceTwo).setName("Lee");  //强制转换后赋值
            System.out.println(((Person)instanceTwo).getName());  //读取
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
