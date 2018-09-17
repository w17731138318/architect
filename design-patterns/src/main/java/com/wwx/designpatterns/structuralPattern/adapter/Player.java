package com.wwx.designpatterns.structuralPattern.adapter;

/**
 * Player 玩家
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

	/**
	 * 攻击
	 * @return
	 */
	public abstract Action attack();

	/**
	 * 繁育
	 * @return
	 */
	public abstract Action defense();

}
