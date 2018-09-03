package com.wwx.BitSet;

import java.util.BitSet;

/**
 * BitSet 经常用于大规模数据的排重检查。
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-03 10:29
 * @see
 **/
public class BitSetDemo {
	public static void main(String[] args) {
		/**
		 * 默认的对象
		 */
		BitSet bitSet1 = new BitSet();
		/**
		 * 允许用户指定初始大小。所有位初始化为0。
		 */
		BitSet bitSet2 = new BitSet(5);
		BitSet bits1 = new BitSet(16);
		BitSet bits2 = new BitSet(16);

		// set some bits
		for(int i=0; i<16; i++) {
			if((i%2) == 0) {
				bits1.set(i);
			}
			if((i%5) != 0){
				bits2.set(i);
			}
		}
		System.out.println("Initial pattern in bits1: ");
		System.out.println(bits1);
		System.out.println("Initial pattern in bits2: ");
		System.out.println(bits2);

		// AND bits
		bits2.and(bits1);
		System.out.println("\nbits2 AND bits1: ");
		System.out.println(bits2);

		// OR bits
		bits2.or(bits1);
		System.out.println("\nbits2 OR bits1: ");
		System.out.println(bits2);

		// XOR bits
		bits2.xor(bits1);
		System.out.println("\nbits2 XOR bits1: ");
		System.out.println(bits2);

	}

}
