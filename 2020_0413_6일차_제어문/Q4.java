import java.util.Scanner;

class Q4 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int su1,su2;
		String op;
        System.out.print("2������ �����ڸ� �Է�>>");
		//�Է¼��� : ���� ������ ����
		su1 = scan.nextInt();
		op  = scan.next();//���ڿ�
		su2 = scan.nextInt();
		
        //���ڿ��񱳴� equals     cf) == ������� ���� 
		if(op.equals("+")){
           //���ϱ�...
		   System.out.printf("%d + %d = %d\n",su1,su2,su1+su2);
			
		}else if(op.equals("-")){
           //
		   System.out.printf("%d - %d = %d\n",su1,su2,su1-su2);	
		}else if(op.equals("*")){
           //
		   System.out.printf("%d * %d = %d\n",su1,su2,su1*su2);	
		}else if(op.equals("/")){
           //
		   if(su2!=0)
		       System.out.printf("%d / %d = %d\n",su1,su2,su1/su2);	
		   else
			   System.out.println("������ 0�Դϴ�(����Ұ�)");
		}else if(op.equals("%")){
           //
		   if(su2!=0)
		       System.out.printf("%d %% %d = %d\n",su1,su2,su1%su2);	
		   else
			   System.out.println("������ 0�Դϴ�(����Ұ�)");
		}else if(op.equals("**")){
              int res = 1;
			  for(int i=0;i<su2;i++)
				  res = res * su1;
			  System.out.printf("%d's %d��=%d\n",su1,su2,res);
		}
		


	}
}
