package myutil;

public class VandingMachine {

	// 상수 (선택할 음료)

	public static final int COLA = 1;
	public static final int CYDER = 2;
	public static final int COFFEE = 3;
	public static final int WATER = 4;

	// 음료별 단가

	int cola = 500;
	int cyder = 600;
	int coffee = 700;
	int water = 800;

	int money; // 입력금액
	int drink; // 선택음료 //1,2,3,4 중에 입력

	// Get / Set 지정

	public void setMoney(int money) {

		this.money = money;
	}

	public void setDrink(int drink) {

		this.drink = drink;

		// 음료 와 단가 선택가능 / 그값으로 잔돈 구할수있음

	}

	public void display() {

		System.out.println(" =결과= ");

		//1. 음료가 잘못 선택된 경우 = drink 가 1~4 외의 수

		if (drink < 1 || drink > 4) {
			System.out.println("선택한 음료가 없습니다");
			// 현재 디스플레이 종료
			return;
		}
		//2. 음료 이름, 단가 산출
		//14 line 단가 확인
		
		String drink_name="";
		int remain=0;
		int price=0;
		
		if(drink==COLA) {
	    drink_name="콜라";
		price = cola;
		}else if (drink==CYDER) {
			drink_name="사이다";
			price = cyder; 
			
		}else if(drink==COFFEE) {
			drink_name="커피";
			price=coffee; 

			
	}else if(drink==WATER)
			drink_name="물";
			price=water;




if (money < price) {
	
	System.out.println("입금액이 부족합니다");
	return;
			
}

//잔액계산
remain = money - price;

System.out.printf("음료: %s\n", drink_name);
System.out.printf("입금: [%5d]\n", money);
System.out.printf("단가: [%5d]\n", price);
System.out.printf("잔액: [%5d]\n", remain);
	}
}
	
