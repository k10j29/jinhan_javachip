package mymain;

import myutil.MyArrayList;

public class MyMain_Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Generic=> ��ü������ Ÿ��(Type)�� �����ȴ�
		MyArrayList<String> fruit_list = new MyArrayList<String>();
		
		fruit_list.add("���");//0
		fruit_list.add("����");//1
		fruit_list.add("����");//2
		fruit_list.add("����");//3
		fruit_list.add("����");//4
		
		
		System.out.println("--���� ���--");
		for(int i=0;i<fruit_list.size();i++) {
			try {
				String fruit = fruit_list.get(i);
				System.out.println(fruit);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//fruit_list.add(100);
		
		//num_list��ü�� Type�� ����->Integer
		MyArrayList<Integer> num_list = new MyArrayList<Integer>();
		
		//Auto-Boxing
		num_list.add(1);// new Integer(1)
		num_list.add(2);
		num_list.add(3);
		num_list.add(4);
		num_list.add(5);
		
		//num_list.add("6");// Integer<-String(X)
		System.out.println("--���� ���--");
		for(int i=0;i<num_list.size();i++) {
			try {
				System.out.println(num_list.get(i));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//
	//	MyArrayList<int> int_list = new MyArrayList<int>();
		
		
		
		
		
		
		
		
		
		
	}

}
