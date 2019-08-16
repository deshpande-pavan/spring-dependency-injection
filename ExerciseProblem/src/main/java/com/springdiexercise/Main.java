package com.springdiexercise;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("beans.xml is loaded");
		ServiceProvider sp = context.getBean("service", ServiceProvider.class);
		sp.getService();
		context.close();
	}
}
