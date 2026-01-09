package oop.keyword4;

public class CalculatorTest {
	public static void main(String[] args) {
		
		int a = Calculator.multiple(3, 5);
		System.out.println("두수의곱 : "+ a);
		//System.out.println(Calculator.multiple(3, 5));
		
		double b = Calculator.squre(3);
		System.out.println("어떤 수의 제곱 :" + b );
		// System.out.println(Calculator.squre(3));
		
		double c = Calculator.triangle(3, 5);
		System.out.println("삼각형의 넓이 :" + c);
		// System.out.println(Calculator.triangle(3, 5));
		
		double d = Calculator.circle(5);
		System.out.println("원의 넓이 :" + d);
		// System.out.println(Calculator.circle(5));
		
		double e = Calculator.bmi(71.3, 171);
		System.out.println("bmi수치 : " + e);
		//System.out.println(Calculator.bmi(70, 170));
		
		int f = Calculator.subway(2001);
		System.out.println("지하철 요금 : " + f);
		//System.out.println(Calculator.subway(2001));
	}
}
