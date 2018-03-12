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
 * 抽象类可以继承实体类，但是实体类必须有明确的构造函数，Java的Object实体类被多个抽象类继承
 * */
public abstract class ClassA extends ClassD{
     abstract String doing();
}
