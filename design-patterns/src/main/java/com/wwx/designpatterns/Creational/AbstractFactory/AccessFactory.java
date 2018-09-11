package com.wwx.designpatterns.Creational.AbstractFactory;

/**
 * AccessFactory
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-11 16:33
 * @see
 **/
public class AccessFactory implements IFactory {

	@Override
	public IUser createUser() {
		return new AccessUser();
	}

	@Override
	public IDepartment createDepartment() {
		return new AccessDepartment();
	}
}
