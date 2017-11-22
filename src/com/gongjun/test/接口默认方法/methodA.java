package com.gongjun.test.接口默认方法;

/**
 * Created with IntelliJ IDEA
 * Description:
 * Author:GongJun
 * Date:2017/8/11
 * Time:11:27
 * Chinawiserv Technologies Co., Ltd.
 */
public class methodA {
    public static void main(String[] args) {
        interfaceA a = new interfaceA() {
            @Override
            public int calc(int a) {
                return 1;
            }
        };
        /**
         * 接口interfaceA的扩展方法calcAdd需要重写
         * */
        int aa = a.calc(1);
        int bb = a.calcAdd(2);
        System.out.println(aa);
        System.out.println(bb);
    }
}
