package com.gongjun.test.March2018;

import org.junit.jupiter.api.Test;

/**
 * Created with IntelliJ IDEA
 * Description:
 * Author:GongJun
 * Date:2018/3/6
 * Time:15:02
 * Chinawiserv Technologies Co., Ltd.
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
}
