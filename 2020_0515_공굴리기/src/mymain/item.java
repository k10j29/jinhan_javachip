package mymain;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public abstract class item {

	// ��ġ , ũ��
	Rectangle pos = new Rectangle();

	// ����
	Color color = Color.GRAY;

	public abstract void draw(Graphics g); // �׸���

}
