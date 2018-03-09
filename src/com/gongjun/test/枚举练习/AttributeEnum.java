package com.gongjun.test.枚举练习;

/**
 * Created with IntelliJ IDEA
 * Description:
 * Author:GongJun
 * Date:2018/3/7
 * Time:15:37
 * Chinawiserv Technologies Co., Ltd.
 */
public enum AttributeEnum {
    A("A", "this is A"),
    B("B", "this is B"),
    C("C", "this is C"),
    D("D", "this is D");
    private String key;
    private String value;

    AttributeEnum(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }


}
