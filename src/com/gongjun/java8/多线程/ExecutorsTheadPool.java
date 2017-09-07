package com.gongjun.java8.多线程;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created with IntelliJ IDEA
 * Description:
 * Author:GongJun
 * Date:2017/8/15
 * Time:14:38
 * Chinawiserv Technologies Co., Ltd.
 */
public class ExecutorsTheadPool {
    ExecutorService staticTheadPool = Executors.newFixedThreadPool(10);

    void executeMethod(){
        staticTheadPool.execute(new Runnable() {
            @Override
            public void run() {

                for (int i = 0; i < 100; i++) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("i="+i);
                }
            }
        });
        staticTheadPool.execute(new Runnable() {
            @Override
            public void run() {

                for (int j = 0; j < 100; j++) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("j="+j);
                }
            }
        });
        staticTheadPool.execute(new Runnable() {
            @Override
            public void run() {

                for (int k = 0; k < 100; k++) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("k="+k);
                }
            }
        });
        staticTheadPool.execute(new Runnable() {
            @Override
            public void run() {

                for (int l = 0; l < 100; l++) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("l="+l);
                }
            }
        });
    }

    public static void main(String[] args) {
        new ExecutorsTheadPool().executeMethod();
    }
}
