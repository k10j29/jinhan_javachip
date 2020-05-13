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

				// wait pool에 잠든 쓰레드 깨운다
				if (money > 0)
					notify();

				System.out.printf("--[%s] 먼저 잔액:%d--\n", name, money);

				try {
					wait();// wait pool(잠든다)
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
		Thread t1 = new Thread(r, "형님");
		Thread t2 = new Thread(r, "아우");

		t1.start();
		t2.start();

	}

}
