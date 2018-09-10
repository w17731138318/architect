package com.jvm.jvmdemo.web;

import com.jvm.jvmdemo.vo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * jvm
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-10 11:10
 * @see
 **/
@RestController
@RequestMapping("/jvm")
public class JvmController {
	private List<User> list = new ArrayList<>();

	/**
	 * -Xmx32m -Xms32m -XX:MaxMetaspaceSize=128m
	 */
	@GetMapping("/oom")
	public void oom(){
		while (true){
			list.add(new User(1, UUID.randomUUID().toString()));
		}
	}
}
