package com.gongjun.test.JAVA的IO操作_内存操作流;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA
 * Description:
 * Author:GongJun
 * Date:2018/3/12
 * Time:17:14
 * Chinawiserv Technologies Co., Ltd.
 */
public class IoTest {
    public static void main(String args[]) {
        String str = "HELLOWORLD";        // 定义一个字符串，全部由大写字母组成
        ByteArrayInputStream bis;    // 内存输入流
        ByteArrayOutputStream bos;    // 内存输出流
        bis = new ByteArrayInputStream(str.getBytes());   // 向内存中输出内容，注意，没有跟文件读取一样，设置文件路径。
        bos = new ByteArrayOutputStream();    // 准备从内存ByteArrayInputStream中读取内容，注意，跟文件读取不一样，不要设置文件路径。
        int temp;
        while ((temp = bis.read()) != -1) {
            char c = (char) temp;   // 读取的数字变为字符
            System.out.print(temp+"-"+c+"\t");
            bos.write(Character.toLowerCase(c));   // 将字符变为小写
        }   // 所有的数据就全部都在ByteArrayOutputStream中
        System.out.println();
        String newStr = bos.toString();   // 因为所有output的数据都在ByteArrayOutputStream实例对象中，所以可以取出内容，将缓冲区内容转换为字符串。
        try {
            bis.close();
            bos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(newStr);
    }
}
