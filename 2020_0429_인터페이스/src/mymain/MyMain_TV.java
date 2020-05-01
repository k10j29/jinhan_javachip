package mymain;

import myutil.Channel;
import myutil.RemoteCon;
import myutil.TVFactory;

public class MyMain_TV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//TV생산공장
		TVFactory factory =  TVFactory.getInstance(); //new TVFactory();
		
		System.out.println(factory);
		System.out.println(factory.toString());
		
		//   interface      =   
		RemoteCon remoteCon =  factory.getTV();
		
		
		
		remoteCon.onOff();//TV 켜기
		
		remoteCon.onOff();//TV 끄기
		
		remoteCon.onOff();//TV 켜기
		
		remoteCon.volumeZero();//음소거 설정
		remoteCon.volumeZero();//음소거 해제
		
		for(int i=0;i<30;i++)
		   remoteCon.volumeUp();
		
		//리모컨으로부터 채널을 제어하기위한 설명서만 추출
		Channel channel_interface = remoteCon;
		
		channel_interface.setChannel(9);
		
		
		
		
		
		
		

	}

}
