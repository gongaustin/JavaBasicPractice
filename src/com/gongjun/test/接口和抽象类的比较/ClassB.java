package com.gongjun.test.接口和抽象类的比较;

/**
 * Created with IntelliJ IDEA
 * Description:
 * Author:GongJun
 * Date:2018/3/12
 * Time:9:42
 */
/**
 * 抽象类可以实现接口，也可以继承抽象类
 * */
public abstract class ClassB extends ClassA implements InterfaceA{
    @Override
    public String singging() {
        return "singing";
    }

}
