package mymain;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Mycard2 extends JPanel {

	public Mycard2() {

		JLabel jib_title = new JLabel("�ι�°ī��");

		Font font = new Font("����ü", Font.BOLD, 20);

		jib_title.setFont(font);
		jib_title.setForeground(Color.GREEN);

		this.add(jib_title);

	}

}