package mymain;

import myutil.MyArrays2;

public class MyMain_�迭2_4_ȸ������ {

	static int [][] rotate_right_90(int [][] src) {
		
		//���� �迭�� ������ �纻�迭 ����
		
		int rows = src.length;     //��
		int cols = src[0].length;  //��
		
		int [][] dest = new int [rows][cols];
		
		for (int i=0; i<rows; i++) { 		//��÷��
			for (int k=0; k<cols; k++) { 	//��÷��
				dest [i][k] = src [(rows-1)-k][i];
				
			}
		}
		return dest;
		
	}
	
	static int [][] rotate_right_180(int [][] src) {
		
		//���� �迭�� ������ �纻�迭 ����
		
		int rows = src.length;     //��
		int cols = src[0].length;  //��
		
		int [][] dest = new int [rows][cols];
		
		for (int i=0; i<rows; i++) { 		//��÷��
			for (int k=0; k<cols; k++) { 	//��÷��
				dest [i][k] = src [(rows-1)-i][(rows-1)-k];
				
			}
		}
		return dest;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] src = new int[5][5];

		MyArrays2.setArray(src);
		// ���� ���� ���
		System.out.println("�����Դϴ�.");

		MyArrays2.display(src);
		
		
		System.out.println();
		
		//������ 90�� ȸ�� ��� (������)
		
		int [][] res = rotate_right_90(src); 
		System.out.println("rotate ���");
		MyArrays2.display(res);
		
		int [][] res2 = rotate_right_180(src); 
		System.out.println("rotate 180 ���");
		MyArrays2.display(res2);
		
		

	}

}
