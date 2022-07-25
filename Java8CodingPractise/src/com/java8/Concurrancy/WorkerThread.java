package com.java8.Concurrancy;

import java.util.concurrent.CountDownLatch;

public class WorkerThread extends  Thread{
    private int delay;
    private CountDownLatch latch;
    WorkerThread(int delay,CountDownLatch latch,String name){
    super(name);
    this.delay=delay;
    this.latch=latch;
    }

    WorkerThread(int delay,String name){
        super(name);
        this.delay=delay;

    }


    @Override
    public void run(){
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("current thread :: "+Thread.currentThread().getName());
      //  latch.countDown();
    }
}
