package com.wwx.BitSet;

import java.util.BitSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.lang.String.format;

/**
 * BitSet 经常用于大规模数据的排重检查。
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-03 10:29
 * @see
 **/
public class BitSetDemo1 {
	public static void main(String[] args) {
//		ExecutorService executorService = Executors.newSingleThreadExecutor();
//		executorService.submit(new Runnable() {
//			@Override
//			public void run() {
//
//			}
//		});
		/**
		 * 允许用户指定初始大小。所有位初始化为0。
		 */


		BitSet a = new BitSet(20);
		BitSet b = new BitSet(20);
		a.set(1, 20+1);
		b.set(14,16);
		/**
		 * a-b
		 */
//		a.andNot(b);


		a.and(b);
		System.out.println(a);
		System.out.println(a.cardinality());
	}

}
