package com.wwx.dubbodemoclient;

import org.springframework.boot.SpringApplication;

import javax.annotation.PostConstruct;
import com.alibaba.dubbo.config.annotation.Reference;
import com.wwx.service.HelloService;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DubbodemoclientApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(DubbodemoclientApplication.class, args);
	}
}
