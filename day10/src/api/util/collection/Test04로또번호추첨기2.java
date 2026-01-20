package api.util.collection;

import java.util.Random;
import java.util.TreeSet;

public class Test04로또번호추첨기2 {
	public static void main(String[] args) {
		
		Random r = new Random();
		TreeSet <Integer> number = new TreeSet<>();
		
		while(true) {
			int numbers = r.nextInt(45)+1;
			
			if(number.contains(numbers)) {
				number.clear();
			}
			if(number.size() == 6) break;
		
			number.add(numbers);
		}
		System.out.println(number);
		
	}
	
}
