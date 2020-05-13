package mymain;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyMain_������2 extends JFrame {

	public MyMain_������2() {
		// TODO Auto-generated constructor stub
		//Ÿ��Ʋ
		super("������");
		
//���
		JPanel upPanel = new JPanel(new GridLayout(6, 1));
		this.add(upPanel,"Center");
		//ũ������(����)
		upPanel.setPreferredSize(new Dimension(400, 200));
		upPanel.setBackground(Color.RED);
		
		
		FlowLayout fl = new FlowLayout(FlowLayout.LEFT);
		Dimension lable_size = new Dimension(80, 30);
		
		//1��°��
		JPanel p1 = new JPanel(fl);
		JLabel jlb_name = new  JLabel("��                 ��",JLabel.RIGHT);
		jlb_name.setPreferredSize(lable_size);
		
		JTextField jtf_name = new JTextField(10);
		
		JLabel jlb_gender = new JLabel("�� ��",JLabel.CENTER);
		jlb_gender.setPreferredSize(lable_size);
		
		ButtonGroup bg = new ButtonGroup();
		JRadioButton jrb_male   = new JRadioButton("��",true);
		JRadioButton jrb_female = new JRadioButton("��");
		//��� ���´�
		bg.add(jrb_male);
		bg.add(jrb_female);
		
		p1.add(jlb_name);
		p1.add(jtf_name);
		p1.add(jlb_gender);
		p1.add(jrb_male);
		p1.add(jrb_female);

		
		//2��°��
		JPanel p2 = new JPanel(fl);
		JLabel jlb_jumin = new JLabel("�ֹε�Ϲ�ȣ",JLabel.RIGHT);
		jlb_jumin.setPreferredSize(lable_size);
		
		JTextField jtf_jumin1 = new JTextField(7);
		JLabel jlb_hypon = new JLabel("-");
		JTextField jtf_jumin2 = new JTextField(7);
		
		p2.add(jlb_jumin);
		p2.add(jtf_jumin1);
		p2.add(jlb_hypon);
		p2.add(jtf_jumin2);
		
		
		//3��°��
		JPanel p3 = new JPanel(fl);
		JLabel jlb_addr = new JLabel("��                 ��",JLabel.RIGHT);
		jlb_addr.setPreferredSize(lable_size);
		JTextField jtf_addr = new JTextField(20);
		
		p3.add(jlb_addr);
		p3.add(jtf_addr);
		
		
		
		//4��°��
		JPanel p4 = new JPanel(fl);
		JLabel jlb_dept = new JLabel("��       ��      ��");
		jlb_dept.setPreferredSize(lable_size);
		
		String []  dept_array = { "��ȹ��","�ѹ���","�λ��","������" };
		JComboBox<String> jcb_dept = new JComboBox<String>(dept_array);
		
		p4.add(jlb_dept);
		p4.add(jcb_dept);
		
		
		
		//5��°��
		JPanel p5 = new JPanel(fl);
		//����ֱ�
		JLabel jlb_hobby = new JLabel("��                 ��",JLabel.RIGHT);
		jlb_hobby.setPreferredSize(lable_size);
		
		
		JCheckBox jck_hobby1 = new JCheckBox("�");
		JCheckBox jck_hobby2 = new JCheckBox("���ǰ���");
		JCheckBox jck_hobby3 = new JCheckBox("��ȭ");
		JCheckBox jck_hobby4 = new JCheckBox("��ǻ��");
		
		p5.add(jlb_hobby);
		p5.add(jck_hobby1);
		p5.add(jck_hobby2);
		p5.add(jck_hobby3);
		p5.add(jck_hobby4);
				
		
		//6��°��
		JPanel p6 = new JPanel(fl);
		JLabel jlb_profile = new JLabel("��   ��   ��   ��");
		jlb_profile.setPreferredSize(lable_size);
		
		
		p6.add(jlb_profile);
		
		//����гο� �ֱ�
		upPanel.add(p1);
		upPanel.add(p2);
		upPanel.add(p3);
		upPanel.add(p4);
		upPanel.add(p5);
		upPanel.add(p6);
			
		
		
//�ϴ�
		JPanel downPanel = new JPanel(new BorderLayout());
		this.add(downPanel,"South");
		//ũ������(����)
		downPanel.setPreferredSize(new Dimension(400, 200));
		downPanel.setBackground(Color.GREEN);
		
		
		//�ڱ�Ұ� �Է�â(JTextArea)
		JTextArea jta_profile = new JTextArea();
		JScrollPane jsp = new JScrollPane(jta_profile);
		downPanel.add(jsp,"Center");
		
		//����/�����ư
		JPanel southPanel = new JPanel();
		downPanel.add(southPanel,"South");
		//���⼭ ��ư 2�������ؼ� �־��..
		JButton jbt_save = new JButton("����");
		JButton jbt_exit = new JButton("����");
		
		southPanel.add(jbt_save);
		southPanel.add(jbt_exit);
		
		
		//����ó��                      ó����ü 
		// �̺�Ʈ�ҽ�.addXXXListener(new XXXListener(){});
		jbt_exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		
		
		

		//��ġ
		super.setLocation(100, 100);

		//ũ������ ���ϵ���..
		super.setResizable(false);
		
		//ũ��
		//super.setSize(300, 300);
		//�ڽ������� �ֺ��� Frame�� ���ζ�...
		pack();
		
		

		//�������
		super.setVisible(true);

		//����
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyMain_������2();
	}
}