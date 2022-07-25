package com.java8.Concurrancy;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class FutureDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //No Proper Exception handling mechanism
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Future<List<Integer>> future = executorService.submit(() -> {
            //ApiCall it will be delay of 1 min for each request processing
            System.out.println("Thread"+Thread.currentThread().getName());
            delay(1);
            //System.out.println(10/0);// it will through the exception and we don't have the proper handling mechanism for this
            return Arrays.asList(1, 2, 3, 4, 5, 6);
        });

        Future<List<Integer>> future2 = executorService.submit(() -> {
            //ApiCall it will be delay of 1 min for each request processing
            System.out.println("Thread"+Thread.currentThread().getName());
            delay(1);
            return Arrays.asList(1, 2, 3, 4, 5, 6);
        });

        Future<List<Integer>> future3 = executorService.submit(() -> {
            //ApiCall it will be delay of 1 min for each request processing
            System.out.println("Thread"+Thread.currentThread().getName());
            delay(1);
            return Arrays.asList(1, 2, 3, 4, 5, 6);
        });

    // here we don't have the method to complete the execution forcebily.
        //we have to wait for the thread to complete the task it is blocking code
        List<Integer> list = future.get();
        System.out.println(list);
      //  future2.future3 Multiple future objects can't be chanined together

    }

    private static void delay(int min) throws InterruptedException {
        try{
            TimeUnit.MINUTES.sleep(min);
        }catch (Exception e){
            System.out.println("exception ::"+e);
        }
    }
}
