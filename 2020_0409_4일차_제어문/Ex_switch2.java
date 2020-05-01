
import java.util.Scanner;

class Ex_switch2 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int kor;
		String grade="";

        System.out.print("국어:");
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

			System.out.printf("[%d]점 등급:%s\n",kor,grade);
		
		}else{
           System.out.printf("잘못입력된 점수 : [%d]\n",kor);
		}




	}
}
