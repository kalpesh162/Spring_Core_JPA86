package com.app;

import java.io.Serializable;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.bean.Employee;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		Employee employee1 = (Employee) context.getBean("employee");
		Employee employee2 = (Employee) context.getBean("employee");

		System.out.println(employee1);

		System.out.println(employee2);
		
		// If we mark Employee class as @Component the Spring Container will
		// create an Object but by default name is class name with camelcase
		
		// But what if we want to provide specific name to that object then
		//@Component("emp")
		//public class Employee implements Serializable 
		
		// 		Employee employee = (Employee) context.getBean("emp");
		
		// By Default Scope of Bean is Singleton
		System.out.println(employee1.hashCode());

		System.out.println(employee2.hashCode());
		
	}

}
