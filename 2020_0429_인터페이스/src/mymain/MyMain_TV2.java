package mymain;

import myutil.RemoteCon;
import myutil.TVFactory;

public class MyMain_TV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<3;i++) {
			
			TVFactory factory = TVFactory.getInstance();//new TVFactory();
			
			RemoteCon remoteCon = factory.getTV();
			remoteCon.onOff();
			
		}

	}

}
