package com.gongjun.test.面向切面的理解;

/**
 * Created with IntelliJ IDEA
 * Description:
 * Author:GongJun
 * Date:2018/3/16
 * Time:10:37
 */
//原始实现类
public class UserBeanImpl implements UserBean {
    private String user = null;

    public UserBeanImpl() {
    }

    public UserBeanImpl(String user) {
        this.user = user;
    }

    public String getUserName() {
        return user;
    }

    @Override
    public void getUser() {
        System.out.println("this is getUser() method!");
    }

    public void setUser(String user) {
        this.user = user;
        System.out.println("this is setUser() method!");
    }

    @Override
    public void addUser() {
        System.out.println("this is addUser() method!");
    }

    @Override
    public void updateUser() {
        System.out.println("this is updateUser() method!");
    }

    @Override
    public void deleteUser() {
        System.out.println("this is deleteUser() method!");
    }
}
