package com.wwx.designpatterns.structuralPattern.adapterPattern;

/**
 * ClazzAdapterOutlet
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-17 10:47
 * @see
 **/
public class ClazzAdapterOutlet extends OldOutlet implements IOutlet{
	@Override
	public void chaKou220() {
		System.out.println("输出220V电源");
	}
}
