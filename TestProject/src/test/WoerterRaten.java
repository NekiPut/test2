package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WoerterRaten {

	public static void main(String[] args) {

		String wort = "BICYCLE";
		List<String> characters = Arrays.asList(wort.split(""));
		Collections.shuffle(characters);
		String afterShuffle = "";
		for(String character : characters) {
		
		afterShuffle += character;
		}
		System.out.println(afterShuffle);
	}

}
