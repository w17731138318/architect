package com.wwx.designpatterns.demo;

import com.wwx.designpatterns.TemplateMethod.AbstractCalculator;
import com.wwx.designpatterns.TemplateMethod.Minus;
import com.wwx.designpatterns.TemplateMethod.Plus;
import org.junit.Test;

/**
 * TemplateMethod
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-06 15:02
 * @see
 **/
public class TemplateMethodTest {
	@Test
	public void test(){
		String exp = "2+8";
		AbstractCalculator cal = new Plus();
		int result = cal.calculate(exp, "\\+");
		System.out.println(result);

		String exp1 = "2-8";
		AbstractCalculator cal1 = new Minus();
		int result1 = cal1.calculate(exp1, "\\-");
		System.out.println(result1);
	}
}
