package com.wwx;

/**
 * VolatileExample
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-04 10:38
 * @see
 **/
public class VolatileExample {
	private static volatile int counter = 0;

	public static synchronized void add() {
		counter++;
	}

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread(new Runnable() {
				@Override
				public void run() {
					for (int i = 0; i < 10000; i++) {
//						counter++;
						add();
					}
				}
			});
			thread.start();
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(counter);
	}
}
