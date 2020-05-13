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
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyMain_������ extends JFrame {

	public MyMain_������() {

		// ������ Ÿ��Ʋ
		super("������");

//���

		JPanel upPanel = new JPanel(new GridLayout(6, 1)); // �������� ��� ���� �κп� ��
		this.add(upPanel, "Center");

//ũ������ (����)

		upPanel.setPreferredSize(new Dimension(400, 300));
		upPanel.setBackground(Color.red);

		FlowLayout fl = new FlowLayout(FlowLayout.LEFT);
//1

		JPanel p1 = new JPanel(fl);
		JLabel jck_name = new JLabel("��         ��",JLabel.RIGHT);
		p1.add(jck_name);
		JTextField jck_namef = new JTextField(10);
		p1.add(jck_namef);

		JLabel jlb_gender = new JLabel("��         ��",JLabel.CENTER);

		JRadioButton jrd_male = new JRadioButton("����");
		JRadioButton jrd_female = new JRadioButton("����");

		p1.add(jlb_gender);
		p1.add(jrd_male);
		p1.add(jrd_female);

		ButtonGroup bg = new ButtonGroup();
		bg.add(jrd_male);
		bg.add(jrd_female);

//2

		JPanel p2 = new JPanel(fl);
		JLabel jck_num = new JLabel("�ֹε�Ϲ�ȣ", JLabel.RIGHT);
		p2.add(jck_num);
		JTextField jck_num1 = new JTextField(8);
		p2.add(jck_num1);
		JLabel jlb_num2 = new JLabel("-");
		p2.add(jlb_num2);
		JTextField jck_num3 = new JTextField(8);
		p2.add(jck_num3);

//3

		JPanel p3 = new JPanel(fl);
		JLabel jck_addr = new JLabel("��         ��",JLabel.RIGHT);

		p3.add(jck_addr);
		JTextField jck_addr2 = new JTextField(20);
		p3.add(jck_addr2);

//4

		JPanel p4 = new JPanel(fl);
		JLabel jlb_dept = new JLabel("��   ��   ��",JLabel.RIGHT);
		p4.add(jlb_dept);

		String[] dept_array = { "��ȹ��", "���ɺ�", "�ѹ���", "�λ��" };
		JComboBox<String> jcb_dept = new JComboBox<String>(dept_array);
		p4.add(jcb_dept);
//5

		JPanel p5 = new JPanel(fl);

		JLabel jck_hob = new JLabel("��         ��",JLabel.RIGHT);
		JCheckBox jck_hob1 = new JCheckBox("�");
		JCheckBox jck_hob2 = new JCheckBox("���ǰ���");
		JCheckBox jck_hob3 = new JCheckBox("��ȭ");
		JCheckBox jck_hob4 = new JCheckBox("��ǻ��");
		p5.add(jck_hob);
		p5.add(jck_hob1);
		p5.add(jck_hob2);
		p5.add(jck_hob3);
		p5.add(jck_hob4);

//6

		JPanel p6 = new JPanel(fl);
		JLabel jlb_profile = new JLabel("��  ��  ��  ��",JLabel.RIGHT);
		p6.add(jlb_profile);

//��� �гγֱ�		
		upPanel.add(p1);
		upPanel.add(p2);
		upPanel.add(p3);
		upPanel.add(p4);
		upPanel.add(p5);
		upPanel.add(p6);

//�ϴ�

		JPanel downPanel = new JPanel(new BorderLayout());
		this.add(downPanel, "South");

//ũ������ (����)

		downPanel.setPreferredSize(new Dimension(400, 200));
		downPanel.setBackground(Color.green);

//�ڱ�Ұ� �Է�â (JTextArea) ������ �Է�

		JTextArea jta_profile = new JTextArea();
		// ��ũ��
		JScrollPane jsp = new JScrollPane(jta_profile);
		downPanel.add(jsp, "Center");

//���� ���� ��ư

		JPanel southPanel = new JPanel();
		downPanel.add(southPanel, "South");

		southPanel.setPreferredSize(new Dimension(40, 40));
		southPanel.setBackground(Color.blue);

		JButton jbt_save = new JButton("����");
		southPanel.add(jbt_save);
		JButton jbt_finish = new JButton("����");
		southPanel.add(jbt_finish);
		
		jbt_finish.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent jbt_finish) {
				
				System.exit(0);
			}
		});
		
		
		
		
		
		
		
		
		
		
		

		// ��ġ
		super.setLocation(800, 200);

		// �ڽ� ������ ����
		super.setResizable(false);

		// ũ�� //super.setSize(800, 700);
		pack(); // ��Ű¡ �ض�

		// �������
		super.setVisible(true);
		// ����
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		new MyMain_������();

	}

}