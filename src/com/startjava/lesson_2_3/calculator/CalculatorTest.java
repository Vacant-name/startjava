import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calc = new Calculator(); 
		String letter = "";
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Input a first number ");
			calc.setFirstNum(scan.nextInt());
			scan.nextLine();

			System.out.println("Input a math symbol ");
			calc.setSign(scan.nextLine());

			System.out.println("Input a second number ");
			calc.setSecondNum(scan.nextInt());
			scan.nextLine();

			calc.calculate();
			do {
				System.out.println("Want to continue ? [Y/N]");
				letter = scan.nextLine();
			} while(!letter.equals("Y") && !letter.equals("N"));
		} while(letter.equals("Y"));
		System.out.println("See you");
	}
}