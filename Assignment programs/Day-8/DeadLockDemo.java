/* Example program for Deadlock 
 * 
 * Deadlock can occur in a situation when a thread is waiting 
 * for an object lock, that is acquired by another thread and 
 * second thread is waiting for an object lock that is acquired 
 * by first thread. Since, both threads are waiting for each 
 * other to release the lock, the condition is called deadlock.
 *  
 */
package com.onebill.corejava.multithread;

public class DeadLockDemo {
	public static Object Lock1 = new Object();
	public static Object Lock2 = new Object();

	static class Thread1 extends Thread {
		@Override
		public void run() {
			synchronized (Lock1) {
				System.out.println("Thread1 starting.....");
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					System.out.println("Exception Occurs");
				}
				System.out.println("Thread1 waiting.......");
				synchronized (Lock2) {
					System.out.println("Thread1 end");
				}
			}
		}
	}

	static class Thread2 extends Thread {
		@Override
		public void run() {
			synchronized (Lock2) {
				System.out.println("Thread2 Starting.......");
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					System.out.println("Exception Occurs");
				}
				System.out.println("Thread2 waiting.....");
				synchronized (Lock1) {
					System.out.println("Thread2 end");
				}
			}
		}
	}

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t1.start();
		t2.start();

	}

}
