package test;

import java.util.Random;

public class World {

	public static void main(String[] args) {

		System.out.println("Hello World");
		System.out.println("How are you doin ?");

		Random rdm = new Random();
		int zufallszahl = rdm.nextInt(100);	
		System.out.println(zufallszahl + " Du Lutscher!");
	}
}
