package com.atguigu.mybatis.entities;

/**this is a car*/
public class Car {

	private String color;
	private String faster;
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getFaster() {
		return faster;
	}
	public void setFaster(String faster) {
		this.faster = faster;
	}
	
	@Override
	public String toString() {
		return "Car [color=" + color + ", faster=" + faster + "]";
	}
}
