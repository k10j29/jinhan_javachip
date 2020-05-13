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

public class MyMain_사원등록2 extends JFrame {

	public MyMain_사원등록2() {
		// TODO Auto-generated constructor stub
		//타이틀
		super("사원등록");
		
//상단
		JPanel upPanel = new JPanel(new GridLayout(6, 1));
		this.add(upPanel,"Center");
		//크기지정(예약)
		upPanel.setPreferredSize(new Dimension(400, 200));
		upPanel.setBackground(Color.RED);
		
		
		FlowLayout fl = new FlowLayout(FlowLayout.LEFT);
		Dimension lable_size = new Dimension(80, 30);
		
		//1번째줄
		JPanel p1 = new JPanel(fl);
		JLabel jlb_name = new  JLabel("성                 명",JLabel.RIGHT);
		jlb_name.setPreferredSize(lable_size);
		
		JTextField jtf_name = new JTextField(10);
		
		JLabel jlb_gender = new JLabel("성 별",JLabel.CENTER);
		jlb_gender.setPreferredSize(lable_size);
		
		ButtonGroup bg = new ButtonGroup();
		JRadioButton jrb_male   = new JRadioButton("남",true);
		JRadioButton jrb_female = new JRadioButton("여");
		//기능 묶는다
		bg.add(jrb_male);
		bg.add(jrb_female);
		
		p1.add(jlb_name);
		p1.add(jtf_name);
		p1.add(jlb_gender);
		p1.add(jrb_male);
		p1.add(jrb_female);

		
		//2번째줄
		JPanel p2 = new JPanel(fl);
		JLabel jlb_jumin = new JLabel("주민등록번호",JLabel.RIGHT);
		jlb_jumin.setPreferredSize(lable_size);
		
		JTextField jtf_jumin1 = new JTextField(7);
		JLabel jlb_hypon = new JLabel("-");
		JTextField jtf_jumin2 = new JTextField(7);
		
		p2.add(jlb_jumin);
		p2.add(jtf_jumin1);
		p2.add(jlb_hypon);
		p2.add(jtf_jumin2);
		
		
		//3번째줄
		JPanel p3 = new JPanel(fl);
		JLabel jlb_addr = new JLabel("주                 소",JLabel.RIGHT);
		jlb_addr.setPreferredSize(lable_size);
		JTextField jtf_addr = new JTextField(20);
		
		p3.add(jlb_addr);
		p3.add(jtf_addr);
		
		
		
		//4번째줄
		JPanel p4 = new JPanel(fl);
		JLabel jlb_dept = new JLabel("부       서      명");
		jlb_dept.setPreferredSize(lable_size);
		
		String []  dept_array = { "기획부","총무부","인사부","영업부" };
		JComboBox<String> jcb_dept = new JComboBox<String>(dept_array);
		
		p4.add(jlb_dept);
		p4.add(jcb_dept);
		
		
		
		//5번째줄
		JPanel p5 = new JPanel(fl);
		//제목넣기
		JLabel jlb_hobby = new JLabel("취                 미",JLabel.RIGHT);
		jlb_hobby.setPreferredSize(lable_size);
		
		
		JCheckBox jck_hobby1 = new JCheckBox("운동");
		JCheckBox jck_hobby2 = new JCheckBox("음악감상");
		JCheckBox jck_hobby3 = new JCheckBox("영화");
		JCheckBox jck_hobby4 = new JCheckBox("컴퓨터");
		
		p5.add(jlb_hobby);
		p5.add(jck_hobby1);
		p5.add(jck_hobby2);
		p5.add(jck_hobby3);
		p5.add(jck_hobby4);
				
		
		//6번째줄
		JPanel p6 = new JPanel(fl);
		JLabel jlb_profile = new JLabel("자   기   소   개");
		jlb_profile.setPreferredSize(lable_size);
		
		
		p6.add(jlb_profile);
		
		//상단패널에 넣기
		upPanel.add(p1);
		upPanel.add(p2);
		upPanel.add(p3);
		upPanel.add(p4);
		upPanel.add(p5);
		upPanel.add(p6);
			
		
		
//하단
		JPanel downPanel = new JPanel(new BorderLayout());
		this.add(downPanel,"South");
		//크기지정(예약)
		downPanel.setPreferredSize(new Dimension(400, 200));
		downPanel.setBackground(Color.GREEN);
		
		
		//자기소개 입력창(JTextArea)
		JTextArea jta_profile = new JTextArea();
		JScrollPane jsp = new JScrollPane(jta_profile);
		downPanel.add(jsp,"Center");
		
		//저장/종료버튼
		JPanel southPanel = new JPanel();
		downPanel.add(southPanel,"South");
		//여기서 버튼 2개생성해서 넣어야..
		JButton jbt_save = new JButton("저장");
		JButton jbt_exit = new JButton("종료");
		
		southPanel.add(jbt_save);
		southPanel.add(jbt_exit);
		
		
		//종료처리                      처리객체 
		// 이벤트소스.addXXXListener(new XXXListener(){});
		jbt_exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		
		
		

		//위치
		super.setLocation(100, 100);

		//크기조정 못하도록..
		super.setResizable(false);
		
		//크기
		//super.setSize(300, 300);
		//자식윈도우 주변을 Frame이 감싸라...
		pack();
		
		

		//보여줘라
		super.setVisible(true);

		//종료
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyMain_사원등록2();
	}
}