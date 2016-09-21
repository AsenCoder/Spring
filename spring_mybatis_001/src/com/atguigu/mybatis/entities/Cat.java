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
	
	public void fly(){
		
		System.out.println("i wang to fly!");	
	}
	// cat 是一种会抓老鼠的动物
	public void catched(){
		//捉住了一只老鼠
	}
	//这是一只神奇的猫，会飞
	public void fly(int m){
		//飞起来了！
	}
	
	public void bbb(){
		
	}
	public void ddd(){}
}
