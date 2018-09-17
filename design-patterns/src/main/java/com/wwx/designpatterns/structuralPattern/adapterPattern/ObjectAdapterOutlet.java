package com.wwx.designpatterns.structuralPattern.adapterPattern;

/**
 * ObjectAdapterOutlet
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-17 10:47
 * @see
 **/
public class ObjectAdapterOutlet implements IOutlet {

	private OldOutlet oldOutlet;

	public ObjectAdapterOutlet(OldOutlet oldOutlet) {
		super();
		this.oldOutlet = oldOutlet;
	}

	@Override
	public void chaKou110() {
		oldOutlet.chaKou110();
	}

	@Override
	public void chaKou220() {
		System.out.println("输出220V电源");
	}
}
