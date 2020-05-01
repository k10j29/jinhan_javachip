
import java.util.Scanner;

class 마름모 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
        int chasu;
		int half;
        String yn="y";

		while(true){
            System.out.print("차수:");
			chasu = scan.nextInt();

			if(chasu%2==0){
              System.out.println("홀수만 입력하세요");
			  continue;
			}

			//중앙첨자 계산
            half = chasu / 2;
			
			//별출력
			for(int i=0;i<chasu;i++){
               for(int k=0;k<chasu;k++){
                   
				   //상단출력(피라미드)
				   if(i<=half){
						if( k>= half-i && k<= half+i )
							System.out.print('*');
						else
							System.out.print(' ');
				   }else{
					   //하단출력
                       int a = chasu-i-1;
					   if( k>= half-a && k<= half+a )
							System.out.print('*');
						else
							System.out.print(' ');
				   }
			   }
			   System.out.println();
			}

			//그만할래?
			System.out.print("그만할래?(y/n):");
			yn = scan.next();
			if(yn.equals("y") || yn.equals("Y"))break;
		}





	}
}
