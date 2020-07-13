public class Wolf {

	boolean isMale;
	String name;
	double weight;
	int age;
	String colour;

	void walk(int walkDistance) {
		System.out.println(name + " walked " + walkDistance + " meters");
	}

	boolean sit() {
		System.out.println(name + " sat");
		return true;
	}

	void run(int runDistance) {
		System.out.println(name + " ran " + runDistance + " meters");
	}

	void howl() {
		System.out.println("Awoo!");
	}

	void hunt() {
		System.out.println(name + " catched a rabbit");
	}
}