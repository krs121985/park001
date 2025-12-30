package input;

//자동 import 방법
//1. 오류나는 부분에 마우스를 올려 도움말을 클릭
//2. 단축키(ctrl + shift + o)입력
import java.util.Scanner;

public class Test02만나이계산기 {
	public static void main(String[] args) {
		// 사용자에게 태어난 년도와 월을 입력받습니다.
		// 입력받은 정보를 이용하여 만나이를 구하려고 합니다.
		// 원래대로라면 태어난지 365일이 되어야 만 1세가 되지만 계산 난이도를 낮추기 위해 12개월이 되면 만 1세로 계산합니다.
		// 사용자의 만 나이를 출력하고 이 사용자가 주민등록증 발급이 가능한 만 18세 이상인지 판정하여 출력해보세요
	   
		Scanner sc = new Scanner(System.in);
		System.out.print("태어난년도 : ");
		int year = sc.nextInt();
		System.out.print("태어난월수 : ");
		int month = sc.nextInt();
		
		int thisYear = 2024;
		int thisMonth = 12;
		
		int user = year * 12 + month;
		int current = thisYear * 12 + thisMonth;
		int gap =  current - user;
		int globalAge = gap/12;
		System.out.println("만나이 :" + globalAge);
		
		boolean cCard = globalAge >= 18;
		System.out.println("주민등록증 발급 가능 여부 :" + cCard);
	}
}
