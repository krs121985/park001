package api.util.collection;

import java.util.TreeSet;

public class Test02제네릭타입 {
	public static void main(String[] args) {
		//경고는 왜 뜨는가?
		//TreeSet contacts = new TreeSet();스티커 미부착으로 형태 알 수 없음
		//TreeSet<String> contacts = new TreeSet<String>();//<String>스티커 붙여서 형태 알 수 있음(제너릭[Generic Type) E : String]
		TreeSet<String> contacts = new TreeSet<>();//한쪽에만 표기해서 중복 표기 제거(사용할 최종 형태)
	
		//contacts.add(100); // E스티커에 String타입스티커 붙혀서, int와 형태 불일치 

		//숫자를 지정하려면?
		//TreeSet<int> numbers = new TreeSet<>(); //원시형은 제네릭 타입이 될 수 없음 (null이 저장될 수 있어야 함 - 리모컨에 버튼이 없는 상태)
		TreeSet<Integer> numbers = new TreeSet<>(); //Wrapper class 형태로 생성 가능
		
		numbers.add(100); //형태 맞음
	}
}
