package mymain;

import java.awt.Graphics;

public class Bar extends item {

	@Override
	public void draw(Graphics g) {

		g.setColor(super.color);
		g.fillRect(pos.x, pos.y, pos.width, pos.height);
	}

}
