package com.wwx;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.ServiceConfig;
import com.wwx.api.GreetingService;
import com.wwx.api.impl.GreetingServiceImpl;

import java.io.IOException;

/**
 * service provider
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-09-07 9:46
 * @see
 **/
public class ServiceProvider {
	public static void main(String[] args) throws IOException {
		ServiceConfig<GreetingService> serviceConfig = new ServiceConfig<GreetingService>();
		serviceConfig.setApplication(new ApplicationConfig("first-dubbo-provider"));
		serviceConfig.setRegistry(new RegistryConfig("multicast://224.0.0.0:1234"));
		serviceConfig.setInterface(GreetingService.class);
		serviceConfig.setRef(new GreetingServiceImpl());
		serviceConfig.export();
		System.in.read();
	}
}
