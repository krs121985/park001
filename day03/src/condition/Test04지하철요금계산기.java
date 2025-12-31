package condition;

import java.util.Scanner;

public class Test04지하철요금계산기 {
	public static void main(String[] args)
	{
	 	System.out.println("지하철 요금표는 다음과 같습니다.");
	 	System.out.println("-----------------------");
	 	System.out.println("- 어르신(65세이상) : 무료");
	 	System.out.println("- 성인(20~64세): 1550원");
	 	System.out.println("- 청소년(14~19세): 900원");
	 	System.out.println("- 어린이(8~13세): 550원");
	 	System.out.println("- 영유아(7세이하): 무료");
	 	System.out.println("-----------------------");
	 	System.out.print("출생 연도를 입력하세요 [4자리]");

	 	Scanner sc = new Scanner(System.in);
	 	
	 	int year = sc.nextInt();
	 	int pathYear = 2025;
	 	int age = pathYear-year+1;
		System.out.println(age);
		
		int cardFee = 500;
	 	int price;
	 	if( age >= 65 || age <=7) {
	 		price = 0;
	 	}
	 	else if(age>=20) 
	 	{   
	 		price = 1550;
	 	}
	 	else if(age>=14) 
	 	{
	 		price = 900;
	 	}
	 	else
	 	{
	 		price = 550;
	 	}
	 	int total = price + cardFee;
	 	System.out.println("보증금포함" + total +"원입니다.");
	}
}
