package oop.keyword4;

import java.time.LocalDate;

public class Calculator {
	
	private Calculator(){}
	
	public static int multiple(int x, int y) {
		return x*y;
	}
	public static double squre(double x) {
		return x*x; //또는 return multiple(x,x);
	}
	public static double triangle(double x, int y) {
		return x*y/2; //또는 return multiple(x,y) / 2;
	}
	public static double circle (int r) {
		return Math.PI*r*r; //또는 3.14 * multiple(r,r) 	또는 3.14 *squre(r);
	}
	public static double bmi(double weight, double height) {
		double m = height / 100;//m로 변환
		double bmi = weight / squre(m);
		return bmi;
	}
	public static int subway(int birth) {
		int year = 2026;
		int age = year - birth + 1;
	
		if(age < 8) return 0;
		else if(age >= 65) return 0;
		else if(age >= 20) return 1550;
		else if(age >= 14) return 900;
		else return 500;
		
	}
	
}
