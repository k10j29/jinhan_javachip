
import java.util.Scanner;

class Ex_if_���� 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
        int kor;
		String grade="";

		System.out.print("����:");
		kor = scan.nextInt();

        //1. ��ȿ����üũ..
		//2  ��ް��
		//   A0       A      A+
		//   3        3      4
		//   90~92   93~95   96~
		//   80~82   83~85   86~ 

		if(kor>=0 && kor<=100){
          //��ް��
		  if(kor>=96) grade="A+";
		  else if(kor>=93) grade="A";
		  else if(kor>=90) grade="A0";

		  else if(kor>=86) grade="B+";
		  else if(kor>=83) grade="B";
		  else if(kor>=80) grade="B0";

		  else if(kor>=76) grade="C+";
		  else if(kor>=73) grade="C";
		  else if(kor>=70) grade="C0";

		  else if(kor>=66) grade="D+";
		  else if(kor>=63) grade="D";
		  else if(kor>=60) grade="D0";

		  else
			  grade="F";

		  System.out.printf("[%d]�� ���:%s\n",kor,grade);




		}else{
           System.out.printf("[%d]���� ��ȿ���� ���� �����Դϴ�\n",kor); 
		}



	}
}
