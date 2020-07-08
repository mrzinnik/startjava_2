public class MyFirstGame {
	public static void main(String[] args) {
		int guessedNumber = 1;
		int answer = 99;
		int guessRangeMin = 1;
		int guessRangeMax = 100;
		
		while(answer != guessedNumber) {
			System.out.println("answer = " + answer);
			System.out.println("guessedNumber = " + guessedNumber);
			if(answer > guessedNumber) {
				System.out.println("Answer is greater than guessed number");
				guessRangeMax = answer;
				answer -= (guessRangeMax - guessRangeMin) / 2 + 1;
			} else {
				System.out.println("Answer is less than guessed number");
				guessRangeMin = answer;
				answer += (guessRangeMax - guessRangeMin) / 2 + 1;
			}
		}
		System.out.println("answer = " + answer);
		System.out.println("guessedNumber = " + guessedNumber);
		System.out.println("Correct answer");
	}
}