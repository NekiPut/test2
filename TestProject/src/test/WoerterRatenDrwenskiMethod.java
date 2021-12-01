package test;

import java.util.Random;

public class WoerterRatenDrwenskiMethod {

	public static void main(String[] args) {
		Random random = new Random();
		
		String wort = "BICYCLE";
		
		int zufall;
		
		for(int i = 0; i < wort.length(); i++) {
			
			zufall = random.nextInt(wort.length());
			System.out.println(wort.charAt(zufall));
		}
	}

}
