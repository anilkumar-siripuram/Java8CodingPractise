package com.java8.Concurrancy;

import java.util.concurrent.*;

public class CompletableFutureSupplyAsync {

    //
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        // submit it has return type
        //when you want to return something after the execution will go submit. else will go with execute.
        executorService.submit(()->{
            try {
                TimeUnit.MINUTES.sleep(1);
            }catch (Exception e){
                System.out.println("");
            }
        });
       // executorService.execute();

        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(()->{

            try{
                System.out.println("completableFuture :: before thread sleep :: ");
                TimeUnit.MICROSECONDS.sleep(5);
            }catch (Exception e){
                System.out.println("exception :: "+e.getMessage());
            }

            return "AnilKumar";
        }).thenApply(name ->{
            return "hello"+name;
        }).thenApply(greetings ->{
            return greetings+"from the Java coding";
        });

        CompletableFuture<String> greetingFuture = completableFuture.thenApply(name -> {
            return "Hello " + name;
        });

        CompletableFuture<String> completableFuture1 = CompletableFuture.supplyAsync(()->{
            try{
                System.out.println("Before thread :: sleep");
                TimeUnit.MINUTES.sleep(3);
                System.out.println("After thread :: sleep 3 Mins");
            }catch (Exception e){
                e.printStackTrace();
            }
            return "hello";
        });

        try{
            System.out.println("TimeUnits 3 before get completable ");
            completableFuture1.get(3,TimeUnit.MILLISECONDS);
            System.out.println("TimeUnits 3 After get completable ");
        }catch (Exception e){
            System.out.println("Exception :: 3 seconds");
            e.printStackTrace();
        }


        System.out.println(" .. "+greetingFuture.get());


    }
}
