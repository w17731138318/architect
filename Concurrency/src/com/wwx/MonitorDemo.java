package com.wwx;

/**
 * MonitorDemo
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-04 9:31
 * @see
 **/
public class MonitorDemo {
	private int a = 0;

	public synchronized void writer() {     // 1
		a++;                                // 2
		System.out.println("1:" + a);
		
	}                                       // 3

	public synchronized void reader() {    // 4
		int i = a;                         // 5
		System.out.println("2:" + i);
	}                                        // 6

	public static void main(String[] args) {
		MonitorDemo monitorDemo = new MonitorDemo();

		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				monitorDemo.writer();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				monitorDemo.reader();
			}
		});
		thread1.start();
		thread2.start();

	}
}
