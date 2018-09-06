package com.wwx.designpatterns.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * DesignPatternsDemo
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-05 14:50
 * @see
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Slf4j
public class DesignPatternsDemo {
	/**
	 * name
	 */
	private String name;

	/**
	 * age
	 */
	private int age;
}
