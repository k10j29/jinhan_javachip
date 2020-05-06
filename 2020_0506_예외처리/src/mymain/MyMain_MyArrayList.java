package mymain;

import myutil.MyArrayList;

public class MyMain_MyArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyArrayList my_list = new MyArrayList();
		
		//데이터 추가
		my_list.add(100);//0
		my_list.add(200);//1
		my_list.add(300);//2
		my_list.add(400);//3
		my_list.add(500);//4
		
		System.out.println("my_list'size=" + my_list.size());
		
		System.out.println("--전체데이터--");
		for(int i=0;i<my_list.size();i++) {// i = 0 1 2
		    try {
				int n = (Integer)my_list.get(i);
				System.out.printf("index=%d : %d\n",i,n);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
				
		
		try {
			my_list.remove(2);
			//int m = (Integer)my_list.get(10);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		System.out.println("--삭제후 데이터--");
		for(int i=0;i<my_list.size();i++) {// i = 0 1 2
		    try {
				int n = (Integer)my_list.get(i);
				System.out.printf("index=%d : %d\n",i,n);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}

}
