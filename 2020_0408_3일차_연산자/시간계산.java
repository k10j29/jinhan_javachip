import java.util.Scanner;

class �ð���� 
{
	public static void main(String[] args) 
	{
		//�������
		final int MINUTE_TOTAL_SEC = 60;
		final int HOUR_TOTAL_SEC   = MINUTE_TOTAL_SEC * 60;
        final int DAY_TOTAL_SEC    = HOUR_TOTAL_SEC * 24; 
 
        //MINUTE_TOTAL_SEC = 59; 

		Scanner scan = new Scanner(System.in);

        //int minute_total_sec = 60;// �д� ��
		//int hour_total_sec = minute_total_sec * 60;//�ð��� ��
        //int day_total_sec  = hour_total_sec * 24;//�ϼ��� ��

		int day;
		int hour;
		int minute;
		int second;
        int total_second; 

		System.out.print("��:");
        total_second = scan.nextInt();  

        //�ϼ�
		day = total_second / DAY_TOTAL_SEC;
		total_second = total_second % DAY_TOTAL_SEC;

		//�ð�
		hour = total_second / HOUR_TOTAL_SEC;
		total_second = total_second % HOUR_TOTAL_SEC;

		//��
        minute = total_second / MINUTE_TOTAL_SEC;
		total_second = total_second % MINUTE_TOTAL_SEC;

		//�ܿ���
		second = total_second;

        System.out.printf("��:%d\n",day);
        System.out.printf("��:%d\n",hour);
        System.out.printf("��:%d\n",minute);
        System.out.printf("��:%d\n",second);





		

	}
}
