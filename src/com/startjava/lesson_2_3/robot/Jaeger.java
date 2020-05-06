public class Jaeger {
	private String origin;
	private float height;
	private float weight;
	private int speed;
	private int strength;
	private int armor;
	
	public Jaeger(String origin, float height, float weight, int speed, int strength, int armor) {
		this.origin = origin;
		this.height = height;
		this.weight = weight;
		this.speed = speed;
		this.strength = strength;
		this.armor = armor;
	}

	public String getOrigin() {
		return origin;
	}

	// public void setOrigin(String origin) {
	// 	this.origin = origin;
	// }

	public float getHeight() {
		return height;
	}

	// public void setHeight(float height) {
	// 	this.height = height;
	// }

	public float getWeight() {
		return weight;
	}

	// public void setWeight(float weight) {
	// 	this.weight = weight;
	// }

	public int getSpeed() {
		return speed;
	}

 // 	public void setSpeed(int speed) {
	// 	this.speed = speed;
	// }

	public int getStrength() {
		return strength;
	}

	// public void setStrength(int strength) {
	// 	this.strength = strength;
	// }

	public int getArmor() {
		return armor;
	}

	// public void setArmor(int armor) {
	// 	this.armor = armor;
	// }

	public void go() {
		System.out.println("Your Jaeger is gone");
	}

	public void atack() {
		System.out.println("The target is destroyed");
	}

	public void stop() {
		System.out.println("Waiting for instruction");
	}
}
