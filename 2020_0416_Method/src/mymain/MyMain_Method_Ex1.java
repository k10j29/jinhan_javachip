
 //package = class�� ������ġ(����) ���� 
package mymain;



import java.util.Scanner;

public class MyMain_Method_Ex1 {

	
	
	//���� ���� �������� �޼ҵ忡�� �پ�������
	static int global_var = 1000;

	
	
	//���ϱ� ���
	//static : �̸��������ִ°� ��������
		public static int plus(int a, int b) {
			
			
			
			//method �� �����ڴ� ���� �����˴ϱ�? �޼ҵ� ȣ���
			//method �� �����ڴ� ���� �Ҹ�˴ϱ�? �޼ҵ� �����

			//local ��������
			
				//int a = x int b = y
			
			//���޵� a�� b�� ���� ���ؼ� c�� ������
			int c = a + b;
			
			global_var = 1000;
			
			
			
			//��� return: �ڽ��� ȣ���� ������ ������� ��ȯ�ϰڴ�. 
			// return �� : ���� ������ ��ȯ�Ѵ�. �ڷ��� ��ġ�ؾ��� 1.0 �̸� // public static int plus(int a, int b)  int �κ� double �����
			return c;
			
			
			
		}
				
				
		
		
		public static void main(String[] args) {
		//Scanner scan = new Scanner(System.in);
			
			int x = 10;
			int y = 5;
			int res;
			
			
			
			
			//plus �ϱ����� �޼ҵ� ȣ����
			//res = MyMain_Method_Ex1 .plus(x, y);
			res = plus(x, y);
			
			System.out.printf("%d+%d=%d\n", x,y,res);			
			System.out.println(global_var);
	}

}
