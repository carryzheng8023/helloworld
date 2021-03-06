package com.zhengxin.concurrency.t4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author zhengxin
 * @date 2018-01-26 14:22:18
 */
public class MultiThreadMain {
    public static void main(String[] a){

        ExecutorService threadPool = Executors.newFixedThreadPool(20);

        for (int i=0; i<20; i++){
            threadPool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + " : " + Singleton3.getInstance());
                }
            });
        }

        threadPool.shutdown();


    }
}
