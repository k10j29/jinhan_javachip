package mymain;

import myutil.Channel;
import myutil.RemoteCon;
import myutil.TVFactory;

public class MyMain_TV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//TV�������
		TVFactory factory =  TVFactory.getInstance(); //new TVFactory();
		
		System.out.println(factory);
		System.out.println(factory.toString());
		
		//   interface      =   
		RemoteCon remoteCon =  factory.getTV();
		
		
		
		remoteCon.onOff();//TV �ѱ�
		
		remoteCon.onOff();//TV ����
		
		remoteCon.onOff();//TV �ѱ�
		
		remoteCon.volumeZero();//���Ұ� ����
		remoteCon.volumeZero();//���Ұ� ����
		
		for(int i=0;i<30;i++)
		   remoteCon.volumeUp();
		
		//���������κ��� ä���� �����ϱ����� ������ ����
		Channel channel_interface = remoteCon;
		
		channel_interface.setChannel(9);
		
		
		
		
		
		
		

	}

}
