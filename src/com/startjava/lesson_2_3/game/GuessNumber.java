import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

	Scanner sc = new Scanner(System.in);

	private Player playerOne;
	private Player playerTwo;

	GuessNumber(Player player1, Player player2) {
		this.playerOne = player1;
		this.playerTwo = player2;
	}

	void play() {
		Random random = new Random();

		int compNumber = random.nextInt(100) + 1;

		while(true) {
			System.out.println("You must guess the number " + compNumber);

			System.out.println("The first player inputing his number... ");
			playerOne.setNumber(sc.nextInt());
			System.out.println("The first player thinking this number  " + playerOne.getNumber());

			if(playerOne.getNumber() == compNumber) {
				System.out.println(playerOne.getName() + " is a winner " + playerOne.getNumber());
				break;
			}
			System.out.println("The second player inputing his number... ");
			playerTwo.setNumber(sc.nextInt());
			System.out.println("The second player thinking this number  " + playerTwo.getNumber());
			
			if(playerTwo.getNumber() == compNumber) {
				System.out.println(playerTwo.getName() + " is a winner " + playerTwo.getNumber());
				break;
			}
			System.out.println("One more time");
		} //while
	}
}