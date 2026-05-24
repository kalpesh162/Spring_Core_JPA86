package com.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bean.Student;
import com.conf.AppConfig;

public class App {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Student student = (Student) context.getBean("student");

		System.out.println(student);

	}

}
