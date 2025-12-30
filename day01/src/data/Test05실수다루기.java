package data;

public class Test05실수다루기 {
	public static void main(String []args) {
		//실수
		// - 소수점이 있는 숫자
		// - 정수와는 다른 원리로 저장된다 (부동소수점 방식)
		// - float와 double이라는 형태가 있으며, double이 기분
		// - 실수에서의 크기는 "표현 가능한 자리 수"를 의미함(정확하지 않음)
		// - 엄청 정밀한 계산으로 사용하기는 구조적으로 문제가 있다. 
		// - (ex) 1.1 + 1.1 != 2.2 
		// - (중요) 실수가 한번이라도 포함되면 결과값은 실수 
		float a = 10.5f;
		double b = 10.5;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}
