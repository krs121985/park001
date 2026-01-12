package exception;

import java.util.Scanner;
 
public class Test01예외처리3 {
	public static void main(String[] args) {
		//프로그램을 구현할 때 발생할 수 있는 돌발상황까지 대비한 코드 구현
		//Plan B에 대한 코드 작성( = 예외처리)
		
		//(ex) n분의 1계산기
		
		try {//Plan A
		Scanner sc = new Scanner(System.in);
		
		System.out.println("금액 입력 :");
		int price = sc.nextInt();
		if(price <=0) {
			// return; < 프로그램이 끝나니까 return쓰면안됨
			// catch로 강제이동!
			Exception e = new Exception("금액은 0보다 커야합니다."); //강제예외
			throw e; //e들고 catch로 가세요 
		}
		System.out.println("인원 수 입력 :");
		int people = sc.nextInt();
		if(people <=0) {
			throw new Exception("인원수는 0 보다 커야합니다."); // 강제예외
		}
		
		int money = price / people;
		int remain = price % people;
		
		System.out.println("1인 당 금액 : " + money + "원");
		System.out.println("자투리 금액 : " + remain + "원");
		}
//		catch(RuntimeException e){//Plan B
		catch(Exception e) { // 통합 예외 처리 클래스
//			System.err.println("입력값이 잘못되었습니다."); //사용자를 위한 메시지  
			e.printStackTrace(); //개발자를 위한 메세지
		}

//		catch(Throwable e) //Error까지 모두 처리해야 하는 경우(ex : 코딩테스트 사이트)
//		catch(Object e) 
  
	} 
}