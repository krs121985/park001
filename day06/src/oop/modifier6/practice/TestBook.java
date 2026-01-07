package oop.modifier6.practice;

public class TestBook {
	public static void main(String[] args) {
		

	Book b1 = new Book("자바의 정석", "기술", 1000, 5000);
	Book b2 = new Book("어린왕자", "소설", 150, 2000, "대여중");
	Book b3 = new Book("노인과 바다", "소", 200, 2500, "대여가능");
	Book b4 = new Book("SQL 기초", "기술", 400, 4500, "대여중");
	
	b1.show();
	b2.show();
	b3.show();
	b4.show();
	
	}
}