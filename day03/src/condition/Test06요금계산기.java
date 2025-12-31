package condition;

import java.util.Scanner;

public class Test06요금계산기 {
	public static void main(String[] args) {
		/*사용자에게 다음 중 하나를 숫자로 고르도록하여 선택에 따라 요금 할인 적용되도록 처리
		사용자에게 다음 중 하나를 숫자로 고르도록 하여 선택에 따라 요금 할인이 적용되도록 처리
		현금 결제 (10% 할인)
		포인트카드 사용 (5% 할인)
 		카드 결제 (할인 없음)

		결제할 금액을 입력하세요
		(10000)
		다음 중 선택하세요
		1. 현금 결제 (10% 할인)
		2. 포인트카드 사용 (5% 할인)
		3. 카드 결제 (할인 없음)
		(1)
		결제하실 요금을 9000원 입니다 (할인된 금액 : 1000원)
		*/
		Scanner sc = new Scanner(System.in);
		
		System.out.println("결제할 금액을 입력하세요.");
		int fee = sc.nextInt();
		
		System.out.println("다음 중 선택하세요.");
		System.out.println("1. 현금 결제 (10% 할인)");
		System.out.println("2. 포인트카드 사용 (5% 할인)");
		System.out.println("3. 카드 결제 (할인 없음)");
		int cho = sc.nextInt();
		
		int dis = 0;
		int realFee = fee - dis;
		
		if(cho ==1) 
		{
			dis = fee/100*10;
			fee = fee-dis;
			
		}
		else if(cho ==2)
		{
		
			dis = fee/100*5;
			fee = fee-dis;
		}
		else
		{
			dis = 0;
		}
		
	System.out.println("결제하실 요금은" + fee + "입니다.(할인된 금액 :" + dis + "원)");
	}
}
