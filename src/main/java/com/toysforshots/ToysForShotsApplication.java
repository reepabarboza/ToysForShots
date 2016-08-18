package com.toysforshots;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@ComponentScan({"com.toysforshots.controller"})
@SpringBootApplication
public class ToysForShotsApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(ToysForShotsApplication.class, args);

		/*String[] beanNames = ctx.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		for (String name : beanNames) {
			System.out.println(name);
		}*/

	}
}
