package api.util.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test06사다리게임 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("인원 수 입력");
		int people = sc.nextInt();
		sc.nextLine();//의미없는 청소코드 추가
		
		if(people < 2 || people > 24) {
			System.err.println("인원 수 오류");
			System.exit(0);//프로그램 종료
		}
		
		List <String> names = new ArrayList<>();
		List <String> actions = new ArrayList<>();
		
		//이름 입력
		for(int i = 0; i< people; i++ ) {
			System.out.println("이름 : ");
			String name = sc.nextLine();
			names.add(name);
		}
		
		//항목 입력
		for(int i = 0; i< people; i++ ) {
			System.out.println("항목 : ");
			String action = sc.nextLine();
			actions.add(action);
		}
		
		sc.close();
		Collections.shuffle(actions);
		
		for(int i=0; i < people; i++) {
			System.out.println(names.get(i) + " → " + actions.get(i));
		}
		
	}
}
