package com.wwx;

/**
 * SynchronizedDemo1
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-04 9:48
 * @see
 **/
public class VolatileDemo{
	private static volatile boolean isOver = false;

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				while (!isOver) {
					System.out.println(isOver);
				};
			}
		});
		thread.start();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		isOver = true;
		System.out.println(isOver);
	}

}
