package com.gongjun.test.反射调用;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA
 * Description:
 * Author:GongJun
 * Date:2017/11/6
 * Time:10:44
 * Chinawiserv Technologies Co., Ltd.
 */
public class Test {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("com.gongjun.test.反射调用.Person");
            Field[] fields = clazz.getDeclaredFields();
            for (int i = 0; i < fields.length; i++) {
                System.out.println(fields[i].getName());
            }
            System.out.println("------------------------------");
            Method[] methods = clazz.getDeclaredMethods();
            for (int i = 0; i < methods.length; i++) {
                System.out.println(methods[i].getName());
            }
            Constructor constructorOne = clazz.getDeclaredConstructor(String.class,Integer.class,String.class);
            Constructor constructorTwo = clazz.getDeclaredConstructor();
            Object instanceOne = constructorOne.newInstance("张三",22,"成都市");
            Object instanceTwo = constructorTwo.newInstance();
            Person person = (Person)instanceOne;
            System.out.println(person.getName());
            System.out.println(instanceTwo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
