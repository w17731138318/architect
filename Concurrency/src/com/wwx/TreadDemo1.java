package com.wwx;

import java.util.concurrent.*;

public class TreadDemo1 extends Thread {
    @Override
    public void run() {
        System.out.println("继承Thread");
        System.out.println(Thread.currentThread().getName());
        super.run();
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println("继承Thread");
                super.run();
            }
        };
        thread.start();
        Thread runnable = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable 接口");
            }
        });
        runnable.start();
        TimeUnit.SECONDS.sleep(1L);
        System.out.println(thread.isAlive());
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> future = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "Callable";
            }
        });
        try {
            String result = future.get();
            System.out.println(result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        executorService.shutdown();
    }
}
