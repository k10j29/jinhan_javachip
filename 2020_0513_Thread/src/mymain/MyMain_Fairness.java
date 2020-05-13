package mymain;

class MyRunnable implements Runnable {

	@Override
	public void run() {

		String name = Thread.currentThread().getName();
		while (true) {

			synchronized (this) { // 누적이 되기때문에 대기하는 시간동안 동기화

				// waiut pool 에 잠든 Thread 를 깨운다.
				// 형님 / 아우 순서로 규칙적으로 나옴
				notify();

				System.out.printf("--[%s] 먼저--\n ", name);

				try {

					wait(); // wait pool 로 진입 (잠듦) //어떤 명령이 있지않은이상 꺠어나지않음
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

		Thread t1 = new Thread(r, "형님");
		Thread t2 = new Thread(r, "아우");

		t1.start();
		t2.start();
	}

}
