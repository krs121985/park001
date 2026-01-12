package exception;

import java.util.Scanner;

public class Test01예외처리2 {
	public static void main(String[] args) {
		//프로그램을 구현할 때 발생할 수 있는 돌발상황까지 대비한 코드 구현
		//Plan B에 대한 코드 작성( = 예외처리)
		 
		//(ex) n분의 1계산기
		
		try {//Plan A
		Scanner sc = new Scanner(System.in);
		
		System.out.println("금액 입력 :");
		int price = sc.nextInt();
		
		System.out.println("인원 수 입력 :");
		int people = sc.nextInt();
		
		int money = price / people;
		int remain = price % people;
		
		System.out.println("1인 당 금액 : " + money + "원");
		System.out.println("자투리 금액 : " + remain + "원");
		}
//		catch(RuntimeException e){//Plan B
		catch(Exception e) { // 통합 예외 처리 클래스
			System.err.println("입력값이 잘못되었습니다."); //사용자를 위한 메시지  
			e.printStackTrace(); //개발자를 위한 메세지
		}

//		catch(Throwable e) //Error까지 모두 처리해야 하는 경우(ex : 코딩테스트 사이트)
//		catch(Object e) 

	}
} 