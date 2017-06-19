package com.sy1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
//单个线程的线程池，即线程池中每次只有一个线程工作，单线程串行执行任务
public class TestSingleThreadExecutor {
    public static void main(String[] args) {
        //创建一个可重用固定线程数的线程池
        ExecutorService pool = Executors. newSingleThreadExecutor();
        //创建实现了Runnable接口对象
        Thread tt1 = new MyThread();
        Thread tt2 = new MyThread();
        Thread tt3 = new MyThread();
        Thread tt4 = new MyThread();
        Thread tt5 = new MyThread();
        //将线程放入池中并执行
        pool.execute(tt1);
        pool.execute(tt2);
        pool.execute(tt3);
        pool.execute(tt4);
        pool.execute(tt5);
        //关闭
        pool.shutdown();
    }
}
