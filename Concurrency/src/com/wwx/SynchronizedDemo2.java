package com.wwx;

/**
 * SynchronizedDemo1
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-04 9:48
 * @see
 **/
public class SynchronizedDemo2 implements Runnable {
	private static int count = 0;
	@Override
	public void run() {
		synchronized(SynchronizedDemo2.class){
			for (int i = 0; i < 10000; i++){
				count++;
			}
		}
	}
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread(new SynchronizedDemo2());
			thread.start();
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("result: " + count);
	}

}
