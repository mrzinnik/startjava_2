public class WolfTest {

	public static void main(String[] args) {
		Wolf wolfOne = new Wolf();
		wolfOne.isMale = true;
		wolfOne.name = "Aaron";
		wolfOne.weight = 40.5;
		wolfOne.age = 7;
		wolfOne.colour = "grey";

		System.out.println("Gender: " + (wolfOne.isMale ? "male" : "female"));
		System.out.println("Name: " + wolfOne.name);
		System.out.println("Weight: " + wolfOne.weight);
		System.out.println("Age: " + wolfOne.age);
		System.out.println("Colour: " + wolfOne.colour);

		wolfOne.walk(10);
		wolfOne.sit();
		wolfOne.run(50);
		wolfOne.howl();
		wolfOne.hunt();
	}
}