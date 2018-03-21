package com.gongjun.test.Java序列化与反序列化;

/**
 * Created with IntelliJ IDEA
 * Description:
 * Author:GongJun
 * Date:2018/3/16
 * Time:16:17
 */

import org.junit.jupiter.api.Test;
import sun.misc.IOUtils;

import java.io.*;
import java.util.UUID;

/**
 * 序列化Demo
 * */
public class SerializableDemo {
    @Test
    public void test() throws IOException {
        User user = new User();
        user.setId(UUID.randomUUID().toString().replace("-",""));
        user.setAddr("chengdu");
        user.setName("ausitn");
        user.setAge(18);
        System.out.println(user);
        //Write Obj to File
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("D:/tempFile"));
            oos.writeObject(user);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(null != oos) oos.close();
        }

        //Read Obj from File
        File file = new File("D:/tempFile");
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(file));
            User newUser = (User) ois.readObject();
            System.out.println(newUser);
            System.out.println(newUser.getSerialVersionUID());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(null != ois) ois.close();
            file.delete();
        }

    }
}
