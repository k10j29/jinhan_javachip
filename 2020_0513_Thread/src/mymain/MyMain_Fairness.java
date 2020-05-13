package mymain;

class MyRunnable implements Runnable {

	@Override
	public void run() {

		String name = Thread.currentThread().getName();
		while (true) {

			synchronized (this) { // ������ �Ǳ⶧���� ����ϴ� �ð����� ����ȭ

				// waiut pool �� ��� Thread �� �����.
				// ���� / �ƿ� ������ ��Ģ������ ����
				notify();

				System.out.printf("--[%s] ����--\n ", name);

				try {

					wait(); // wait pool �� ���� (���) //� ����� ���������̻� �ƾ������
					Thread.sleep(1000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}
		}
	}

}

public class MyMain_Fairness {

	public static void main(String[] args) {

		Runnable r = new MyRunnable();

		Thread t1 = new Thread(r, "����");
		Thread t2 = new Thread(r, "�ƿ�");

		t1.start();
		t2.start();
	}

}
