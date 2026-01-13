package api.util.collection2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test02팔로우처리 {
	public static void main(String[] args) {
		
		//샘플 프로그램
		//어느 정도의 더미 데이터를 넣어두고 입력을 받았을 때 팔로우 또는 해지 처리를 하도록 구현
		//반복적으로 구현하는것이 아니라 1회 구현에 초점을 맞춤
		
		//Set<String> a = new TreeSet<>(); // 팔로우 몰록까지 같이보여줘야 할 경우
		Set <String> a = new HashSet<>(); // 팔로우 여부만 알면되는경우
		Scanner sc = new Scanner(System.in);
		
				
		while(true) 
		{
			System.out.print("아이디 입력 : ");
			String username = sc.nextLine();
		
			if(username.equals("종료")) break;
			if(a.contains(username)) 
			{
				System.out.println("["+username+"]님을 팔로우 해제하였습니다.");
				a.remove(username);
			}
			else 
			{
					System.out.println("["+username+"]님을 팔로우하였습니다.");
					a.add(username);
			}
		
		}
		sc.close();
		System.out.println("----------------");
		System.out.println("프로그램을 종료합니다.");
		System.out.println("팔로우한 인원수는 총 " + a.size() +"명 입니다.");
		
		for(String id : a) {
			System.out.println(" > " + id);
		}
	}
}

	

