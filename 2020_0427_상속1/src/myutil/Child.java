package myutil;

public class Child extends Parent {

	int c_money;

	public Child() {
		// TODO Auto-generated constructor stub
		super();
		
		System.out.println("child()");
		c_money = 50;
		
	}

	public Child(int c_money) {
		super();
		System.out.println("child(int)");
		this.c_money = c_money;
	}
	
	public Child (int c_money, int p_money) {
		
		super(p_money); // Parent (int) call
		System.out.println("child(int,int)");
		this.c_money = c_money;
		
	}

	public void display() {

		super.display();
		
		System.out.printf("child's money : %d\n", c_money);

	}

}
