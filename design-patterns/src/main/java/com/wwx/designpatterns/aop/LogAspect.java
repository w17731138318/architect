package com.wwx.designpatterns.aop;

import java.lang.annotation.*;

/**
 * LogAspect
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-06 18:09
 * @see
 **/
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LogAspect {
	String name() default "";
}
