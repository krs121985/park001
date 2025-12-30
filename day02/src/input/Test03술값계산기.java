package input;

import java.util.Scanner;

public class Test03술값계산기 {
	public static void main(String[] args)
	{
		//사용자에게 총 결제금액과 인원수를 입력받습니다.
		//입력받은 정보를 이용하여 1인 당 결제금액과 자투리금액을 계산합니다.
		//금액은 소수점이 나올 수 없기에 소수점 제외 금액으로 출력합니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("총 결제금액 :");
		int Payment= sc.nextInt();
		System.out.print("인원 수:");
		int Person = sc.nextInt();
		
		int perPerson = Payment/Person/10*10;
		System.out.println("1인 당 결제금액:" + perPerson);
		
		int perPersonSome = Payment%perPerson;
		System.out.println("자투리금액: " + perPersonSome);
	}
}
