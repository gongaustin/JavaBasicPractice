package com.gongjun.test.面向切面的理解;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Proxy;

/**
 * Created with IntelliJ IDEA
 * Description:
 * Author:GongJun
 * Date:2018/3/16
 * Time:10:42
 * Chinawiserv Technologies Co., Ltd.
 */
//测试类
public class AOPTest {

    @Test
    public void one(){
        System.out.println("Proved.............");
        UserBeanImpl targetObject = new UserBeanImpl("Austin Gong");
        UserBeanProxy proxy = new UserBeanProxy(targetObject);
        //生成代理对象
        UserBean object = (UserBean)Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),
                targetObject.getClass().getInterfaces(), proxy);
        object.addUser();

        System.out.println("NO Proved.............");
        targetObject = new UserBeanImpl();
        proxy = new UserBeanProxy(targetObject);
        //生成代理对象
        object = (UserBean) Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),
                targetObject.getClass().getInterfaces(), proxy);
        object.addUser();
    }
}
