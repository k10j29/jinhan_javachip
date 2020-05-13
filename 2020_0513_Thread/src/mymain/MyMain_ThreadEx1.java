package mymain;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class MyMain_ThreadEx1 extends JFrame {

	// ProgressBar �����

	JProgressBar jpb_red;
	JProgressBar jpb_green;
	JProgressBar jpb_blue;

	Thread t_red;
	Thread t_green;
	Thread t_blue;

//Thread �� Running ���� üũ	
	boolean bRedRunning = true;
	boolean bGreenRunning = true;
	boolean bBlueRunning = true;

//���� Ŭ������ Thread ����
//�Ʒ� ���� Ŭ���������� JProgressBar jpb_red; �� ����
	class RedThread extends Thread {

		@Override // ���� �ڽ��� �޼ҵ带 ������
		public void run() {
			System.out.println(currentThread().getName());

			// ���ѷ��� ������ ��������������
			while (true) {

				try {
					int value = jpb_red.getValue();// ���簪 ����
					value++; // �ϳ��þ

					if (value > jpb_red.getMaximum()) // red Progress par�� �ִ밪�� 100�������ٰ� �ٽ� 0����
						value = 0;

					jpb_red.setValue(value);

					sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		} // run method (end) �� �����ϴ� ���� > �ش� Thread�� �Ҹ��̵˴ϴ�.

	}

	class GreenThread extends Thread {

		@Override // ���� �ڽ��� �޼ҵ带 ������
		public void run() {
			System.out.println(currentThread().getName());

			// ���ѷ��� ������ ��������������
			while (true) {

				try {
					int value = jpb_green.getValue();// ���簪 ����
					value++; // �ϳ��þ

					if (value > jpb_green.getMaximum()) // red Progress par�� �ִ밪�� 100�������ٰ� �ٽ� 0����
						value = 0;

					jpb_green.setValue(value);

					sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		} // run method (end) �� �����ϴ� ���� > �ش� Thread�� �Ҹ��̵˴ϴ�.

	}

	class BlueThread extends Thread {

		@Override // ���� �ڽ��� �޼ҵ带 ������
		public void run() {

			System.out.println(currentThread().getName());

			// ���ѷ��� ������ ��������������
			while (true) {

				try {
					int value = jpb_blue.getValue();// ���簪 ����
					value++; // �ϳ��þ

					if (value > jpb_blue.getMaximum()) // red Progress par�� �ִ밪�� 100�������ٰ� �ٽ� 0����
						value = 0;

					jpb_blue.setValue(value);

					sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		} // run method (end) �� �����ϴ� ���� > �ش� Thread�� �Ҹ��̵˴ϴ�.

	}

	public MyMain_ThreadEx1() {

		// ������ Ÿ��Ʋ
		super("Thread ����");

		this.setLayout(new GridLayout(6, 1));

		jpb_red = new JProgressBar();
		jpb_red.setForeground(Color.red);
		JButton jbt_red = new JButton("Pause");// ������ư
		jbt_red.setForeground(Color.RED); // ���ڻ�

		jpb_green = new JProgressBar();
		jpb_green.setForeground(Color.green);
		JButton jbt_green = new JButton("Pause");// ������ư
		jbt_green.setForeground(Color.GREEN); // ���ڻ�

		jpb_blue = new JProgressBar();
		jpb_blue.setForeground(Color.blue);
		JButton jbt_blue = new JButton("Pause");// ������ư
		jbt_blue.setForeground(Color.blue); // ���ڻ�

		this.add(jpb_red);
		this.add(jbt_red); // ���� ��ư ���̻��̿� �ֱ� 138 ����
		this.add(jpb_green);
		this.add(jbt_green);
		this.add(jpb_blue);
		this.add(jbt_blue);

		// ���ǰ��ֱ�
		jpb_red.setValue(70);
		jpb_green.setValue(30);
		jpb_blue.setValue(20);

//��ư�̺�Ʈ

		jbt_red.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				bRedRunning = !bRedRunning; // ��� ��� (ture ���״� false ���״�)
				if (bRedRunning == false) {
					// �Ͻ�����
					t_red.suspend(); // �Ͻ����� ��Ű�� ���
					jbt_red.setText("Resume");
				} else {
					t_red.resume(); // �ƴϸ� �簡�� ���Ѷ�
					jbt_red.setText("Pause");
				}
			}
		});

		jbt_green.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				bGreenRunning = !bGreenRunning;
				if (bGreenRunning == false) {
					// �Ͻ�����
					jbt_green.setText("Resume");
					t_green.suspend(); // �Ͻ����� ��Ű�� ���
				} else {
					t_green.resume(); // �ƴϸ� �簡�� ���Ѷ�
					jbt_green.setText("Pause");
				}
			}
		});

		jbt_blue.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				bBlueRunning = !bBlueRunning;
				if (bBlueRunning == false) {
					// �Ͻ�����
					t_blue.suspend(); // �Ͻ����� ��Ű�� ���
					jbt_blue.setText("Resume");
				} else {
					t_blue.resume(); // �ƴϸ� �簡�� ���Ѷ�
					jbt_blue.setText("pause");
				}
			}
		});

//RedThread �����ϰ� ������Ŵ (�����۾� 19���� ������)

//���� Thread (�ڽ� Thread)
		t_red = new RedThread();
		t_red.start(); // Runnable(���) => Running (������� run method ����)

		t_green = new GreenThread();
		t_green.start(); // Runnable(���) => Running (������� run method ����)

		t_blue = new BlueThread();
		t_blue.start(); // Runnable(���) => Running (������� run method ����)

		// ��ġ
		super.setLocation(100, 100);
		// ũ��
		super.setSize(400, 300);
		// �������
		super.setVisible(true);
		// ����
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) { // Primary Thread (�� ������)

		System.out.println(Thread.currentThread().getName());

		new MyMain_ThreadEx1();

	}

}
