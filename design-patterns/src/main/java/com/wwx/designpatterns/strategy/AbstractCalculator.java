package com.wwx.designpatterns.strategy;

/**
 * AbstractCalculator
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-06 14:46
 * @see
 **/
public abstract class AbstractCalculator {
	public int[] split(String exp, String opt) {
		String[] array = exp.split(opt);
		int[] arrayInt = new int[2];
		arrayInt[0] = Integer.parseInt(array[0]);
		arrayInt[1] = Integer.parseInt(array[1]);
		return arrayInt;
	}
}
