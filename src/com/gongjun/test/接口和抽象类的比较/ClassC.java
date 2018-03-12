package com.gongjun.test.接口和抽象类的比较;

/**
 * Created with IntelliJ IDEA
 * Description:
 * Author:GongJun
 * Date:2018/3/12
 * Time:9:55
 * Chinawiserv Technologies Co., Ltd.
 */
/**
 * 单继承，多实现
 * */
public class ClassC extends ClassA implements InterfaceA,InterfaceB{
    public String getting(){
     return "getting";
    }

    @Override
    String doing() {
        return null;
    }

    @Override
    public String singging() {
        return null;
    }

    @Override
    public String runing() {
        return null;
    }

    @Override
    public String posting() {
        return null;
    }
}
