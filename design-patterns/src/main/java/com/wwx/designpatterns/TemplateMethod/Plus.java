package com.wwx.designpatterns.TemplateMethod;

/**
 * Plus
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-06 15:02
 * @see
 **/
public class Plus extends AbstractCalculator {

	@Override
	public int calculate(int num1, int num2) {
		return num1 + num2;
	}
}
