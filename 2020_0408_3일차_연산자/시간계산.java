import java.util.Scanner;

class 시간계산 
{
	public static void main(String[] args) 
	{
		//상수선언
		final int MINUTE_TOTAL_SEC = 60;
		final int HOUR_TOTAL_SEC   = MINUTE_TOTAL_SEC * 60;
        final int DAY_TOTAL_SEC    = HOUR_TOTAL_SEC * 24; 
 
        //MINUTE_TOTAL_SEC = 59; 

		Scanner scan = new Scanner(System.in);

        //int minute_total_sec = 60;// 분당 초
		//int hour_total_sec = minute_total_sec * 60;//시간당 초
        //int day_total_sec  = hour_total_sec * 24;//일수당 초

		int day;
		int hour;
		int minute;
		int second;
        int total_second; 

		System.out.print("초:");
        total_second = scan.nextInt();  

        //일수
		day = total_second / DAY_TOTAL_SEC;
		total_second = total_second % DAY_TOTAL_SEC;

		//시간
		hour = total_second / HOUR_TOTAL_SEC;
		total_second = total_second % HOUR_TOTAL_SEC;

		//분
        minute = total_second / MINUTE_TOTAL_SEC;
		total_second = total_second % MINUTE_TOTAL_SEC;

		//잔여초
		second = total_second;

        System.out.printf("일:%d\n",day);
        System.out.printf("시:%d\n",hour);
        System.out.printf("분:%d\n",minute);
        System.out.printf("초:%d\n",second);





		

	}
}
