package com.java8.Concurrancy;


import java.util.SortedMap;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureRunAsync {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CompletableFuture<Void> completableFuture = CompletableFuture.runAsync(new Runnable() {
            @Override
            public void run() {
            try{
                System.out.println("before Thread");
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
                System.out.println("I'll run in a separate thread than the main thread.");
            }

        });

        CompletableFuture<Void> future = CompletableFuture.runAsync(()->{
            try{
                System.out.println("before future thread::  future ");
            Thread.sleep(10000);

            }catch (Exception e){
                System.out.println("Exception :: "+e.getMessage());
            }

        });
        future.get();
        completableFuture.get();


    }
}
