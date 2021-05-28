/* Example program for Thread Pool
 * 
 * Java Thread pool represents a group of worker threads 
 * that are waiting for the job and reuse many times.
 * 
 * In case of thread pool, a group of fixed size threads are 
 * created. A thread from the thread pool is pulled out and 
 * assigned a job by the service provider. After completion 
 * of the job, thread is contained in the thread pool again.
 * 
 * Better performance It saves time because there is no need to 
 * create new thread.
 * 
 *  */
package com.onebill.corejava.multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadPoolWorker implements Runnable{
	private String msg;
	public ThreadPoolWorker(String msg) {
		this.msg = msg;
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"(Start) message = "+msg);
		try {
			Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("Exception Occur");
		}
		System.out.println(Thread.currentThread().getName()+"(End)");
	}
}
public class ThreadPool {

	public static void main(String[] args) {
		/* Create a pool of 4 threads for complete my all task */
		ExecutorService executor = Executors.newFixedThreadPool(4);
		for(int i=0;i<10;i++) {
		Runnable worker = new ThreadPoolWorker(""+i);
		executor.execute(worker);
		}
	}

}
