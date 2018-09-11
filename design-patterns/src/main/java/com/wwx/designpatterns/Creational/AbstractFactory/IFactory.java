package com.wwx.designpatterns.Creational.AbstractFactory;

public interface IFactory {
	IUser createUser();

	IDepartment createDepartment();
}
