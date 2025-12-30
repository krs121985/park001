package data;

public class Test03시간계산기 {
  public static void main(String []args) {
	  int minute = 1;
	  int hours = 60 * minute;
	  /* 1시간 60분은 불변의진리이므로, 변수로 저장할 필요 없음 
	   int saturdayHour = 3, saturdayMin = 50;
	   int sundayHour = 4, sundayMinute = 20;
	   int saturday = saturdayHour * 60 + saturdayMin;
	   int sunday = sundayHour *60 + sundayMin;
	   int total = saturday + sunday;
	  */
	  
	  
	  int SaturDay = 3*hours + 50*minute ;
	  int SunDay = 4*hours + 20*minute ;
	  int holiDay = SaturDay + SunDay;
	  
	  System.out.println(holiDay);
	  System.out.println(holiDay/hours + "시간" + holiDay%hours + "분");
  }
}
