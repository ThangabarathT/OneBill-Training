/* Example program for Thread Group 
 * 
 * Java provides a convenient way to group multiple threads 
 * in a single object. In such way, we can suspend, resume or 
 * interrupt group of threads by a single method call.
 * 
 * A ThreadGroup represents a set of threads. A thread group can 
 * also include the other thread group. The thread group creates 
 * a tree in which every thread group except the initial thread 
 * group has a parent. 
 * 
 * */
package com.onebill.corejava.multithread;

class Task1 extends Thread{
	public Task1(ThreadGroup thgroup, String name) {
		super(thgroup, name);
	}
	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName()+" is running");
			Thread.sleep(1000);
		}catch(Exception e) {
			System.out.println("Exception occur");
		}
	}
}
class Task2 extends Thread{
	public Task2(ThreadGroup thgroup, String name) {
		super(thgroup, name);
	}
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getName()+" is running");
			
		}catch(Exception e) {
			System.out.println("Exception occur");
		}
	}
}

public class ThreadGroupTest {

	public static void main(String[] args) {
		ThreadGroup group = new ThreadGroup("Parent Thread");
		new Task1(group, "One").start();
		new Task1(group, "Two").start();
		new Task2(group, "Three").start();
		new Task2(group, "Four").start();
		//System.out.println("No of active Threads is "+group.activeCount());
	}

}
