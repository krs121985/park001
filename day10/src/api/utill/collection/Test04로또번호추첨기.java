package api.utill.collection;

import java.util.Random;
import java.util.TreeSet;

public class Test04로또번호추첨기 {
	public static void main(String[] args) {
		
		//Set 저장소는 중복이 자동으로 제거되는 특징이있다.
		
		Random r = new Random();
		TreeSet <Integer> number = new TreeSet<>();
		
		while(true) {
			int numbers = r.nextInt(45)+1;
			
			if(number.contains(numbers)) number.clear();
			if(number.size() == 6) break;
			number.add(numbers);
		}
		System.out.println(number);
		
	}
	
}
