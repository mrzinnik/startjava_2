public class Calculator {

	private int firstNumber;
	private int secondNumber;
	private char mathOperator;

	public int getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	public int getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}

	public char getMathOperator() {
		return mathOperator;
	}

	public void setMathOperator(char mathOperator) {
		this.mathOperator = mathOperator;
	}

	public int calculate() {
		int result = 1;
		switch(mathOperator) {
			case '+': 
				return firstNumber + secondNumber;
			case '-':
				return firstNumber - secondNumber;
			case '*':
				return firstNumber * secondNumber;
			case '/':
				return firstNumber / secondNumber;
			case '%':
				return firstNumber % secondNumber;
			case '^':
				for(int i = 1; i <= secondNumber; i++) {
					result *= firstNumber;
				}
				return result;
			default:
				return 1;
		}
	}
}