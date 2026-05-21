package com.app;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.bean.Student;

public class App {

	public static void main(String[] args) {

		// ApplicationContext context = new
		// ClassPathXmlApplicationContext("spring.xml");

		Resource resource = new ClassPathResource("spring.xml");

		BeanFactory factory = new XmlBeanFactory(resource);

		Student student = (Student) factory.getBean("student");
		System.out.println("------------------");
		
		System.out.println(student);
	}

}
