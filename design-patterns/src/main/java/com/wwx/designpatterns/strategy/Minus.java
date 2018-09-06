package com.wwx.designpatterns.strategy;

/**
 * Plus
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-06 14:47
 * @see
 **/
public class Minus extends AbstractCalculator implements ICalculator {

	@Override
	public int calculate(String exp) {
		int arrayInt[] = split(exp,"\\-");
		return arrayInt[0]-arrayInt[1];
	}

}
