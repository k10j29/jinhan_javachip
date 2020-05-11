package mymain;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Mycard3 extends JPanel {

	public Mycard3() {

		JLabel jib_title = new JLabel("세번째카드");

		Font font = new Font("굴림체", Font.BOLD, 20);

		jib_title.setFont(font);
		jib_title.setForeground(Color.BLUE);

		this.add(jib_title);

	}

}