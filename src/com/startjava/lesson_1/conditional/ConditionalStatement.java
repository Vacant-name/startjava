package com.startjava.lesson_1.conditional;

public class ConditionalStatement {
	public static void main(String[] args) {
		int age = 24;
		if(age > 20) {
			System.out.println("My Age "+ age);
		}

		boolean isMale = true;
		if(isMale) {
			System.out.println("I am Male");
		}
		if(!isMale) {
			System.out.println("I am not Male");
		}

		float height = 1.75f;
		if(height < 1.80) {
			System.out.println("I am low man");
		} else {
			System.out.println("I am High man");
		}

		char firstNameLatter = 'N';
		if(firstNameLatter == 'M') {
			System.out.println("My name is Maxim");
		} else if(firstNameLatter == 'I') {
			System.out.println("My name is Ivan");
		} else {
			System.out.println("My name is Nikita");
		}
	}
}