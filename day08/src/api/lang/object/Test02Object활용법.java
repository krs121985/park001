package api.lang.object;

import java.util.Scanner;

public class Test02Object활용법 {
	public static void main(String[] args) {
		//Object는 아무거나라는 의미로 쓰일 수 있다.
		//설명에 의하면 Object는 모든 클래스의 상속관계 중 최상위를 차지(업캐스팅)
		//보관해야하는 형태가 애매할 경우 사용
		//자바에서 만들어지는 모든 클래스는 일종의 일련번호 형식으로 보관된다.
		Object a = 100; //100은 int인데 에러 안되는이유 int 위에 Object있어서
		Object b = 3.14;
		Object c = "Hello";
		Object sc = new Scanner(System.in);
		Object data = new int [] {30, 50, 20, 10, 40};
	
		//혹시 이런 배열을 만들면 무슨 뜻일까?
		Object [] list = new Object[10]; //아무 데이터나 넣어도되는 10개의 칸을 준비했다.
		
		//내가 만든 클래스는..? 안보이지만 Object를 상속받고있다.
		Object stu = new Student();
		
	
	}
}

