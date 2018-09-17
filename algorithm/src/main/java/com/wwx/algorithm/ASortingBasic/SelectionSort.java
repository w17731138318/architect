package com.wwx.algorithm.ASortingBasic;

import com.wwx.algorithm.util.ArrayUtil;

/**
 * SelectionSort
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-17 17:51
 * @see
 **/
public class SelectionSort {
	private SelectionSort() {
	}

	public static void sort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int minIndex = i;
			for (int j = i+1; j <n ; j++) {
				if(arr[j]<arr[minIndex]){
					minIndex = j;
				}
			}
			ArrayUtil.swap(arr , i , minIndex);
		}
	}
	public static void main(String[] args) {
		int[] arr = {10,9,8,7,6,5,4,3,2,1};
		SelectionSort.sort(arr);
		for( int i = 0 ; i < arr.length ; i ++ ){
			System.out.print(arr[i]);
		}
	}
}
