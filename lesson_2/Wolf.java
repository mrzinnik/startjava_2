public class Wolf {

	private String gender;
	private String name;
	private double weight;
	private int age;
	private String colour;

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age > 8) {
			System.out.println("Incorrect age");
		} else {	
			this.age = age;
		}
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public void walk(int walkDistance) {
		System.out.println(name + " walked " + walkDistance + " meters");
	}

	public boolean sit() {
		System.out.println(name + " sat");
		return true;
	}

	public void run(int runDistance) {
		System.out.println(name + " ran " + runDistance + " meters");
	}

	public void howl() {
		System.out.println("Awoo!");
	}

	public void hunt() {
		System.out.println(name + " catched a rabbit");
	}
}