package com.nit.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.nit.service.WishMessageGeneratorService;

@SpringBootApplication
@ComponentScan(basePackages="com.nit.service")
public class BootProj1CoreDIApplication {
	
	public static void main(String[] args) {
		ApplicationContext ctx = null;
		WishMessageGeneratorService wishService = null;
		
		// get IOC Container
		ctx = SpringApplication.run(BootProj1CoreDIApplication.class, args);
		
		// get Bean
		wishService = ctx.getBean("wish",WishMessageGeneratorService.class);
		
		// invoke method
		System.out.println(wishService.generateWishMessage(" Nasrullah Syed "));
	}
	
}
