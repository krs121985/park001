package api.util.collection3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test02로그인판정프로그램 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Map<String, String> login = new HashMap();
		
		login.put("tjadmin","admin1234"); 
		login.put("tjstudent","student1234"); 
		login.put("tjteacher","teacher1234");
		login.put("tjmanager","manager1234");
		
		System.out.print("아이디를 입력하세요 : ");
		String id = sc.next();
		boolean idTest = login.containsKey(id);
		
		if(idTest == true) {
			System.out.println("비밀번호를 입력하세요 : ");
			String pw = sc.next();
			boolean pwTest = login.containsValue(pw);
			boolean pwTestTwo = pw.equals(login.get(id));
			//System.out.println(pwTestTwo);
			
			
			if(pwTest && pwTestTwo )//System.out.println(a.indexOf("naver"));
			{
				System.out.println("로그인 성공");
			}
			else 
			{
				System.out.println("다시 입력하세요");
				return;
			}
		}
		
		else
		{
			System.out.println("다시 입력하세요");
			return;
		}
		sc.close();
	}
}

