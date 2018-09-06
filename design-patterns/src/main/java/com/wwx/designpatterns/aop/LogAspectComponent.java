package com.wwx.designpatterns.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;


/**
 * LogAspectComponent
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-06 18:11
 * @see
 **/
@Aspect
@Component
public class LogAspectComponent implements Ordered{
	@Pointcut("@annotation(com.wwx.designpatterns.aop.LogAspect)")
	public void LogAspectPointCut() {}
	@Before("LogAspectPointCut()")
	public void before(JoinPoint joinPoint) throws Throwable {

	}
	@AfterReturning(returning = "ret", pointcut = "LogAspectPointCut()")
	public void afterReturning(Object ret) throws Throwable {
		// 处理完请求，返回内容
		System.out.println("方法的返回值 : " + ret);
	}

	/**
	 * 后置异常通知
	 * @param jp
	 */
	@AfterThrowing("LogAspectPointCut()")
	public void afterThrowing(JoinPoint joinPoint){
		System.out.println("方法异常时执行.....");
	}

	/**
	 * 后置最终通知,final增强，不管是抛出异常或者正常退出都会执行
	 * @param jp
	 */
	@After("LogAspectPointCut()")
	public void after(JoinPoint joinPoint){
		System.out.println("方法最后执行.....");
	}

	/**
	 * 环绕通知,环绕增强，相当于MethodInterceptor
	 * @param pjp
	 * @return
	 */
	@Around("LogAspectPointCut()")
	public Object around(ProceedingJoinPoint pjp) {
		System.out.println("方法环绕start.....");
		try {
			Object o =  pjp.proceed();
			System.out.println("方法环绕proceed，结果是 :" + o);
			return o;
		} catch (Throwable e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int getOrder() {
		return 1;
	}
}
