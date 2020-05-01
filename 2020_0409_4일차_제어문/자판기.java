import java.util.Scanner;
class 자판기 
{
	public static void main(String[] args) 
	{
        Scanner scan = new Scanner(System.in);
 
        //음료단가
		int price_cola   = 500;
		int price_cider  = 600;
		int price_coffee = 1000;
 
		int money;   //지불금액
		String drink;//선택음료
		int count;   //수량

        int price;//선택음료단가
		int amount;//계
		int tax;//부가세
        int total_amount;//총액
        int remain_money;//잔액

		System.out.println("==================================");
		System.out.println("콜라(500)  사이다(600) 커피(1000)");
		System.out.println("==================================");

        //입력
		System.out.print("지불한금액:");
		money = scan.nextInt();
        
		System.out.print("음료선택:");
		drink = scan.next();

        System.out.print("수량:");
		count = scan.nextInt();

        //선택음료에 따라 단가 얻기

		//if(drink.equals("콜라")) price = price_cola;

		switch(drink)
		{
			case "콜라":   price = price_cola;break;
			case "사이다": price = price_cider;break;
			case "커피":   price = price_coffee;break;
			default: price = 0;
		}

		if(price==0){
			System.out.println("선택된 음료가 없습니다");
			return;//프로그램 끝.
		}

		//계산
		amount = price * count;
		tax    = (int)(amount*0.1);
		total_amount = amount + tax;
		remain_money = money - total_amount;
         
		//출력..
        System.out.println("------------------------------------" );
		System.out.printf("금    액:%10d\n", amount);
		System.out.printf("부 가 세:%10d\n", tax);
		System.out.printf("총    액:%10d\n", total_amount);
		System.out.println("------------------------------------" );
		System.out.printf("거스름돈:%10d\n", remain_money);




	}
}
