package myutil;

public class Save {

	// 1. 변수값주기

	String name; // 이름
	int money; // 저축액

	// 4. 0.1 (10%) double 이기때문에 가능
	public static double rate = 0.1; // 이율

	// 2. 기본 생성자 만들기 > 클래스 이름치고 자동완성 기능 Constructor

	public Save() {
		// TODO Auto-generated constructor stub
	}

	// 3. field 만들기 단축키 사용 (Shift, Alt, s)
	public Save(String name, int money) {
		super();
		this.name = name;
		this.money = money;
	}

	// 5. 디스플레이 해보기

	public void display() {
		System.out.printf("[%10s]-[%8d]-[%8d]\n", this.name, this.money,

				// 6. 더블하고 정수 곱해지면 더블이기때문에 묶어줌
				/// this.money*rate

				(int) (this.money * rate));
	}

}
