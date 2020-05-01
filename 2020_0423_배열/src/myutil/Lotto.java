package myutil;

import java.util.Arrays;
import java.util.Random;

public class Lotto {

	// ��÷ �ߺ���
	// ī���Ϳ� ��ũ
	// ��÷ ��ȣ�� ���� ��ȣ�� �̿��Ͽ� ��÷ ������

	// ��÷��ȣ�� ��� �ű������
	// ��÷ ��ȣ

	int [] win_num = new int[7];
	// ���� �Է��� ����
	int [] user_num;

	// ��÷
	Random rand = new Random(); // �����߻�

	int count; // ��������
	int rank; // ���

	
	//��÷��ȣ ������ ������������ ����
	
	public void make_win_num() {
		int n = 7;
		int i = 0; //win_num �迭�� ÷�� ����
		
		OUT_WHILE:
		//��÷��ȣ 1~45������ �������� ��������		
		while (n>0) {// n = 7 6 5 4 3 2 1 
			int su = rand.nextInt(45)+1; //0~44  ==> +1 1~ 45	
			
			//�ߺ��� üũ �ߺ��� ������ ó������ �ٽ�
			for (int k=0; k<i; k++) {
				
				if(su==win_num[k])
					continue OUT_WHILE;
			}
			
			win_num[i] = su;
			i++;
			n--; }
		
		Arrays.sort(win_num, 0, 0+6); } //������ ���� ������ ���� �������� ����
	
	
	

	public void setUser_num(int[] user_num) {
		this.user_num = user_num;

		Arrays.sort(this.user_num);

		// ���� ���� �� ��� ���
		calc_rank();

	}
	private void calc_rank() {
		count = 0;
		// ��÷ ��ȣ�� ���� ��ȣ�� �̿��Ͽ� ��÷ ������
		for (int i=0; i<6; i++ ) {
			for (int k=0; k<7; k++) {
				if(user_num[i]==win_num[k])
					count++;
				
				}

			}
		}
					
	
			
			
			
			
		// count �� rank (���)
		//count == 5�ΰ��߿��� 2�� üũ
		
			
	

	
	//��� ���â
	
	public void display() {
	
		System.out.println("--��÷���--");
		System.out.println("--��÷��ȣ : ");
		
		
	//��÷��ȣ ��� �ϱ�
		
		for (int i = 0; i < win_num.length; i++) {
			
			if (i == 6)
				System.out.printf(" [[%d]]", win_num[i]);
			else
				System.out.printf("(%d)", win_num[i]);
			}
		
			
		System.out.print("\n������ȣ\n");
		for (int i = 0; i < user_num.length; i++) {
			System.out.printf("(%d)", user_num[i]);
		}
		 if (count < 3) {
 				System.out.print("\n ��! \n");

 				return; 
 	  }
		 	System.out.printf("\n�������� : %d(��)\n", count);
		
		 	System.out.println("");
            
			 int count = 0;
	            for (int i = 0; i < 6; i++) {
	                for (int k = 0; k < 7; k++) {
	                    if (user_num[i] == win_num[k]) {
	                    	count++;
	                    }
	                }
	            }
	            if (count == 0) {
	                System.out.println("�õ� ");
	            } else if (count == 1) {
	                System.out.println("6�� ");
	            } else if (count == 2) {
	                System.out.println("5�� ");
	            } else if (count == 3) {
	                System.out.println("4�� ");
	            } else if (count == 4) {
	                System.out.println("3�� ");
	            } else if (count == 5) {
	                System.out.println("2�� ");
	            } else if (count == 6) {
	                System.out.println("1�� ");
	            } else {
	                System.err.println("���� ");
	            }
			
			
		
			
			
	}
  }
		
			
			
		


