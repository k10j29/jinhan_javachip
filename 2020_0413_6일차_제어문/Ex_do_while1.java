
import java.util.Scanner;

class Ex_do_while1 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
        int dan;//구구단
        String yn="y";//또할래? 

        do 
		{
			System.out.print("단:");
			dan = scan.nextInt();

			//유효성 체크(2~9)
            if(dan>=2 && dan<=9)
			{
				//구구단 출력
				for(int i=1;i<=9;i++)// i = 1 2 3 ... 9
				{
				  System.out.printf("%d x %d = %d\n", dan,i,dan*i);
				}
				//또할래?
				System.out.print("또할래?(y/n):");
				yn = scan.next();// "y" or "Y"
			}else{
				System.out.println("2~9사이만 입력하세요");
			}
		}
		while( yn.equals("y") || yn.equals("Y") );
		





		
	}
}
