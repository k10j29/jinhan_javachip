package mymian;

import java.awt.GridLayout;

import javax.swing.JFrame;

public class MyMain_GridLayout extends JFrame {

	public MyMain_GridLayout() {

		// ������ Ÿ��Ʋ
		super("");
		
		GridLayout gl = new GridLayout(3, 4, 10, 10)
				
				this.setLayout(gl);
		
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