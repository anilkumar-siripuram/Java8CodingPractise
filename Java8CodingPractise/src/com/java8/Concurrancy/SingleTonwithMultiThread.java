package com.java8.Concurrancy;

public class SingleTonwithMultiThread {

    private static volatile SingleTonwithMultiThread ex ;

    private SingleTonwithMultiThread(){

    }

    public static SingleTonwithMultiThread getInstance(){
        if(ex==null){
            synchronized (SingleTonwithMultiThread.class){
                if(ex==null){
                    ex = new SingleTonwithMultiThread();
                }
            }
        }
        return ex;
    }

    public static void main(String[] args) {

        SingleTonwithMultiThread singleTonwithMultiThread = SingleTonwithMultiThread.getInstance();
        SingleTonwithMultiThread singleTonwithMultiThread1 = SingleTonwithMultiThread.getInstance();
        if(singleTonwithMultiThread == singleTonwithMultiThread1){
            System.out.println(" both memory locations are same :: ");
        }
    }
}
