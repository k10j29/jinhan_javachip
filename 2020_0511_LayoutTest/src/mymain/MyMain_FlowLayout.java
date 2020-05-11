package mymain;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyMain_FlowLayout extends JFrame {

	public MyMain_FlowLayout() {

		// ������ Ÿ��Ʋ
		super("FlowLayout ����");

		
		FlowLayout fl = new FlowLayout(FlowLayout.RIGHT, 10 ,15);
		this.setLayout(fl); // ��ġ��� ���� (BorderLayout > FlowLayout)

		for (int i = 0; i <= 10; i++) {
			
			String title = String.format("%01d",i);
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

		new MyMain_FlowLayout();

	}

}