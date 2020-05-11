package mymain;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Mycard2 extends JPanel {

	public Mycard2() {

		JLabel jib_title = new JLabel("두번째카드");

		Font font = new Font("굴림체", Font.BOLD, 20);

		jib_title.setFont(font);
		jib_title.setForeground(Color.GREEN);

		this.add(jib_title);

	}

}