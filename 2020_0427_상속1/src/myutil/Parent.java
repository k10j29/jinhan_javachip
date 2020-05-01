package myutil;

public class Parent {


		int p_money;
		
	public Parent() {
		// TODO Auto-generated constructor stub
		System.out.println("parent()");
		p_money = 100;
	}

	public Parent(int p_money) {
		super();
		System.out.println("parent(int)");
		this.p_money = p_money;
	}
   
	public void display () {
		
		
		System.out.printf("parent's money : %d\n", p_money);
		
	}
		

}
