import java.util.Scanner;

public class JaegerTest {

	public static void main(String[] args) {
		Jaeger jaegerOne = new Jaeger("Gipsy Avenger", "Mark-6", "Plasma Caster 2.0");
		Jaeger jaegerTwo = new Jaeger("Saber Athena", "Mark-7", "N-16 Particle Charger");

		System.out.println("Jaeger #1");
		System.out.println("Name: " + jaegerOne.getName());
		System.out.println("Mark: " + jaegerOne.getMark());
		System.out.println("Weapon: " + jaegerOne.getWeapon());
		System.out.println("Jaeger #1's data redacted");
		jaegerOne.setName("Guardian Bravo");
		jaegerOne.setMark("Mark-5");
		jaegerOne.setWeapon("X-9 Core Salvo Charges");
		System.out.println("Name: " + jaegerOne.getName());
		System.out.println("Mark: " + jaegerOne.getMark());
		System.out.println("Weapon: " + jaegerOne.getWeapon());
		System.out.println();

		System.out.println("Jaeger #2");
		System.out.println("Name: " + jaegerTwo.getName());
		System.out.println("Mark: " + jaegerTwo.getMark());
		System.out.println("Weapon: " + jaegerTwo.getWeapon());
		jaegerTwo.move(500);
		jaegerTwo.scanKaiju();
		jaegerTwo.strike();
	}
}