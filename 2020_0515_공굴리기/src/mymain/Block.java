package mymain;

import java.awt.Graphics;

public class Block extends item {

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
