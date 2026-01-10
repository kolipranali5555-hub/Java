package com.jbk1;

public class VowelConsonant {
	public static void main(String[] args, int vowel) {
		String s = "Prathmesh";
		s= s.toLowerCase();
		int v = 0;
		int c = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				v++;

			} else {
				c++;
			}
			
		}
		System.out.println("vowels:" + v);
		System.out.println("Consonants:" + c);
	}

}
