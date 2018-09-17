package com.wwx.designpatterns.creationalPattern.AbstractFactory;

/**
 * AccessDepartment
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-11 16:29
 * @see
 **/
public class AccessDepartment implements IDepartment {

	@Override
	public void insert(Department department) {
		Access.getInstance().addDepartment(department);
	}

	@Override
	public Department get(String id) {
		return Access.getInstance().getDepartment(id);
	}
}
