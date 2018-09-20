package com.homework.cat;

public class Main {

	public static void main(String[] args) {
		Cat mycat = new Cat();
		mycat.setName("Рысик");
		mycat.setAge(14);
		mycat.setColor("Grey");
		mycat.setEyesColor("Blue");
		Cat notminecat = new Cat();
		notminecat.setName("Машка");
		notminecat.setAge(4);
		notminecat.setColor("White");
		notminecat.setEyesColor("Blue");
		System.out.println(mycat.toString());
		System.out.println(notminecat.toString());
		mycat.meow();
	}

}
