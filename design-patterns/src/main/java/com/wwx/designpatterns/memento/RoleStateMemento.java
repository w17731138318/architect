package com.wwx.designpatterns.memento;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * RoleStateMemento
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-06 14:12
 * @see
 **/
@Data
@AllArgsConstructor
public class RoleStateMemento {
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
}
