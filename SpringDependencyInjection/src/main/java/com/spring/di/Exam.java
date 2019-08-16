package com.spring.di;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		Student stud = context.getBean("student", Student.class);
		stud.display();
		context.close();
	}

}
