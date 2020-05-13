package mymain;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyMain_ThreadSync extends JFrame {

	JButton jbt_red;
	JButton jbt_yellow;
	JButton jbt_blue;

	// Thread ����ȭ ������ü�� ���
	Object syncObj = new Object();

//����Ŭ���� �κ� Thread Runnable 

	class SignalRunnable implements Runnable {

		@Override // 18���� ������
		public void run() {

			// Thread �̸� ���ϱ�
			String name = Thread.currentThread().getName();
			while (true) {

				System.out.printf("--{%s}---\n", name);
				if (name.equals("R")) {

					synchronized (syncObj) // �ٸ� Thread�� ���������� (Thread ����ȭ)

					{

						jbt_red.setBackground(Color.red);
						jbt_yellow.setBackground(Color.DARK_GRAY);
						jbt_blue.setBackground(Color.DARK_GRAY);

						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				} else if (name.equals("Y")) {

					synchronized (syncObj) {

						jbt_red.setBackground(Color.DARK_GRAY);
						jbt_yellow.setBackground(Color.ORANGE);
						jbt_blue.setBackground(Color.DARK_GRAY);

						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				} else if (name.equals("B")) {
					synchronized (syncObj) {
						jbt_red.setBackground(Color.DARK_GRAY);
						jbt_yellow.setBackground(Color.DARK_GRAY);
						jbt_blue.setBackground(Color.BLUE);

						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}

		}

	}

	public MyMain_ThreadSync() {

		// ������ Ÿ��Ʋ
		super("Thread Sync");
		setLayout(new GridLayout(1, 3)); // 1�� 3��
		jbt_red = new JButton("Red");
		jbt_red.setBackground(Color.red);

		jbt_yellow = new JButton("Yellow");
		jbt_yellow.setBackground(Color.yellow);

		jbt_blue = new JButton("Blue");
		jbt_blue.setBackground(Color.blue);

		this.add(jbt_red);
		this.add(jbt_yellow);
		this.add(jbt_blue);

		// Runnable ��ü (Thread ���� ��ü) ����
		Runnable runnable = new SignalRunnable();

		// Runnable �� 1:1�� �ϳ��� �ٴ°�
		Thread t_red = new Thread(runnable, "R");
		Thread t_yellow = new Thread(runnable, "Y");
		Thread t_blue = new Thread(runnable, "B");

		// Thread ���� => ������ run() �� ����Ǿ���
		t_red.start();
		t_yellow.start();
		t_blue.start();

		// ��ġ
		super.setLocation(100, 100);
		// ũ��
		super.setSize(500, 200);
		// �������
		super.setVisible(true);
		// ����
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		new MyMain_ThreadSync();

	}

}