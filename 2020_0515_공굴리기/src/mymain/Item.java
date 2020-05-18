package mymain;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.io.Serializable;

public abstract class Item implements Serializable {

	// 위치/크기
	Rectangle pos = new Rectangle();

	// 색상
	Color color = Color.white;

	abstract public void draw(Graphics g);
}
