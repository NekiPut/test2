package test;

import java.util.Random;
import java.util.Scanner;

public class WoerterRatenDrwenskiMethod {

	public static void main(String[] args) {
		Random random = new Random();
		
		String wort = "BICYCLE";
		char[] buchstaben = wort.toCharArray();
		
		int zufall;
		
		for(int i = 0; i < wort.length(); i++) {
			
			zufall = random.nextInt(wort.length());
			char tmp = buchstaben[i];
			buchstaben[i] = buchstaben[zufall];
			buchstaben[zufall] = tmp;
		}
		
		System.out.println(new String(buchstaben));
		
		@SuppressWarnings("resource")
		Scanner eingabe = new Scanner(System.in);
		System.out.println("Dein Tipp: ");
		String tipp = eingabe.next();

		if(tipp.charAt(0) == wort.charAt(0)) {
			System.out.println("1. Buchstabe richtig!");
		}else {
			System.out.println("1. Buchstabe falsch! baka");
		}
		
//		if(tipp.equalsIgnoreCase(wort)) {
//			System.out.println("BICYCLE is the right answer");
//		} else
//			System.out.println("Wrong, it is BICYCLE");	
	}

}
