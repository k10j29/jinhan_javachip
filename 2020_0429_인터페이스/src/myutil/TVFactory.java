package myutil;

public class TVFactory {

	//single-ton����
	static TVFactory single = null;
	public static TVFactory getInstance() {
		if(single==null)
			single = new TVFactory();
		return single;
	}
	
	private TVFactory() {
		// TODO Auto-generated constructor stub
		System.out.println("--TVFactory(): TV ���� ����--");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		System.out.println(super.toString());
		return "TV �����ϴ� Ŭ��";
		
	}
	
	
	public RemoteCon getTV() {
		//TV����
		TV tv = new TV();
		return tv;
	}
}
