package com.gongjun.test.March2018;

import org.junit.jupiter.api.Test;

/**
 * Created with IntelliJ IDEA
 * Description:
 * Author:GongJun
 * Date:2018/3/6
 * Time:15:02
 */
public class March03 {
    @Test
    public void one(){
        int x=2,y=3;
        switch (x){
            default:
                y++;//此时y=4,但是没有break,程序会继续依次执行
            case 3:
                y++;
            case 4:
                y++;
        }
        System.out.println("y="+y);
    }

    @Test
    public void two(){
        int x=2,y=3;
        switch (x){
            case 3:
                y++;
            case 4:
                y++;
            default:
                y++;
        }
        System.out.println("y="+y);
    }

    @Test
    public void three(){
        int x=2,y=3;
        switch (x){
            case 3:
                y++;
                break;
            case 4:
                y++;
                break;
            default:
                y++;
                break;
        }
        System.out.println("y="+y);
    }

    @Test
    public void four(){
        for(int i = 1;i<=10;i++){
            if(i%3==0) continue;
            System.out.println("this is a test procedure");
        }
    }

    @Test
    public  void five(){
        int[] arr = new int[10];
        System.out.println(arr[1]);//输出为0
    }

    @Test
    public void six(){
        int i = 0,sum=0;
        while (i<=10){
            i++;
            if(i%2!=0) continue; //i为奇数就退出
            sum+=i;
        }
        System.out.println(sum);
    }

    @Test
    public void seven(){
        long time_1 = System.currentTimeMillis();
        /**
         * 如下这个时候JVM拼接字符串是当做StringBuffer处理的,效率由于StringBuffer
         * */
        String s = "this is a "+"test "+"program.";
        long time_2 = System.currentTimeMillis();
        System.out.println("time is:"+(time_2-time_1));
        StringBuffer ss = new StringBuffer("this is a ");
        ss.append("test ").append("program.");
        long time_3 = System.currentTimeMillis();
        System.out.println("time is:"+(time_3-time_2));
        /**
         *
         * */

    }

    @Test
    public void eight(){
        Integer a = new Integer(3);
        Integer b = 3;
        int c = 3;
        System.out.println(a==b);//对象做判断，a和b没有引用相同的对象
        System.out.println(a==c);//值做判断，Integer自动拆箱为int类型
        System.out.println(b==c);
        Integer f1 = 100, f2 = 100, f3 = 150, f4 = 150;
        System.out.println(f1 == f2);
        System.out.println(f3 == f4);
    }

    @Test
    public void nine(){
        int a=0,b=0;
        System.out.println((3<2)&&(++a==1)); //短路与，只要左边为false,右边就不运算了
        System.out.println(((3<2)&(++b==1))); //逻辑与，两边都要运算
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
