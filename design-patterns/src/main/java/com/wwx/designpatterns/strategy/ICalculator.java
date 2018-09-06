package com.wwx.designpatterns.strategy;

/**
 * 计算器
 */
public interface ICalculator {
	/**
	 * 计算
	 * @param exp
	 * @return
	 */
	public int calculate(String exp);
}
