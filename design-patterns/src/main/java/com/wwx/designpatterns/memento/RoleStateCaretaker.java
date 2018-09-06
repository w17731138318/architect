package com.wwx.designpatterns.memento;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * RoleStateCaretaker
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-06 14:15
 * @see
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoleStateCaretaker {
	private RoleStateMemento roleStateMemento;
}
