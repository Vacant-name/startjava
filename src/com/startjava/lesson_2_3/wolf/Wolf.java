package com.startjava.lesson_2_3.wolf;

public class Wolf {
	
	private String gender = "Male";
	private String nickname = "Kind";
	private float weight = 80.0f;
	private int age = 10;
	private String color = "Gray";

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

 	public void setAge(int age) {
		if(age > 8) {
			System.out.println("Incorrect age");
		} else {
			this.age = age;
		}
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String go() {
		return "Kind went";
	}

	public boolean sit() {
		System.out.println("Kind sat");
		return true;
	}

	public String run() {
		return "Kind ran";
	}

	public void howl() {
		System.out.println("Kind howled");
	}

	public String hunt() {
		return "Kind hunted";
	}
}