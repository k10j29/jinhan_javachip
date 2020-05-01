package myutil;

public class TVFactory {

	//single-ton구현
	static TVFactory single = null;
	public static TVFactory getInstance() {
		if(single==null)
			single = new TVFactory();
		return single;
	}
	
	private TVFactory() {
		// TODO Auto-generated constructor stub
		System.out.println("--TVFactory(): TV 공장 생성--");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		System.out.println(super.toString());
		return "TV 생산하는 클라스";
		
	}
	
	
	public RemoteCon getTV() {
		//TV생성
		TV tv = new TV();
		return tv;
	}
}
