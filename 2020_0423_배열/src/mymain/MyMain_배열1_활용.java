package mymain;

import java.util.Random;

public class MyMain_�迭1_Ȱ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//1) ������ ������ ���� �迭�� ������
							      //0  1  2  3  4  5  6  7  8  9 10 11  <====index
				int [] month_array = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		
		
		//1~12�� �����߻� (������)
		Random rand = new Random();
		int month  = rand.nextInt(12) + 1 ; //1~12�� 0 1 2 3 4 5 6 7 8 9 10 11 ======> +1 // 1~12

		int last_day=month_array[month-1];
		//if �Ǵ� ����ġ������ �迭�� ����� ������ ÷�� �̱⸸ �ϸ��
		
		System.out.printf("[%d]���� [%d]�ϱ���..\n", month,last_day);
		
		
		
		
		
		//�ּҰ��� 1970 �̰� �ִ밪�� 50 = 2020 (1970~2020)
		
		//�챸�ϱ�
							  //  0       1   2     3  .. 
		String [] tti_array = {"������","��","��","����",
				              // 4    5       6      7     8    9    10   11
								"��","��","ȣ����","�䳢","��","��","��","��",};
				
		//����⵵.
		int year = rand.nextInt(51) + 1970 ; //1970-2020

		int tti_index =year%12;
		
		String tti = tti_array[tti_index];
		
		
		//System.out.printf("[%d]�⵵�� ��� [%s]", year ,tti);
		System.out.printf("[%d](%d)�⵵�� ��� [%s]\n", year ,tti_index,tti);
		
		
		
		//60���� ���ϱ�
		//year % 10 = 0~9 
		//year % 12 = 0~11
		
		int gan_araay =year%12;
		
		
							//	0
		String [] gan_array = {"��","��","��","��","��",
								"��","��","��","��","��",};
		
		String [] ji_array = {"��","��","��","��","��","��","��",
								"��","��","��","��","��"};
		
		System.out.printf("[%d]�⵵�� [%s%s��]\n",year, gan_array[year%10], ji_array[year%12]);
		
		
		
	
	
		
	}

}
