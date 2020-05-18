package mymain;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.io.Serializable;

public abstract class Item implements Serializable {

	// ��ġ/ũ��
	Rectangle pos = new Rectangle();

	// ����
	Color color = Color.white;

	abstract public void draw(Graphics g);
}
