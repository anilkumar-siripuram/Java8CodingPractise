package com.java8.Concurrancy;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureDemo {

    //if we want asychronus programming we can go with completable future.
    //using asynchronus programming you can write the non-blocking code where concurrently you can run
    // n no of threads without blocking the main thread.
    // when task completes it notifies the main thread about the execution status.
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //Run Aysnc() :: if you want to run some aysnchronus task with out returning anything from that then use
        //CompletableFuture.runAsync(Runnable)  CompletableFuture.runAsync(Runnable,executor)
        //if we are not passing executor it will pick the threads from forkJoin thread pool
        // supplyAsync() :: if you want to run some aysnchronus task and expecting returning anything from that then use
        //CompletableFuture.supplyAsync(Supplier)  and CompletableFuture.supplyAsync(Supplier,executor)
        CompletableFuture<String> completableFuture = new CompletableFuture<>();
        completableFuture.get();
        completableFuture.complete("return some dummy response"); //forcebily we can complete the execution incase of
        //long running threads
      //  CompletableFuture.supplyAsync()

        //completableFuture.allOf();

    }
}
