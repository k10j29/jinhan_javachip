//����� (���� �˰������)

//Singleton

package mymain;

import java.util.Calendar;

import java.util.Date;

import myutil.My_Singleton;

public class MyMain_Singleton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//1. sayHello �� ���� �˰�ʹ�
		// instance method �̱� ������ ��ü�� ������ �Ǿ���� new ���
		//100���� ������ ��ü new 100�� �������� 
		
		
		//2. for�� ���� 100���̾��°� Ȯ��
		
		for(int i=0; i<10; i++){
			
		//My_Singleton ms = new My_Singleton();
			
		// My_Singleton ���� getinstance ���	20�����̶� ������ Ȯ�� 
		// ������ 13line ~ 19line ����
			
			
	   //util 28line public�� private ���� �൵ ��밡�� ���۹��� �����
		// �׷��� 23line �� �ٸ� ���Ͽ��ֱ⶧���� ������
		My_Singleton ms = My_Singleton.getinstance();
		ms.sayHello();
		}
		
		System.out.println();
		
		// �ݺ���Ű��
		// �ð� ����� Calendar
		while (true) {
		Calendar c = Calendar.getInstance();
		
		int hour = c.get(Calendar. HOUR);
		int minute = c.get(Calendar. MINUTE);
		int second = c.get(Calendar. SECOND);
		
			
		//java.util Date ��¥ ���ϱ� ������� jdk 5.0 ����
//////// new ��ü�� ��� ������ �� 44 LINE Calendar �� �ֽ� ��İ� ����
		
		//Date today = new Date();	
		//int hour = today.getHours();
		//int minute = today.getMinutes();
		//int second = today.getSeconds();
		
		System.out.printf("%02d:%02d:%02d\n", hour, minute, second);
		
		Thread.sleep(1000);
		
			}
		}
	}
