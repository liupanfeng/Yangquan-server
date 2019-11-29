package com.yangquan.utils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    private static ExecutorService fixedThreadPool = Executors.newCachedThreadPool(); 
    private static ExecutorService fixedThreadPool1;
    public static void run(Runnable command) {
        fixedThreadPool.execute(command);
    }

    static {
        int availProcessors = Runtime.getRuntime().availableProcessors();
        System.out.println("可用的cpu核心数" + availProcessors);
        fixedThreadPool1 = Executors.newFixedThreadPool(2*availProcessors +1);
    }
    public static void runInFixed(Runnable command) {
        fixedThreadPool1.execute(command);
    }
}
