package com.wwx;

/**
 * SynchronizedDemo
 *
 * @author wwx
 * @version 0.1v
 * @create 2018-09-04 9:25
 * @see
 **/
public class SynchronizedDemo {
	public static void main(String[] args) {
		synchronized (SynchronizedDemo.class) {
		}
		method();
	}

	private static void method() {
	}
}
