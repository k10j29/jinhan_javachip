package mymain;



import java.awt.event.WindowListener;

//Templates
import javax.swing.JFrame;

public class Main_�������̽�Ȱ�� extends JFrame {

	public Main_�������̽�Ȱ��() {

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
		

		//this. �������̽�Ȱ�� .. ~~����
		//�̺�Ʈ �������
		//addXXXListener : �̺�Ʈ ������ ���
		//addXXXListener(����) : ���� <= ó����ü
		//   XXXListener : Interface
		
		//ó����ü�� �ش� interface�� ������ (�غ�) �ؾߵȴ�
		
		//���� �̺�Ʈ �� (Delegation Event Model)
		
		WindowListener listener = new MyWindowEventListener();
		this.addWindowListener(new MyWindowEventListener());
		
	}

	public static void main(String[] args) {

		new Main_�������̽�Ȱ��();

	}

}