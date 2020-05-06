public class JaegerTest {
	public static void main(String[] args) {
		Jaeger strikerEureka = new Jaeger("Australia", 76.2f, 1.850f, 10, 10, 9);
		
		// strikerEureka.setOrigin("Australia");
		// strikerEureka.setHeight(76.2f);
		// strikerEureka.setWeight(1.850f);
		// strikerEureka.setSpeed(10);
		// strikerEureka.setStrength(10);
		// strikerEureka.setArmor(9);

		System.out.println("Origin " + strikerEureka.getOrigin());
		System.out.println("Height " + strikerEureka.getHeight());
		System.out.println("Weight " + strikerEureka.getWeight());
		System.out.println("Speed " + strikerEureka.getSpeed());
		System.out.println("Strength " + strikerEureka.getStrength());
		System.out.println("Armor " + strikerEureka.getArmor());
	
		strikerEureka.go();
		strikerEureka.atack();
		strikerEureka.stop();

		Jaeger gipsyDanger = new Jaeger("United States of America", 79.25f, 1.980f, 7, 8, 6);

		// gipsyDanger.setOrigin("United States of America");
		// gipsyDanger.setHeight(79.25f);
		// gipsyDanger.setWeight(1.980f);
		// gipsyDanger.setSpeed(7);
		// gipsyDanger.setStrength(8);
		// gipsyDanger.setArmor(6);

		System.out.println("Origin " + gipsyDanger.getOrigin());
		System.out.println("Height " + gipsyDanger.getHeight());
		System.out.println("Weight " + gipsyDanger.getWeight());
		System.out.println("Speed " + gipsyDanger.getSpeed());
		System.out.println("Strength " + gipsyDanger.getStrength());
		System.out.println("Armor " + gipsyDanger.getArmor());
	
		gipsyDanger.go();
		gipsyDanger.atack();
		gipsyDanger.stop();
	}
}