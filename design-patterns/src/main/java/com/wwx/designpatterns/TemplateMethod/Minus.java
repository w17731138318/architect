package com.wwx.designpatterns.TemplateMethod;

/**
 * Minus
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-06 15:06
 * @see
 **/
public class Minus extends AbstractCalculator {
	@Override
	public int calculate(int num1, int num2) {
		return num1 - num2;
	}
}
