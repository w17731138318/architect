package com.wwx.queue;

import java.util.LinkedList;
import java.util.concurrent.*;

/**
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-08-31 19:25
 * @see
 **/
public class LinkedListDemo {
	/**
	 * CAS的全称是Compare And Swap 即比较交换，其算法核心思想如下
	 		执行函数：CAS(V,E,N)
	 		其包含3个参数
			 V表示要更新的变量
			 E表示预期值
			 N表示新值
	 */
//	private static ConcurrentLinkedQueue  linkedList = new ConcurrentLinkedQueue ();
	private static LinkedList  linkedList = new LinkedList ();

	// 请求总数
	public static int clientTotal = 5000;

	// 同时并发执行的线程数
	public static int threadTotal = 200;
	static {
		for (int i = 0; i < 5000; i++) {
			linkedList.add(i);
		}
		System.out.println(linkedList.size());
	}
	public static void test() throws InterruptedException {

		ExecutorService executorService = Executors.newCachedThreadPool();
		final Semaphore semaphore = new Semaphore(threadTotal);
		final CountDownLatch countDownLatch = new CountDownLatch(clientTotal);
		for (int i = 0; i < clientTotal; i++) {
			final int count = i;
			executorService.execute(() -> {
				try {
					semaphore.acquire();
					linkedList.poll();
					semaphore.release();
				} catch (Exception e) {
					System.out.println(e);
				}
				countDownLatch.countDown();
			});
		}
		countDownLatch.await();
		executorService.shutdown();
		System.out.println(linkedList.size());

	}

	public static void main(String[] args) throws InterruptedException {

		test();
	}
}
