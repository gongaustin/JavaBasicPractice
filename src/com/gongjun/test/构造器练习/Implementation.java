package com.gongjun.test.构造器练习;

import org.junit.jupiter.api.Test;

/**
 * Created with IntelliJ IDEA
 * Description:
 * Author:GongJun
 * Date:2018/3/7
 * Time:16:10
 */
public class Implementation extends Constructor{
    /**
     * 编译报错，构造器不能重写，只能重载
     * */
    public Implementation(int a, int b) {
        super(a, b);
    }

}
