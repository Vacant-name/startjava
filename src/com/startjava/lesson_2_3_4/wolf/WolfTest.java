package com.startjava.lesson_2_3_4.wolf;

public class WolfTest {
	public static void main(String[] args) {
		Wolf wolfOne = new Wolf();

		wolfOne.setGender("Wooman");
		wolfOne.setNickname("Another");
		wolfOne.setWeight(66);
		wolfOne.setAge(11);
		wolfOne.setColor("White");

		System.out.println("gender = " + wolfOne.getGender());
		System.out.println("nickname = " + wolfOne.getNickname());
		System.out.println("weight = " + wolfOne.getWeight());
		System.out.println("age = " + wolfOne.getAge());
		System.out.println("color = " + wolfOne.getColor());
	
		wolfOne.go();
		wolfOne.sit();
		wolfOne.run();
		wolfOne.howl();
		wolfOne.hunt();
	}
}