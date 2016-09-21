package com.atguigu.mybatis.entities;

public class Cat {

	private String name;
	
	private int age;
	
	
	public void run(){
		
		System.out.println("faster...!");
	}
	public void run(String str){
		
		System.out.println("very faster.......!");
	}
	
	public void eat(){
		
		run();
	}
}
