package com.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Tree;

public class App {

	public static void main(String[] args) {

		// ApplicationContext context = new
		// ClassPathXmlApplicationContext("spring.xml");
		// AbstractApplicationContext context = new
		// ClassPathXmlApplicationContext("spring.xml");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		Tree tree1 = (Tree) context.getBean("tree");
		Tree tree2 = (Tree) context.getBean("tree");
		
		System.out.println(tree1);

		System.out.println(tree1.hashCode());
		System.out.println(tree2.hashCode());
		
		Tree tree3 = (Tree) context.getBean("tree1");
		Tree tree4 = (Tree) context.getBean("tree1");
		System.out.println(tree3.hashCode());
		System.out.println(tree4.hashCode());
		
		
		// registerShutDownHook
		context.registerShutdownHook();
	}

}
