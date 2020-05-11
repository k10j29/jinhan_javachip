package mymain;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Mycard1 extends JPanel {

	public Mycard1() {

		JLabel jib_title = new JLabel("첫번째카드");

		Font font = new Font("굴림체", Font.BOLD, 20);

		jib_title.setFont(font);
		jib_title.setForeground(Color.red);

		this.add(jib_title);

	}

}