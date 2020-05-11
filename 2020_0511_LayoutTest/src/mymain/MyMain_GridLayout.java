package mymain;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyMain_GridLayout extends JFrame {

	public MyMain_GridLayout() {

		// ������ Ÿ��Ʋ
		super("Grid ����");

		GridLayout gl = new GridLayout(6, 4, 1, 1);

		this.setLayout(gl);

		// ���������, �׻� 3���� ������
		// ���� �þ���� �پ�����
		for (int i = 1; i <= 24; i++) {

			String title = String.format("��ư%01d", i);
			JButton jbt = new JButton(title);
			this.add(jbt);
		}

		// ��ġ
		super.setLocation(100, 100);
		// ũ��
		super.setSize(300, 300);
		// �������
		super.setVisible(true);
		// ����
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		new MyMain_GridLayout();

	}

}