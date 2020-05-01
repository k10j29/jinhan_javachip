package myutil;

//class는 다중상속안된다(단일상속만 가능)
//interface는 다중상속이 가능하다
public interface RemoteCon extends Volume,Channel{
	
	void onOff();
	void display();
}

