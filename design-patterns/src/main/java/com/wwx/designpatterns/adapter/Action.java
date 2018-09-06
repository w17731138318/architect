package com.wwx.designpatterns.adapter;

import lombok.Data;

import java.util.UUID;

/**
 * Action
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-06 15:26
 * @see
 **/
@Data
public class Action {
	private String id;
	private String name;
	private String clazz;
	private String method;

	public Action(String name, String clazz, String method) {
		this.id = UUID.randomUUID().toString();
		this.name = name;
		this.clazz = clazz;
		this.method = method;
	}
}
