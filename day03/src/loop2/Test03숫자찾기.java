package loop2;

import java.util.Scanner;

public class Test03숫자찾기 {
    // 1~999 사이의 숫자 중에서 7을 가지고 있는 숫자가 몇 개인지 카운트하여 출력

    public static void main(String[] args) {
        
    	
        int counter = 0;
        
        // 1부터 999까지 반복
        for (int i = 1; i <= 999; i++) {
            // 1의 자리
            int ones = i % 10;
            // 10의 자리
            int tens = i / 10 % 10;
            // 100의 자리
            int hund = i / 100;
            
            if (ones == 7 || tens == 7 || hund == 7) {
                ++counter;
            }
        }
      
        System.out.println(counter); 
    }
}