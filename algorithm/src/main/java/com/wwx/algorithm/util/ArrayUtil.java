package com.wwx.algorithm.util;

/**
 * util
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-17 17:39
 * @see
 **/
public class ArrayUtil {
	/**
	 * 数组根据索引换位
	 * @param arr
	 * @param i
	 * @param j
	 */
	public static void swap(int[] arr, int i, int j) {
		int t = arr[i];
		arr[i] = arr[j];
		arr[j] = t;
	}
}
