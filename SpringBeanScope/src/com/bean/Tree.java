package com.bean;

public class Tree {
	private int ht;
	private String name;

	public Tree() {
		System.out.println("Default Constrctor");
	}

	public Tree(int ht, String name) {
		super();
		this.ht = ht;
		this.name = name;
	}

	public int getHt() {
		return ht;
	}

	public void setHt(int ht) {
		System.out.println("Ht  SET");
		this.ht = ht;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Name  SET");
		this.name = name;
	}

	@Override
	public String toString() {
		return "Tree [ht=" + ht + ", name=" + name + "]";
	}
	
	public void init() {
		System.out.println("Extra intialization");
		System.out.println("Serving Water ...");
	}
	
	public void destroy() {
		
		System.out.println("destroy ");
		System.out.println("Ceremoney ...");
	}
	

}
