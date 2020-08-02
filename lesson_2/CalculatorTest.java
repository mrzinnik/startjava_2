import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		Scanner scan = new Scanner(System.in);
		String continueAnswer;
		do {
			System.out.print("Введите первое число: ");
			calc.setFirstNumber(scan.nextInt());
			System.out.print("Введите знак математической операции: ");
			calc.setMathOperator(scan.next().charAt(0));
			System.out.print("Введите второе число: ");
			calc.setSecondNumber(scan.nextInt());
			scan.nextLine();
			System.out.println(calc.getFirstNumber() + " " + calc.getMathOperator() + 
				" " + calc.getSecondNumber() + " = " + calc.calculate());
			do {
				System.out.print("Хотите продолжить? [yes/no]: ");
				continueAnswer = scan.nextLine();
				System.out.println(continueAnswer);
			} while(!continueAnswer.equals("yes") && !continueAnswer.equals("no"));
		} while (continueAnswer.equals("yes"));
	}
}