package com.wwx.algorithm.ASortingBasic;

import com.wwx.algorithm.util.ArrayUtil;

import java.util.Arrays;

/**
 * Insertion-Sort
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-18 9:40
 * @see
 **/
public class InsertionSort {
	private InsertionSort() {
	}

	public static void sort(Comparable[] arr) {
		int n = arr.length;
		for (int i = 1; i < n; i++) {
//			for (int j = i; j > 0; j--) {
//				if (arr[j].compareTo(arr[j - 1]) < 0) {
//					ArrayUtil.swap(arr, j, j - 1);
//				}
//			}
//			for (int j = i; j > 0 && arr[j].compareTo(arr[j - 1]) < 0; j--) {
//				ArrayUtil.swap(arr, j, j - 1);
//			}

			Comparable e = arr[i];
			int j = i;
			for( ; j > 0 && arr[j-1].compareTo(e) > 0 ; j--){
				arr[j] = arr[j-1];
			}
			arr[j] = e;
		}
	}

	public static void main(String[] args) {
		int N = 20000;
		Integer[] arr = ArrayUtil.generateRandomArray(N, 0, 100);
		Integer[] arr1 = Arrays.copyOf(arr, arr.length);
		ArrayUtil.testSort("com.wwx.algorithm.ASortingBasic.InsertionSort", arr);
		ArrayUtil.testSort("com.wwx.algorithm.ASortingBasic.SelectionSort", arr1);
	}
}
