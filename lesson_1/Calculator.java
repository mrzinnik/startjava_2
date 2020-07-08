public class Calculator {
	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 3;
		char mathOperator = '%';
		int result = 1;

		if(mathOperator == '+') {
			result = num1 + num2;
		} else if(mathOperator == '-') {
			result = num1 - num2;
		} else if(mathOperator == '*') {
			result = num1 * num2;
		} else if(mathOperator == '/') {
			result = num1 / num2;
		} else if(mathOperator == '^') {
			for(int i = 1; i <= num2; i++) {
				result *= num1;
			}
		} else if(mathOperator == '%') {
			result = num1 % num2;
		}

		System.out.println(num1 + " " + mathOperator + " " + num2 + " = " + result);
	}
}