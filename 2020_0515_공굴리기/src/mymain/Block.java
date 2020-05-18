package mymain;

import java.awt.Graphics;
import java.io.Serializable;

public class Block extends Item implements Serializable {

	boolean bShow = true; // 보여달라 깨지지않은 블럭

	@Override
	public void draw(Graphics g) {

		// if (bShow) = 만약에 깨졌으면 안그리고
		if (bShow) {

			g.setColor(color);
			g.fillRect(pos.x + 1, pos.y + 1, pos.width - 2, pos.height - 2);
		}

	}

}
