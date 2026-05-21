package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Student;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		// Object getBean()
		Student student = (Student) context.getBean("student");

		Student student1 = (Student) context.getBean("student1");

		System.out.println(student);

		System.out.println(student1);

	}

}
