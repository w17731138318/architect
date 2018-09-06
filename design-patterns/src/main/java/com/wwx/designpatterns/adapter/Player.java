package com.wwx.designpatterns.adapter;

import lombok.Data;

/**
 * Player
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-06 15:25
 * @see
 **/
public abstract class Player {
	/**
	 * name
	 */
	protected String name;

	public Player(String name) {
		this.name = name;
	}

	public abstract Action attack();

	public abstract Action defense();

}
