package com.onebill.corejava.multithread;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

class Producer implements Runnable{
	private Queue<Integer> queue;
	private int size;
	public Producer(Queue<Integer> queue, int size) {
		super();
		this.queue = queue;
		this.size = size;
	}
	@Override
	public void run() {
		while(true) {
			synchronized (queue) {
				while(queue.size()==size) {
					try {
						System.out.println("\nStorage is full, Producer thread waiting...Consumer get product from storage\n");
						queue.wait();
					}catch(Exception e){
						System.out.println("Exception occur in Producer Thread");
					}
				}
				try {
					Thread.sleep(1000);
					Random ran = new Random();
					int i = ran.nextInt();
					System.out.println("Producer put : "+i);
					queue.add(i);
					queue.notifyAll();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

class Consumer implements Runnable{
	private Queue<Integer> queue;
	private int size;
	public Consumer(Queue<Integer> queue, int size) {
		super();
		this.queue = queue;
		this.size = size;
	}
	@Override
	public void run() {
		while(true) {
			synchronized (queue) {
				while(queue.isEmpty()) {
					System.out.println("\nStorage is empty, Consumer waiting...Producer put product in storage\n");
					try {
						queue.wait();
					}catch(Exception e) {
						System.out.println("Exception occur in Consumer Thread");
					}
				}
				try {
					Thread.sleep(1000);
					System.out.println("Consumer get : "+queue.remove());
					queue.notifyAll();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		}
	}
}

public class ProducerConsumerProblem {

	public static void main(String[] args) {
		Queue<Integer> Storage = new LinkedList<>();
		int size = 5;
		
		Producer producer = new Producer(Storage, size);
		Consumer consumer = new Consumer(Storage, size);
		
		Thread producerThread = new Thread(producer);
		Thread consumerThread = new Thread(consumer);
		
		producerThread.start();
		consumerThread.start();
	}

}
