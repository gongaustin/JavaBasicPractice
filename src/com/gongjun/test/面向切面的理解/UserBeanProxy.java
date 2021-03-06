package com.gongjun.test.面向切面的理解;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA
 * Description:
 * Author:GongJun
 * Date:2018/3/16
 * Time:10:40
 */
//代理类
public class UserBeanProxy implements InvocationHandler {
    private Object targetObject;

    public  UserBeanProxy(Object targetObject)
    {
        this.targetObject = targetObject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
    {
        UserBeanImpl userBean = (UserBeanImpl) targetObject;
        String userName = userBean.getUserName();
        Object result = null;

        //权限判断
        if(userName != null && !"".equals(userName))
        {
            result = method.invoke(targetObject, args);
        }

        return result;
    }
}
