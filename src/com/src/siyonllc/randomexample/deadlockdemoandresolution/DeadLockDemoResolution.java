/**
 * 
 */
package com.src.siyonllc.randomexample.deadlockdemoandresolution;

/**
 * @author Rakesh Rai
 * 
 *         Let's change the order of the lock and run of the same program to see
 *         if both the threads still wait for each other
 */
public class DeadLockDemoResolution {

	public static Object Lock1 = new Object();
	public static Object Lock2 = new Object();

	public static void main(String args[]) {
		ThreadDemo1 T1 = new ThreadDemo1();
		ThreadDemo2 T2 = new ThreadDemo2();
		T1.start();
		T2.start();
	}

	private static class ThreadDemo1 extends Thread {
		public void run() {
			synchronized (Lock1) {
				System.out.println("Thread 1: Holding lock 1...");

				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
				}
				System.out.println("Thread 1: Waiting for lock 2...");

				synchronized (Lock2) {
					System.out.println("Thread 1: Holding lock 1 & 2...");
				}
			}
		}
	}

	private static class ThreadDemo2 extends Thread {
		public void run() {
			synchronized (Lock1) {
				System.out.println("Thread 2: Holding lock 1...");

				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
				}
				System.out.println("Thread 2: Waiting for lock 2...");

				synchronized (Lock2) {
					System.out.println("Thread 2: Holding lock 1 & 2...");
				}
			}
		}
	}
}

// So just changing the order of the locks prevent the program in going into a
// deadlock situation and completes with the following result
// output
// Thread 1: Holding lock 1...
// Thread 1: Waiting for lock 2...
// Thread 1: Holding lock 1 & 2...
// Thread 2: Holding lock 1...
// Thread 2: Waiting for lock 2...
// Thread 2: Holding lock 1 & 2...
