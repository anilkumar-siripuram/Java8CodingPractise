package com.java8.Streams;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchExample {

	public static void main(String[] args) {
		int length =10;
		CountDownLatch countDownLatch = new CountDownLatch(10);
		ExecutorService executor = Executors.newFixedThreadPool(length);
		
		try {
			countDownLatch.await();//after all the invocations count reaches to zero
			//countDownLatch.countDown() : Decrements the count of the latch, releasing all waiting threads if
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
