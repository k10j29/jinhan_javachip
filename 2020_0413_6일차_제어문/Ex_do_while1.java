
import java.util.Scanner;

class Ex_do_while1 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
        int dan;//������
        String yn="y";//���ҷ�? 

        do 
		{
			System.out.print("��:");
			dan = scan.nextInt();

			//��ȿ�� üũ(2~9)
            if(dan>=2 && dan<=9)
			{
				//������ ���
				for(int i=1;i<=9;i++)// i = 1 2 3 ... 9
				{
				  System.out.printf("%d x %d = %d\n", dan,i,dan*i);
				}
				//���ҷ�?
				System.out.print("���ҷ�?(y/n):");
				yn = scan.next();// "y" or "Y"
			}else{
				System.out.println("2~9���̸� �Է��ϼ���");
			}
		}
		while( yn.equals("y") || yn.equals("Y") );
		





		
	}
}
