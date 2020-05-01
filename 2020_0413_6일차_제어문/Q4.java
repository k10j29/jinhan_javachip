import java.util.Scanner;

class Q4 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int su1,su2;
		String op;
        System.out.print("2정수와 연산자를 입력>>");
		//입력순서 : 숫자 연산자 숫자
		su1 = scan.nextInt();
		op  = scan.next();//문자열
		su2 = scan.nextInt();
		
        //문자열비교는 equals     cf) == 사용하지 말것 
		if(op.equals("+")){
           //더하기...
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
			   System.out.println("젯수가 0입니다(연산불가)");
		}else if(op.equals("%")){
           //
		   if(su2!=0)
		       System.out.printf("%d %% %d = %d\n",su1,su2,su1%su2);	
		   else
			   System.out.println("젯수가 0입니다(연산불가)");
		}else if(op.equals("**")){
              int res = 1;
			  for(int i=0;i<su2;i++)
				  res = res * su1;
			  System.out.printf("%d's %d승=%d\n",su1,su2,res);
		}
		


	}
}
