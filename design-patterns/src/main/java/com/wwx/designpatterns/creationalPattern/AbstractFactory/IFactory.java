package com.wwx.designpatterns.creationalPattern.AbstractFactory;

public interface IFactory {
	IUser createUser();

	IDepartment createDepartment();
}
