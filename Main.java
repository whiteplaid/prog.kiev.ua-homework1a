package com.homework.cat;

public class Main {

	public static void main(String[] args) {
		Cat myCat = new Cat();
		myCat.setName("Рысик");
		myCat.setAge(14);
		myCat.setColor("Grey");
		myCat.setEyesColor("Blue");
		Cat notMineCat = new Cat();
		notMineCat.setName("Машка");
		notMineCat.setAge(4);
		notMineCat.setColor("White");
		notMineCat.setEyesColor("Blue");
		System.out.println(myCat.toString());
		System.out.println(notMineCat.toString());
		myCat.meow();
	}

}
