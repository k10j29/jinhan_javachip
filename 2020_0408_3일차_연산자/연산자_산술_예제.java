
import java.util.Scanner;

class 연산자_산술_예제 
{
	public static void main(String[] args) 
	{
		//키보드로 부터 값
		Scanner scan = new Scanner(System.in); 
        //입력받은 금액
		int money;
        int imsi_money;

		//권종별 갯수를 저장할 변수
		int m_50000=0;
		int m_10000=0;
		int m_5000=0;
		int m_1000=0;
		int m_500=0;
		        

		System.out.print("금액:");
		//입력받은 금액 : 126000
		money = scan.nextInt();
        imsi_money = money;

        //50000권 갯수 구하기
		m_50000 = imsi_money / 50000 ;
        // 이전계산된 50000권에 해당되는 부분 제거
		imsi_money = imsi_money % 50000;

		//10000권 갯수 구하기 
		m_10000 = imsi_money / 10000;
        //10000해당 부분 제거   
        imsi_money = imsi_money % 10000;

        //5000
        m_5000 = imsi_money / 5000;
        imsi_money = imsi_money % 5000;

		//1000
        m_1000 = imsi_money / 1000;

		imsi_money = imsi_money % 1000;

		//500
		m_500 = imsi_money / 500 ;


        System.out.println("=====[권종별 수량]====");
		System.out.printf("금액:%d(원)\n",money);
		System.out.printf("50000원권:%d(매)\n", m_50000);
		System.out.printf("10000원권:%d(매)\n", m_10000);
		System.out.printf("5000원권:%d(매)\n", m_5000);
		System.out.printf("1000원권:%d(매)\n", m_1000);
		System.out.printf("500원권:%d(개)\n", m_500);



	}
}
