package condition2;

public class Test01스위치구문 {
	public static void main(String[] args) {
		//switch-case구문
		//if는 1번계산하고 2번계산해야하는 등 속도가 다르므로 속도가 중요한 키보드, 마우스같은건 if 가 아닌 switch 문 사용해야함
		
		//월별 날짜 수 계산 프로그램
		int month = 2;
		
		switch(month) {//month 보고 판단해
		default : //else역할을 하는 구문(해당되는 케이스가 없으면 실행됨)
		case 1,3,5,7,8,10,12 : //Java13부터 가능한기능(우리는 21 사용 중), 회사는 8아니면 11, 안되는경우 번호마다 case 1, case3 이렇게 써야함
			System.out.println("31일"); break; //그만해
		case 4,6,9,11 : 
			System.out.println("30일"); break; //그만해
		case 2 : 
			System.out.println("29일"); break; //그만해
		}
	}
}

// 큰 달(31일): 1, 3, 5, 7, 8, 10, 12월
// 작은 달(30일): 4, 6, 9, 11월
// 2월 - 윤년: 29일,  평년: 28일