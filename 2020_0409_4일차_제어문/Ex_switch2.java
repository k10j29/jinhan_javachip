
import java.util.Scanner;

class Ex_switch2 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int kor;
		String grade="";

        System.out.print("����:");
		kor = scan.nextInt();

        if( kor>=0 && kor<=100 ){
            
			switch(kor/10)
			{
				case 10:
                case  9: grade="A"; break;
				case  8: grade="B"; break;
				case  7: grade="C"; break;
				case  6: grade="D"; break;
				default: grade="F";
			}

			System.out.printf("[%d]�� ���:%s\n",kor,grade);
		
		}else{
           System.out.printf("�߸��Էµ� ���� : [%d]\n",kor);
		}




	}
}
