package mymain;

import myutil.MyArrays2;

public class MyMain_�迭_2_3_�����������̹迭 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//�������� �迭 : 1���� �迭�� ���̰� �����迭
//�������� �迭 : 1���� �迭�� ���̰� �ٸ��迭
		
		//�������� �迭�� ��������
		int [][] mm = new int[3][];
		
		mm[0] = new int[] {1,2};
		mm[1] = new int[] {3,4,5};
		mm[2] = new int[] {6,7,8,9};
		
		MyArrays2.display(mm);
		
		System.out.println();
		
		//�������̹迭�� �ʱ�ȭ
		
		int [][] mm2 = {
				{1,2},
				{3,4,5},
				{6,7,8,9}
			};
		MyArrays2.display(mm2);
		
		
		//60����
		String [][] ganji_array = {
			/* 0�� */		{"��","��","��","��","��","��","��","��","��","��"},
			/* 1�� */		{"��","��","��","��","��","��","��","��","��","��","��","��"}
														};
		
		int year = 2020;
		//���ڿ� ����� String.format
		String ganji= String.format("%s%s��", 
				
				ganji_array [0] [year%10], 
				ganji_array [1] [year%12]
						);
	
		System.out.printf("[%d]�⵵�� %s\n", year, ganji);
		
	}
}
