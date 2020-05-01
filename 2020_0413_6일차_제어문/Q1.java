import java.util.Scanner;

class Q1 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int su1,su2,su3;
		int min;

		System.out.print("3개의 정수를 입력하세요>>");
		su1 = scan.nextInt();
		su2 = scan.nextInt();
		su3 = scan.nextInt();

        //2수를 비교해서 작은수를 min에 넣는다
        min = su1 > su2 ? su2 : su1;
        //나머지 수를 min비교
        min = min > su3 ? su3 : min;

		System.out.printf("3수중 가장작은수 : %d\n", min);




	}
}
