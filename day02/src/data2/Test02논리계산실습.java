package data2;

public class Test02논리계산실습 {
	public static void main(String[] args) {
		// 2006년생이 "성인"인지 판정해서 출력 (나이는 한국나이기준, 해다마 증가)
		// 13+25-22가 "홀수"인지 판정해서 출력
		
		//1
		int year = 2006;
		int thisYear = 2025;
		int adult = 20;
		
		int age = thisYear - year + 1;
		
		boolean adultStandard = age >= adult;
		System.out.println("성인 : " + adultStandard);
		
		//2
		int a = 13;
		int b = 25;
		int c = 22;
		
		int calculator = a+b-c;
		int calculatorResult = calculator % 2;
		boolean result = calculatorResult == 1;
		System.out.println("홀수 : " + result ); 
		
		
	}
}
