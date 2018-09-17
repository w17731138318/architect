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

	public static void sort(Comparable[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int minIndex = i;
			for (int j = i+1; j <n ; j++) {
				if( arr[j].compareTo( arr[minIndex] ) < 0 ){
					minIndex = j;
				}
			}
			ArrayUtil.swap(arr , i , minIndex);
		}
	}
	public static void main(String[] args) {
		/**
		 * 测试排序算法辅助函数
		 */
		int N = 20000;
		Integer[] arr = ArrayUtil.generateRandomArray(N, 0, 100000);
		ArrayUtil.testSort("com.wwx.algorithm.ASortingBasic.SelectionSort", arr);

		Student[] d = new Student[4];
		d[0] = new Student("D",90);
		d[1] = new Student("C",100);
		d[2] = new Student("B",95);
		d[3] = new Student("A",95);
		SelectionSort.sort(d);
		for( int i = 0 ; i < d.length ; i ++ )
			System.out.println(d[i]);
	}
}
