
import java.util.Scanner;

class ������ 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
        int chasu;
		int half;
        String yn="y";

		while(true){
            System.out.print("����:");
			chasu = scan.nextInt();

			if(chasu%2==0){
              System.out.println("Ȧ���� �Է��ϼ���");
			  continue;
			}

			//�߾�÷�� ���
            half = chasu / 2;
			
			//�����
			for(int i=0;i<chasu;i++){
               for(int k=0;k<chasu;k++){
                   
				   //������(�Ƕ�̵�)
				   if(i<=half){
						if( k>= half-i && k<= half+i )
							System.out.print('*');
						else
							System.out.print(' ');
				   }else{
					   //�ϴ����
                       int a = chasu-i-1;
					   if( k>= half-a && k<= half+a )
							System.out.print('*');
						else
							System.out.print(' ');
				   }
			   }
			   System.out.println();
			}

			//�׸��ҷ�?
			System.out.print("�׸��ҷ�?(y/n):");
			yn = scan.next();
			if(yn.equals("y") || yn.equals("Y"))break;
		}





	}
}
