package com.jala;

/**
 * @Description
 * @Author mr.wang
 * @Date 2024/7/6 10:10 上午
 * @Version 1.0
 */
public class ThreadTest {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello world");
            }
        }).start();
    }
}
