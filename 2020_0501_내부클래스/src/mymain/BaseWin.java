package mymain;

import javax.swing.JFrame;

public class BaseWin extends JFrame {

	public BaseWin() {

		// ������ Ÿ��Ʋ
		super("");
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

		new BaseWin();

	}

}
