package com.java8.Concurrancy;

import javax.sound.midi.Soundbank;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class CountDownLatchExample {

    public static void main(String[] args) throws InterruptedException, BrokenBarrierException {
        //CountDownLatch can be used to implement multiple threads waiting for each other.
       // CountDownLatch once the count reaches zero while you can reuse CyclicBarrier by calling the reset() method which resets Barrier to its initial State

        // Let us create task that is going to
        // wait for four threads before it starts
        //When we create an object of CountDownLatch, we specify the number of threads it should wait for,
        // all such thread are required to do count down by calling CountDownLatch.countDown() once
        // they are completed or ready to the job. As soon as count reaches zero, the waiting task starts running.
        CountDownLatch latch = new CountDownLatch(4);

        // Let us create four worker
        // threads and start them.
        WorkerThread first = new WorkerThread(1000, latch,
                "WORKER-1");
        WorkerThread second = new WorkerThread(2000, latch,
                "WORKER-2");
        WorkerThread third = new WorkerThread(3000, latch,
                "WORKER-3");
        WorkerThread fourth = new WorkerThread(4000, latch,
                "WORKER-4");
        first.start();
        second.start();
        third.start();
        fourth.start();

       // cyclicBarrier.await();

        System.out.println("Cyclic barrier execution is completed :: ");
        // The main task waits for four threads
        latch.await();// All threads, which are waiting on await() proceed together once count down reaches to zero

        // Main thread has started
        System.out.println(Thread.currentThread().getName() +
                " has finished");


    }

}
