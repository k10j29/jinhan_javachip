package mymain;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Button 이벤트는 ActionListener (interface)
public class MyButtonEvent implements ActionListener {

	버튼이벤트 frame;

	public MyButtonEvent(버튼이벤트 frame) {
		this.frame = frame;

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		frame.setTitle("안녕하세요");
	}

}
