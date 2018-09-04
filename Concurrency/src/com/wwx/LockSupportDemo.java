package com.wwx;

import java.util.concurrent.locks.LockSupport;

/**
 * LockSupportDemo
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-04 13:39
 * @see
 **/
public class LockSupportDemo {
	public static void main(String[] args) {
		Thread thread = new Thread(() -> {
			LockSupport.park();
			System.out.println(Thread.currentThread().getName() + "被唤醒");
		});
		thread.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		LockSupport.unpark(thread);

	}
}
