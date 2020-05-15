package mymain;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public abstract class item {

	// 위치 , 크기
	Rectangle pos = new Rectangle();

	// 색상
	Color color = Color.GRAY;

	public abstract void draw(Graphics g); // 그리기

}
