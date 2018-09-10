package com.wwx;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.wwx.api.GreetingService;

/**
 * consumer
 * Call remote service in consumer
 * 在消费者中调用远程服务
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-07 9:48
 * @see
 **/
public class Consumer {
	public static void main(String[] args) {
		ReferenceConfig<GreetingService> referenceConfig = new ReferenceConfig<GreetingService>();
		referenceConfig.setApplication(new ApplicationConfig("first-dubbo-consumer"));
		referenceConfig.setRegistry(new RegistryConfig("multicast://224.0.0.0:1234"));
		referenceConfig.setInterface(GreetingService.class);
		GreetingService greetingService = referenceConfig.get();
		System.out.println(greetingService.sayHello("world"));
	}
}
