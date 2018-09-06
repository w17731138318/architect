package com.wwx.designpatterns.demo;
import com.wwx.designpatterns.memento.GameRole;
import com.wwx.designpatterns.memento.RoleStateCaretaker;
import org.junit.Test;
/**
 * MementoTest 备忘录模式
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-06 14:18
 * @see
 **/

public class MementoTest {
	@Test
	public void test(){
		GameRole gameRole = new GameRole();
		/**
		 * 初始化对象属性
		 */
		gameRole.initState();
		/**
		 * 备份对象属性信息
		 */
		RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker(gameRole.saveState());
//		RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
//		roleStateCaretaker.setRoleStateMemento(gameRole.saveState());
		/**
		 * 修改对象属性
		 */
		gameRole.fight();
		System.out.println(gameRole);
		/**
		 * 回复对象属性
		 */
		gameRole.recoveryState(roleStateCaretaker.getRoleStateMemento());
		System.out.println(gameRole);
	}
}
