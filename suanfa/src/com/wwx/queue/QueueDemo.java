package com.wwx.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.*;

/**
 * Queue： 基本上，一个队列就是一个先入先出（FIFO）的数据结构
 * Queue接口与List、Set同一级别，都是继承了Collection接口。LinkedList实现了Deque接 口。
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-08-31 18:46
 * @see
 **/
public class QueueDemo {
	/**
	 * 　内置的不阻塞队列： PriorityQueue 和 ConcurrentLinkedQueue
	 *　　PriorityQueue 和 ConcurrentLinkedQueue 类在 Collection Framework 中加入两个具体集合实现。
	 *　　PriorityQueue 类实质上维护了一个有序列表。加入到 Queue 中的元素根据它们的天然排序（通过其 java.util.Comparable 实现）
	 *    或者根据传递给构造函数的 java.util.Comparator 实现来定位。
	 *　　ConcurrentLinkedQueue 是基于链接节点的、线程安全的队列。并发访问不需要同步。因为它在队列的尾部添加元素并从头部删除它们，
	 *    所以只要不需要知道队列的大 小，ConcurrentLinkedQueue 对公共集合的共享访问就可以工作得很好。收集关于队列大小的信息会很慢，需要遍历队列。
	 */
	/**
	 * BlockingQueue 阻塞队列 poll和peek方法出错进返回null。因此，向队列中插入null值是不合法的
	 * 长度为3的BlockingQueue
	 *
	 * 　 add        增加一个元索            如果队列已满，则抛出一个IIIegaISlabEepeplian异常
	 *　　remove   移除并返回队列头部的元素    如果队列为空，则抛出一个NoSuchElementException异常
	 *　　element  返回队列头部的元素             如果队列为空，则抛出一个NoSuchElementException异常
	 *　　offer       添加一个元素并返回true       如果队列已满，则返回false
	 *　　poll         移除并返问队列头部的元素    如果队列为空，则返回null
	 *　　peek       返回队列头部的元素             如果队列为空，则返回null
	 *　　put         添加一个元素                      如果队列满，则阻塞
	 *　　take        移除并返回队列头部的元素     如果队列为空，则阻塞 (阻塞指的是暂停一个线程的执行以等待某个条件发生)
	 *
	 LinkedBlockingQueue的容量是没有上限的（说的不准确，在不指定时容量为Integer.MAX_VALUE，不要然的话在put时怎么会受阻呢），
	 但是也可以选择指定其最大容量，它是基于链表的队列，此队列按 FIFO（先进先出）排序元素。

	 ArrayBlockingQueue在构造时需要指定容量， 并可以选择是否需要公平性，如果公平参数被设置true，等待时间最长的线程会优先得到处
	 理（其实就是通过将ReentrantLock设置为true来 达到这种公平性的：即等待时间最长的线程会先操作）。通常，公平性会使你在性能上付
	 出代价，只有在的确非常需要的时候再使用它。它是基于数组的阻塞循环队 列，此队列按 FIFO（先进先出）原则对元素进行排序。

	 PriorityBlockingQueue是一个带优先级的 队列，而不是先进先出队列。元素按优先级顺序被移除，该队列也没有上限（看了一下源码，
	 PriorityBlockingQueue是对 PriorityQueue的再次包装，是基于堆数据结构的，而PriorityQueue是没有容量限制的，与ArrayList一样，
	 所以在优先阻塞 队列上put时是不会受阻的。虽然此队列逻辑上是无界的，但是由于资源被耗尽，所以试图执行添加操作可能会导致 OutOfMemoryError），
	 但是如果队列为空，那么取元素的操作take就会阻塞，所以它的检索操作take是受阻的。另外，往入该队列中的元 素要具有比较能力。

	 DelayQueue（基于PriorityQueue来实现的）是一个存放Delayed 元素的无界阻塞队列，只有在延迟期满时才能从中提取元素。
	 该队列的头部是延迟期满后保存时间最长的 Delayed 元素。如果延迟都还没有期满，则队列没有头部，并且poll将返回null。
	 当一个元素的 getDelay(TimeUnit.NANOSECONDS) 方法返回一个小于或等于零的值时，则出现期满，poll就以移除这个元素了。此队列不允许使用 null 元素。
	 */
	private BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<String>(3);

	/**
	 * 添加消息到队列中
	 * @throws InterruptedException
	 */
	public void produce() throws InterruptedException{
		// put方法放入一个苹果，若队列满了，等到队列有位置
		blockingQueue.put("An apple");
	}

	/**
	 * 消费队列中的消息，从队列中取走
	 * @return
	 * @throws InterruptedException
	 */
	public String consume() throws InterruptedException{
		// get方法取出一个苹果，若basket为空，等到basket有苹果为止
		String apple = blockingQueue.take();
		return apple;
	}

	/**
	 * 获取队列长度
	 * @return
	 */
	public int getAppleNumber(){
		return blockingQueue.size();
	}
	/**
	 * 非阻塞队列
	 */
	public static void testBasket() throws InterruptedException {
		// 建立一个装苹果的篮子
		final QueueDemo queueDemo = new QueueDemo();
		// 定义苹果生产者
		class Producer implements Runnable {
			@Override
			public void run() {
				try {
					while (true) {
						// 生产苹果
						System.out.println("生产者准备生产苹果："
								+ System.currentTimeMillis());
						queueDemo.produce();
						System.out.println("生产者生产苹果完毕："
								+ System.currentTimeMillis());
						System.out.println("生产完后有苹果："+queueDemo.getAppleNumber()+"个");
						// 休眠300ms
						Thread.sleep(300);
					}
				} catch (InterruptedException ex) {
				}
			}
		}
		// 定义苹果消费者
		class Consumer implements Runnable {

			@Override
			public void run() {
				try {
					while (true) {
						// 消费苹果
						System.out.println("消费者准备消费苹果："
								+ System.currentTimeMillis());
						queueDemo.consume();
						System.out.println("消费者消费苹果完毕："
								+ System.currentTimeMillis());
						System.out.println("消费完后有苹果："+queueDemo.getAppleNumber()+"个");
						// 休眠1000ms
						Thread.sleep(1000);
					}
				} catch (InterruptedException ex) {
				}
			}
		}

		ExecutorService service = Executors.newCachedThreadPool();
		Producer producer = new Producer();
		Consumer consumer = new Consumer();
		service.submit(producer);
		service.submit(consumer);
		// 程序运行10s后，所有任务停止
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
		}
		service.shutdownNow();
	}
	public static void main(String[] args) throws InterruptedException {
		testBasket();
	}

}
