package mymain;

import java.awt.Graphics;
import java.io.Serializable;

public class Block extends Item implements Serializable {

	boolean bShow = true; // �����޶� ���������� ��

	@Override
	public void draw(Graphics g) {

		// if (bShow) = ���࿡ �������� �ȱ׸���
		if (bShow) {

			g.setColor(color);
			g.fillRect(pos.x + 1, pos.y + 1, pos.width - 2, pos.height - 2);
		}

	}

}
