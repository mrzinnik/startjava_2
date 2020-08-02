import java.util.Scanner;

public class GuessNumber {

	public void startGame(Player playerOne, Player playerTwo) {
		Scanner scan = new Scanner(System.in);
		Player winner;

		System.out.println("Game started!");
		int computerNumber = (int) (Math.random() * 100 + 1);
		System.out.println("Computer number = " + computerNumber);
		do {
			System.out.print(playerOne.getName() + "'s number = ");
			playerOne.setNumber(scan.nextInt());
			if(compareNumbers(playerOne, computerNumber) != null) {
				break;
			}

			System.out.print(playerTwo.getName() + "'s number = ");
			playerTwo.setNumber(scan.nextInt());
			if(compareNumbers(playerTwo, computerNumber) != null) {
				break;
			}
		} while(true);		
		scan.nextLine();		
	}

	private Player compareNumbers(Player player, int computerNumber) {
		if(player.getNumber() == computerNumber) {
			System.out.println(player.getName() + " is winner!");
			return player;
		} else {
			if(player.getNumber() > computerNumber) {
				System.out.println(player.getName() + "'s number is bigger");
			} else {
				System.out.println(player.getName() + "'s number is smaller");
			}
			return null;
		}
	}
}