package com.java8.Concurrancy;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class OnlywithThreads {
    public static void main(String[] args) throws InterruptedException, BrokenBarrierException {
        // Let us create task that is going to
        // wait for four threads before it starts
       // CountDownLatch latch = new CountDownLatch(4);
        CyclicBarrier barrier = new CyclicBarrier(4);

        // Let us create four worker
        // threads and start them.
        WorkerThreadWithOutLatch first = new WorkerThreadWithOutLatch(1000,barrier,
                "WORKER-1");
        WorkerThreadWithOutLatch second = new WorkerThreadWithOutLatch(2000,barrier,
                "WORKER-2");

        first.start();
        second.start();

        // The main task waits for four threads
        barrier.await();

        // Main thread has started
        System.out.println(Thread.currentThread().getName() +
                " has finished");
    }
}
