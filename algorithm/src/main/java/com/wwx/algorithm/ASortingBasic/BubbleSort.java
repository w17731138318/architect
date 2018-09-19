package com.wwx.algorithm.ASortingBasic;

import com.wwx.algorithm.util.ArrayUtil;

/**
 * BubbleSort
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-18 10:24
 * @see
 **/
public class BubbleSort {
	public static void sort(Comparable[] arr) {
		int n = arr.length;
		boolean swapped;
//		do{
//			swapped = false;
//			for (int i = 1; i < n; i++) {
//				if(arr[i-1].compareTo(arr[i])>0){
//					ArrayUtil.swap(arr,i-1,i);
//					swapped = true;
//				}
//			}
//			n--;
//		}while (swapped);
		int x;
		do {
			x = 0;
			for (int i = 1; i < n; i++) {
				if (arr[i - 1].compareTo(arr[i]) > 0) {
					ArrayUtil.swap(arr, i - 1, i);
					x = i;
				}
			}
			n = x;
		} while (x > 0);

	}

	public static void main(String[] args) {
		final Integer[] arr = ArrayUtil.generateRandomArray(10, 1, 20);
		ArrayUtil.testSort("com.wwx.algorithm.ASortingBasic.BubbleSort", arr);
		ArrayUtil.printArray(arr);
	}
}
