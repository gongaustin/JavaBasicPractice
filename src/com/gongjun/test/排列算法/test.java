package com.gongjun.test.排列算法;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA
 * Description:
 * Author:GongJun
 * Date:2018/1/19
 * Time:14:55
 */
public class test
{
    @Test
    public void arrange(){
        String[] arr = {"0","1","2","3","4","5","6","7","8","9"};
        Set<String> result = new HashSet<String>();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(j!=i)
                for (int k = 0; k < 10; k++) {
                    if(k!=j&&k!=i)
                    result.add(new StringBuffer(arr[i]).append(arr[j]).append(arr[k]).toString());
                }
            }
        }
        Arrays.asList(result).stream().forEach(System.out::println);
    }
}
