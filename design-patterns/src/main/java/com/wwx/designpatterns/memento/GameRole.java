package com.wwx.designpatterns.memento;

import lombok.Data;

/**
 * GameRole
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-06 14:16
 * @see
 **/
@Data
public class GameRole {
	/**
	 * 生命
	 */
	private int vitality;
	/**
	 * 攻击
	 */
	private int attack;
	/**
	 * 防御
	 */
	private int defense;
	public void initState() {
		this.vitality = 100;
		this.attack = 100;
		this.defense = 100;
	}

	public void fight() {
		this.vitality = 0;
		this.attack = 0;
		this.defense = 0;
	}

	public RoleStateMemento saveState() {
		return new RoleStateMemento(vitality, attack, defense);
	}

	public void recoveryState(RoleStateMemento roleStateMemento) {
		this.vitality = roleStateMemento.getVitality();
		this.attack = roleStateMemento.getAttack();
		this.defense = roleStateMemento.getDefense();
	}
}
