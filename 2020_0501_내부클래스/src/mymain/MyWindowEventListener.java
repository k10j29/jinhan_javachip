package mymain;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyWindowEventListener implements WindowListener {

	@Override
	public void windowActivated(WindowEvent e) {

		System.out.println("windowActivated");
	}

	@Override
	public void windowClosed(WindowEvent e) {

		System.out.println("windowClosed");
	}

	@Override
	public void windowClosing(WindowEvent e) {

		System.out.println("windowClosing");
		
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent e) {

		System.out.println("windowDeactivated");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {

		System.out.println("windowDeiconified");
	}

	@Override
	public void windowIconified(WindowEvent e) {

		System.out.println("windowIconified");
	}

	@Override
	public void windowOpened(WindowEvent e) {

		System.out.println("windowOpened");
	}

}
