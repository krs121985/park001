package loop;

public class Test04숫자찾기 {
public static void main(String[]args) {
		
		// 1부터 100 사이의 3의 배수
		// 1부터 100 사이의 5가 포함된 숫자 (ex : 5, 15, 25, 35, 45, 50, 51, 52, ...)
		// 1부터 100 사이의 3, 6, 9 게임에서 박수치는 숫자 (ex : 3, 6, 9, 13, 16, 19, ...)

		for(int i = 1; i<=100; i++) 
		{	
			    
				if(i%3 == 0 ) {
					System.out.println(i);
				}
		}
		
		System.out.println("------------------");
		
 
				
				
        for (int i = 1; i <= 100; i++) {
            // 1의 자리 숫자
            int ones = i % 10;
            // 10의 자리 숫자
            int tens = i / 10;

            // 1의 자리나 10의 자리에 5가 포함된 경우 출력
            if (ones == 5 || tens == 5) {
                System.out.println(i);
            }
        }
        
		System.out.println("------------------");
		
		
		for(int i = 1; i<=100; i++) {
			
            int ones = i % 10;
            int tens = i / 10;

            if (ones == 3 || ones == 6 ||ones == 9 ||tens == 3||tens == 6||tens == 9) {
                System.out.println(i);
      }		
    }
  }
}
