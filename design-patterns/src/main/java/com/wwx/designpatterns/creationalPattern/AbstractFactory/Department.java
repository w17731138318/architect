package com.wwx.designpatterns.creationalPattern.AbstractFactory;

import lombok.Data;

/**
 * Department
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-11 16:28
 * @see
 **/
@Data
public class Department {
	private String id;
	private String name;

	public Department(String id, String name) {
		this.id = id;
		this.name = name;
	}
}
