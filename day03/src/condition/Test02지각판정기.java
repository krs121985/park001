package condition;

import java.util.Scanner;

public class Test02지각판정기 {
	public static void main(String[] args) {
		/*다음 요구사항에 맞는 프로그램을 구현하세요

우리 과정은 카드 태그 시각이 9시 41분인 경우부터 지각으로 처리됩니다.
사용자에게 입실시각을 입력받아 지각인지 아닌지 판정하여 출력하는 프로그램을 구현하세요

사례 1 : 정상 출결인 경우
입실 시각을 입력하세요
(0935)
정상 출석입니다


사례 2 : 지각인 경우
입실 시각을 입력하세요
(1020)
지각입니다
*/
		Scanner sc = new Scanner(System.in);
		System.out.println("입실 시각을 입력하세요");
		
		int time = sc.nextInt();
		int hour = time/100;
		int minute = time%100;
		//또는 int tag = hour*60+minute
		//    int judge = 9*60+40
		;
		if(hour<9 || hour==9 && minute<=40) //8시 이전이거나 9시라면 40분 이전인경우 
		{
			System.out.println("정상 출석입니다.");
		}
		if(hour>9 || hour==9 && minute>40) //10이 이상이거나 9시라면 40분 이상인경우
		{
					System.out.println("지각입니다.");
		}
	}
}
