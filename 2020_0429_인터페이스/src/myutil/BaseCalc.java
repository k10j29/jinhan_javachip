package myutil;

public interface BaseCalc {

	//interface������ ���,�߻�޼ҵ常 ���ü� �ִ�
	// public,final ������ �ʾƵ� �ٿ��� �ؼ� 
	                     double PI  = 3.14;
	public static final double PI2 = 3.141592;
	
    //�߻�޼ҵ� ����
	//public abstract�Ⱥٿ��� �ٿ��� �ؼ�
					 int plus(int a,int b);
	public abstract int minus(int a,int b);
	
}
