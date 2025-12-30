package data;

public class Test06성적계산기 {
 public static void main(String[]args) {
	 /*국어 : 85점
	   수학 : 88점
	   영어 : 83점
       이 학생의 총점과 평균을 구하여 출력하세요.
	 */
	 
	 int krScore = 85;
	 int mathScore = 88;
	 int engScore = 83;
	 int totalScore = krScore + mathScore + engScore;
	 System.out.println(totalScore);
	 
	 double totalAvg = (double)totalScore / 3;
	 System.out.println(totalAvg);
 }
}
