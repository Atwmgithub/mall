package com.macro.mall.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MallDemoApplication{
	public static void main(String[] args) {
		SpringApplication.run(MallDemoApplication.class, args);
		System.out.println(123);
		System.out.println("test1");
		System.out.println("测试pull");
	}
}
