package com.wwx.designpatterns.Creational.AbstractFactory;

/**
 * Test
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-11 16:32
 * @see
 **/
public class Test {
	public static void main(String[] args) {
		User bill = new User("1", "Bill");
		Department microsoft = new Department("1", "Microsoft");
		User musk = new User("2", "Musk");
		Department tesla = new Department("2", "Tesla");

		IFactory  accessFactory = new AccessFactory();
		IUser accessUser  = accessFactory.createUser();
		accessUser.insert(bill);
		accessUser.insert(musk);
		IDepartment accessDepartment = accessFactory.createDepartment();
		accessDepartment.insert(microsoft);
		accessDepartment.insert(tesla);
		User user = Access.getInstance().getUser("1");
		System.out.println(user);
		Department department = Access.getInstance().getDepartment("2");
		System.out.println(department);
	}
}
