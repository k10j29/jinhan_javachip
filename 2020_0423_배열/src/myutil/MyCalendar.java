package myutil;

import java.util.Calendar;

public class MyCalendar {

                            //1  2  3  4  5  6  7  8  9  10 11 12    (-1)
		int [] month_array = {31,28,31,30,31,30,31,31,30,31,30,31}; //�� ���� ��������
		
		int [][] cal_array; //6�� 7��
		int year;
		int month;
				
		//���� üũ method	//���� üũ method	//���� üũ method	//���� üũ method
		private boolean isYoon() {
		
			return (year%400==0) || (year%4==0 && year%100!=0); 
		}	
					
	public void setDate(int y, int m) {
	 year = y;
	 month = m;
	
	
		 /////////////////�޷¸����
		 make_calendar ();
	}

	private void make_calendar() {
		// TODO Auto-generated method stub
		cal_array = new int[6][7];

		// 1) ���� ���ϱ� //1) ���� ���ϱ� //1) ���� ���ϱ� //1) ���� ���ϱ� //1) ���� ���ϱ�
		Calendar c = Calendar.getInstance();
		// ��¥ �����ϱ� ����� �ý��� ��¥ �ϱ� ==> �Է¹��� ��¥��

		// month-1 �ϴ������� �迭�� õ��° ĭ�� 0�̱� ������ -1 ���Ѽ� 1 2 3 4 5 6
		// �迭�� ÷�ڷ� ����ϱ�����
		c.set(year, month-1, 1);
		// ���� �˾Ƴ��� // ���� �˾Ƴ���// ���� �˾Ƴ���// ���� �˾Ƴ���// ���� �˾Ƴ���
		int yoil = c.get(Calendar.DAY_OF_WEEK)-1;

		//System.out.println(yoil);// �����̸�

		if (this.isYoon())
			month_array[1] = 29; // ����
		else
			month_array[1] = 28; // ���

		// 2) �޷��� ��÷�� 2) �޷��� ��÷�� 2) �޷��� ��÷�� 2) �޷��� ��÷��
		int week = 0;
		
		// ��¥ ä��� // ��¥ ä��� // ��¥ ä��� // ��¥ ä���
		for (int i = 1; i<=month_array[month-1]; i++) {
			cal_array[week][yoil] = i;
			
			yoil++; //4 5 6 �����ٷ� ������
			if(yoil>6) {
				week++;
				yoil=0;
				
				
				
			}
		}

	}

	////////////// ��������������� ���� ����ϱ�

	public void display() {
		
		for (int i = 0; i < 6; i++) {
			for (int k = 0; k < 7; k++) {
				System.out.printf("%3d", cal_array[i][k]);
			}

		System.out.println();
	 }
	}
}
