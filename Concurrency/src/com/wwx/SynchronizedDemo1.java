package com.wwx;

/**
 * SynchronizedDemo1
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-04 9:48
 * @see
 **/
public class SynchronizedDemo1 implements Runnable {
	private static int count = 0;
	private SynchronizedDemo1(){}
	public static SynchronizedDemo1 getInstance(){
		return Singleton.INSTANCE.getInstance();
	}
	@Override
	public void run() {
		for (int i = 0; i < 1000000; i++) {
			count++;
		}
	}

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
//			Thread thread = new Thread(new SynchronizedDemo1());
			Thread thread = new Thread(SynchronizedDemo1.getInstance());
			thread.start();
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("result: " + count);
	}
	private static enum Singleton{
		INSTANCE;

		private SynchronizedDemo1 singleton;
		//JVM会保证此方法绝对只调用一次
		private Singleton(){
			singleton = new SynchronizedDemo1();
		}
		public SynchronizedDemo1 getInstance(){
			return singleton;
		}
	}

}
