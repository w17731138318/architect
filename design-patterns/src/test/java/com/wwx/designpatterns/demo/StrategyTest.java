package com.wwx.designpatterns.demo;

import com.wwx.designpatterns.strategy.ICalculator;
import com.wwx.designpatterns.strategy.Minus;
import com.wwx.designpatterns.strategy.Multiply;
import com.wwx.designpatterns.strategy.Plus;
import org.junit.Test;

/**
 * StrategyTest
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-06 14:49
 * @see
 **/
public class StrategyTest {
	@Test
	public  void test() {
		String exp = "2+8";
		ICalculator cal = new Plus();
		int result = cal.calculate(exp);
		System.out.println(result);

		String exp1 = "2-8";
		ICalculator cal1 = new Minus();
		int result1 = cal1.calculate(exp1);
		System.out.println(result1);

		String exp2 = "2*8";
		ICalculator cal2 = new Multiply();
		int result2 = cal2.calculate(exp2);
		System.out.println(result2);
	}
}
