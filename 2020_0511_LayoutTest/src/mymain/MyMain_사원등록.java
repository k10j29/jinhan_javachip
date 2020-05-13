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

public class MyMain_사원등록 extends JFrame {

	public MyMain_사원등록() {

		// 윈도우 타이틀
		super("사원등록");

//상단

		JPanel upPanel = new JPanel(new GridLayout(6, 1)); // 프레임의 상단 센터 부분에 들어감
		this.add(upPanel, "Center");

//크기지정 (예약)

		upPanel.setPreferredSize(new Dimension(400, 300));
		upPanel.setBackground(Color.red);

		FlowLayout fl = new FlowLayout(FlowLayout.LEFT);
//1

		JPanel p1 = new JPanel(fl);
		JLabel jck_name = new JLabel("성         명",JLabel.RIGHT);
		p1.add(jck_name);
		JTextField jck_namef = new JTextField(10);
		p1.add(jck_namef);

		JLabel jlb_gender = new JLabel("성         별",JLabel.CENTER);

		JRadioButton jrd_male = new JRadioButton("남자");
		JRadioButton jrd_female = new JRadioButton("여자");

		p1.add(jlb_gender);
		p1.add(jrd_male);
		p1.add(jrd_female);

		ButtonGroup bg = new ButtonGroup();
		bg.add(jrd_male);
		bg.add(jrd_female);

//2

		JPanel p2 = new JPanel(fl);
		JLabel jck_num = new JLabel("주민등록번호", JLabel.RIGHT);
		p2.add(jck_num);
		JTextField jck_num1 = new JTextField(8);
		p2.add(jck_num1);
		JLabel jlb_num2 = new JLabel("-");
		p2.add(jlb_num2);
		JTextField jck_num3 = new JTextField(8);
		p2.add(jck_num3);

//3

		JPanel p3 = new JPanel(fl);
		JLabel jck_addr = new JLabel("주         소",JLabel.RIGHT);

		p3.add(jck_addr);
		JTextField jck_addr2 = new JTextField(20);
		p3.add(jck_addr2);

//4

		JPanel p4 = new JPanel(fl);
		JLabel jlb_dept = new JLabel("부   서   명",JLabel.RIGHT);
		p4.add(jlb_dept);

		String[] dept_array = { "기획부", "예능부", "총무부", "인사부" };
		JComboBox<String> jcb_dept = new JComboBox<String>(dept_array);
		p4.add(jcb_dept);
//5

		JPanel p5 = new JPanel(fl);

		JLabel jck_hob = new JLabel("취         미",JLabel.RIGHT);
		JCheckBox jck_hob1 = new JCheckBox("운동");
		JCheckBox jck_hob2 = new JCheckBox("음악감사");
		JCheckBox jck_hob3 = new JCheckBox("영화");
		JCheckBox jck_hob4 = new JCheckBox("컴퓨터");
		p5.add(jck_hob);
		p5.add(jck_hob1);
		p5.add(jck_hob2);
		p5.add(jck_hob3);
		p5.add(jck_hob4);

//6

		JPanel p6 = new JPanel(fl);
		JLabel jlb_profile = new JLabel("자  기  소  개",JLabel.RIGHT);
		p6.add(jlb_profile);

//상단 패널넣기		
		upPanel.add(p1);
		upPanel.add(p2);
		upPanel.add(p3);
		upPanel.add(p4);
		upPanel.add(p5);
		upPanel.add(p6);

//하단

		JPanel downPanel = new JPanel(new BorderLayout());
		this.add(downPanel, "South");

//크기지정 (예약)

		downPanel.setPreferredSize(new Dimension(400, 200));
		downPanel.setBackground(Color.green);

//자기소개 입력창 (JTextArea) 여러줄 입력

		JTextArea jta_profile = new JTextArea();
		// 스크롤
		JScrollPane jsp = new JScrollPane(jta_profile);
		downPanel.add(jsp, "Center");

//저장 종료 버튼

		JPanel southPanel = new JPanel();
		downPanel.add(southPanel, "South");

		southPanel.setPreferredSize(new Dimension(40, 40));
		southPanel.setBackground(Color.blue);

		JButton jbt_save = new JButton("저장");
		southPanel.add(jbt_save);
		JButton jbt_finish = new JButton("종료");
		southPanel.add(jbt_finish);
		
		jbt_finish.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent jbt_finish) {
				
				System.exit(0);
			}
		});
		
		
		
		
		
		
		
		
		
		
		

		// 위치
		super.setLocation(800, 200);

		// 자식 윈도우 고정
		super.setResizable(false);

		// 크기 //super.setSize(800, 700);
		pack(); // 패키징 해라

		// 보여줘라
		super.setVisible(true);
		// 종료
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		new MyMain_사원등록();

	}

}