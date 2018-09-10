package com.wwx.dubbodemoclient.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wwx.dubbodemoclient.qo.User;
import com.wwx.service.HelloService;
import com.wwx.service.SayService;
import org.springframework.web.bind.annotation.*;

/**
 * consumer
 * Call remote service in consumer
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-07 10:26
 * @see
 **/
@RestController
@RequestMapping("/consumer")
public class ConsumerController {
	@Reference(version = "1.0.0")
	private HelloService demoService;
	@Reference(version = "1.0.0")
	private SayService sayService;
	/**
	 * Call remote service in consumer
	 * 远程调用
	 */
	@PostMapping("/hello")
	public String hello(@RequestBody User user){
		return demoService.sayHello(user.getName());
	}

	/**
	 * @PathVariable 注解对中文支持有问题。不建议这样使用
	 * @param user
	 * @return
	 */
	@PostMapping("/say")
	public String say(@RequestBody User user){
		return sayService.sayHello(user.getName())+"2";
	}
}
