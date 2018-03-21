package com.gongjun.test.计算圆周率;

/**
 * Created with IntelliJ IDEA
 * Description:
 * Author:GongJun
 * Date:2017/11/24
 * Time:17:46
 */
import java.util.Scanner;
public class Example {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入精度：");
        //精度说明eg:1e-15(精确到小数点后15位)
        double z=scan.nextDouble();
        System.out.println("在精度为"+z+"的条件下，π约等于：\n"+jishuPI(z));

    }
    static double jishuPI(double z){
        double sum=2;
        int n=1;
        int m=3;
        double t=2;
        while(t>z){
            t=t*n/m;
            sum=sum+t;
            n++;
            m+=2;
        }
        return sum;
    }

}