public class Person {

	boolean isMale = true;
	String name = "Simon";
	double height = 1.85;
	double weight = 75;
	int age = 25;

	void walk(int walkDistance) {
		System.out.println(name + " walked " + walkDistance + "m");
	}

	void run(int runDistance) {
		System.out.println(name + " ran " + runDistance + "m");
	}

	boolean sit() {
		System.out.println(name + "sat");
		return true;
	}

	void speak() {
		System.out.println("Java is great!");
	}

	void learnJava() {
		System.out.println(name + "was tearning Java for 3 hours");
	}
}