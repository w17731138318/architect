package com.wwx;

/**
 * MutextDemo
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-04 11:05
 * @see
 **/
public class MutextDemo {
	private static Mutex mutex = new Mutex();

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			final int c = i;
			Thread thread = new Thread(() -> {
				mutex.lock();
				try {
					Thread.sleep(1000);
					System.out.println(Thread.currentThread().getName());
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					mutex.unlock();
				}
			});
			thread.start();
		}
	}
}
