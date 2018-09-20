package com.homework.cat;

public class Cat {
	private String name;
	private int age;
	private String color;
	private String eyesColor;
	
	public Cat(String name, int age, String color, String eyesColor) {
		super();
		this.name = name;
		this.age = age;
		this.color = color;
		this.eyesColor = eyesColor;
	}
	
	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getEyesColor() {
		return eyesColor;
	}
	public void setEyesColor(String eyesColor) {
		this.eyesColor = eyesColor;
	}
	public void meow (){
		System.out.println("Meow!");
	}
	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + ", color=" + color + ", eyesColor=" + eyesColor + "]";
	}
	
	
}
