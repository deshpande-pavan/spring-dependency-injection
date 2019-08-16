package com.springdi;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("beans.xml is loaded");
		Student student= context.getBean("student",Student.class);
		student.cheating();
		
		
		
		AnotherStudent stud= context.getBean("stud",AnotherStudent.class);
		stud.startCheating();
		context.close();
	}

}
