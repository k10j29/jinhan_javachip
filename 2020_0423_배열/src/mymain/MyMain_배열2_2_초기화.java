package mymain;

import myutil.MyArrays2;

public class MyMain_�迭2_2_�ʱ�ȭ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//�ʱ�ȭ�ϱ� 
		
						   //�࿭ ó�� �ʱ�ȭ�� ���� ����
		int [][] mm = new int[][] {
			{1,2,3}, //0��
			{4,5,6}, //1��
			{7,8,9}  //2��
		};
		
		MyArrays2.display(mm);
		
		System.out.println();
		
		int [][] mm2 = {
			{1,2,3}, //0��
			{4,5,6}, //1��
			{7,8,9}  //2��
		};
		MyArrays2.display(mm2);
		
		int [][] block_t = {
				{0,1,0},
				{0,1,0},
				{1,1,1}
		};
		System.out.println();
		
		MyArrays2.display(block_t);
		
		//���׸���
		System.out.println();
		
		for (int i=0; i<block_t.length; i++) {
			for (int k=0; k<block_t[i].length; k++) {
				if(block_t[i][k]==0)
					System.out.printf("%3s"," ");
					else
						System.out.printf("%3s","��");
			}
			System.out.println();
		}
	}
}
