package mymain;

class MyRunnable2 implements Runnable {

	int money = 10000;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String name = Thread.currentThread().getName();
		while (true) {

			synchronized (this) {
				money = money - 1000;

				// wait pool�� ��� ������ �����
				if (money > 0)
					notify();

				System.out.printf("--[%s] ���� �ܾ�:%d--\n", name, money);

				try {
					wait();// wait pool(����)
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
	}

}

public class MyMain_Starvation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = new MyRunnable2();
		Thread t1 = new Thread(r, "����");
		Thread t2 = new Thread(r, "�ƿ�");

		t1.start();
		t2.start();

	}

}
