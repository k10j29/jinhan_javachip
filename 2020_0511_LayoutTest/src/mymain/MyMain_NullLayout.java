package mymain;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class MyMain_NullLayout extends JFrame {

	public MyMain_NullLayout() {

		// ������ Ÿ��Ʋ
		super("NullLayout");

		this.setLayout(null); // ���̾ƿ� ���� (���� ��ġ�� ũ�� �����ؾ���)

		// ����
		JLabel jlb_gender = new JLabel("����");

		JRadioButton jrd_male = new JRadioButton("����");
		JRadioButton jrd_female = new JRadioButton("����");
		
		

		int x = 10;
		int y = 10;
		int width = 100;
		int height = 30;
		/// ��ġ ũ�� �ѹ��� �����ϴ�
		jlb_gender.setBounds(x, y, width, height);
		
		x += 100; // ���� ��Ʈ�� ��ġ
		jrd_male.setBounds(x, y, width, height);
		
		x += 100; // ���� ��Ʈ�� ��ġ
		jrd_female.setBounds(x, y, width, height);

		this.add(jlb_gender);
		this.add(jrd_male);
		this.add(jrd_female);
		
		
		
		//��ư�׷����� �����ֱ� (�ϳ� ���ý� ������ �������)

		ButtonGroup bg = new ButtonGroup();
		bg.add(jrd_male);
		bg.add(jrd_female);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

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

		new MyMain_NullLayout();

	}

}