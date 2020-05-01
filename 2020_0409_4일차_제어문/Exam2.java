import java.util.Scanner;

class Exam2 
{
	public static void main(String[] args) 
	{
		Scanner scan  = new Scanner(System.in);
		int ft;
		int inch;
		double cm;
        
		//입력방법 : 값사이를 공백띄우기
		//           값사이를 엔터
		System.out.print("ft/inch:");
		ft   = scan.nextInt();
		inch = scan.nextInt();

        //cm 계산
		cm = (ft*12 + inch)*2.54;



        System.out.printf("%d(ft) %d(inch)는 %.2f(cm)\n",
			               ft,   inch,        cm);


      


	}
}
