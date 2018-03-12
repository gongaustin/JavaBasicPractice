package com.gongjun.test.接口和抽象类的比较;

/**
 * Created with IntelliJ IDEA
 * Description:
 * Author:GongJun
 * Date:2018/3/12
 * Time:9:41
 * Chinawiserv Technologies Co., Ltd.
 */
/**
 * 接口不能继承一般类
 * 因为接口中只能出现3种成员
 * 1.公共的静态常量(public final static )
 * 2.公共的抽象方法(public abstract )
 * 3.静态内部类(static class)
 * 而一个类中,就算什么都不写,也必须带一个构造方法,在extends时就会被子类继承,如果是接口也会继承这个构造方法,很明显构造方法不在上面三项之列
 * 而如果类中有一般的方法和成员变量,也会被子类全部继承,这些更不能出现在接口中了,所以接口是绝对不可能继承一个类的
 * */

/**
 * 接口不能实现接口，但是可以继承一个或多个接口
 * 所有的接口的成员变量默认都是:puiblic static final 的
 * 所有接口的方法默认都是：public abstract
 * */
public interface InterfaceA extends InterfaceB,InterfaceC{
    int a = 2; //必须赋值，接口所有成员变量都是puiblic static final的
    String singging();
}
