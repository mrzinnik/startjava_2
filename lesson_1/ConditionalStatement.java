public class ConditionalStatement {
	public static void main(String[] args) {
		int age = 18;
		if(age > 20) {
			System.out.println("You are elder than 20");
		}

		boolean isMale = false;
		if(isMale) {
			System.out.println("You are a man");
		}

		if(!isMale) {
			System.out.println("You are a woman");
		}

		double height = 1.75;
		if(height < 1.80) {
			System.out.println("You are small");
		} else {
			System.out.println("You are tall");
		}

		char nameFirstLetter = 'I';
		if(nameFirstLetter == 'M') {
			System.out.println("First letter is M");
		} else if(nameFirstLetter == 'I') {
			System.out.println("First letter is I");
		} else {
			System.out.println("First letter is not M or I");
		}
	}
}