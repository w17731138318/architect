package com.wwx;

import java.util.concurrent.locks.ReentrantLock;

/**
 * LockDemo
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-04 11:15
 * @see
 **/
public class LockDemo {
	private static ReentrantLock lock = new ReentrantLock();

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			Thread thread = new Thread(() -> {
				lock.lock();
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					lock.unlock();
				}
			});
			thread.start();
		}
	}
}
