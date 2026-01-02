package loop4;

import java.util.Scanner;

public class Test03구구단게임 {
	// 사용자에게 구구단 9단을 출제하여 정답을 입력받고 다음과 같이 판정하세요
	// 9x1 부터 9x9까지 출제
	// 세 번 틀리면 게임 오버
	// 세 번 미만으로 틀리고 끝까지 가면 게임 클리어
	// 게임오버든 게임클리어든 마지막에는 맞춘문제수와 틀린문제수를 각각 화면에 출력	
	
	// (+추가) 
	// 다음과 같이 점수 계산 로직을 추가해보세요
	// 콤보(combo)를 계산하여 문제를 맞출 경우 현재 콤보에 10점을 곱하여 점수로 합산
	// 콤보는 틀리면 초기화되며 연속해서 맞출 경우 누적 증가함
	// 종료 시 획득한 점수를 구하여 출력
	// 다음과 같이 문제 로직을 변경해보세요
	// 9단이 아니라 랜덤한 구구단이 나올 수 있도록 처리하려면 필요한 내용을 찾아서 적용

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int nin = 9;
		int x = 1;
		int life = 0;
		int o = 0;
		
		while(true) {
			
			System.out.println("답을구하시오:");
			System.out.println(nin +"*" +x+"=");
			++x;
			int result = sc.nextInt();
			
			if(result % 9 != 0) {
				
				++life;
				System.out.println("틀렸습니다");
				 System.out.println("-------");
			} else{++o;}
			  
			
			if(x == 10) {
				System.out.println("통과 / " + "맞힌문제:" +o + "틀린문제:" +life);
				break;
			}
			if(life == 3 ) {
				System.out.println("실패했습니다 / "+ "맞힌문제:" +o + "틀린문제:" +life);
				break;
			}
		}
	}
}
