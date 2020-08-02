import java.util.Scanner;

public class GuessNumberTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter player #1's name: ");
		Player playerOne = new Player(scan.nextLine());
		System.out.print("Enter player #2's name: ");
		Player playerTwo = new Player(scan.nextLine());
		GuessNumber game = new GuessNumber();
		String continueAnswer;
		do {	
			game.startGame(playerOne, playerTwo);
			do {
				System.out.print("Do you want to continue? [yes/no]: ");
				continueAnswer = scan.nextLine();
			} while(!continueAnswer.equals("yes") && !continueAnswer.equals("no"));
		} while(continueAnswer.equals("yes"));
	}
}