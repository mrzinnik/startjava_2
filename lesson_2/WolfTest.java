public class WolfTest {

	public static void main(String[] args) {
		Wolf wolfOne = new Wolf();
		wolfOne.setGender("female");
		wolfOne.setName("Fluffy");
		wolfOne.setWeight(35.5d);
		wolfOne.setAge(9);
		wolfOne.setColour("white");

		System.out.println("Gender: " + wolfOne.getGender());
		System.out.println("Name: " + wolfOne.getName());
		System.out.println("Weight: " + wolfOne.getWeight());
		System.out.println("Age: " + wolfOne.getAge());
		System.out.println("Colour: " + wolfOne.getColour());

		wolfOne.walk(10);
		wolfOne.sit();
		wolfOne.run(50);
		wolfOne.howl();
		wolfOne.hunt();
	}
}