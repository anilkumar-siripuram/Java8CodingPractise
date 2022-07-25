package com.java8.Concurrancy;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class WorkerThreadWithOutLatch extends Thread{
    private int delay;
    private CyclicBarrier barrier;
    WorkerThreadWithOutLatch(int delay,CyclicBarrier barrier,String name){
        super(name);
        this.delay=delay;
        this.barrier=barrier;
    }

    WorkerThreadWithOutLatch(int delay,String name){
        super(name);
        this.delay=delay;

    }


    @Override
    public void run(){
        try {
            Thread.sleep(delay);
            barrier.await();
            System.out.println("current thread :: "+Thread.currentThread().getName());
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }

        //latch.countDown();
    }
}
