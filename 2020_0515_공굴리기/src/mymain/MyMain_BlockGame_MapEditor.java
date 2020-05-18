package mymain;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class MyMain_BlockGame_MapEditor extends JFrame {

	JPanel grimPan;
	Block[][] block_array = null;// new Block[10][10];

	// 선택아이템
	Color select_color = Color.white;

	public MyMain_BlockGame_MapEditor() {
		// TODO Auto-generated constructor stub
		// 타이틀
		super("맵에디터");

		// 메뉴 초기화
		init_menu();

		// block초기화
		init_block();

		// 그리기판
		init_grimpan();

		// 블럭목록...
		init_block_pan();

		// 마우스 이벤트
		init_mouse_event();

		// 위치
		super.setLocation(100, 100);

		setResizable(false);
		// 크기
		pack();
		// super.setSize(300, 300);

		// 보여줘라
		super.setVisible(true);

		// 종료
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private void init_menu() {
		// TODO Auto-generated method stub
		JMenuBar menubar = new JMenuBar();
		this.setJMenuBar(menubar);

		JMenu menu = new JMenu("파일");
		menubar.add(menu);

		JMenuItem item_new = new JMenuItem("새파일");
		JMenuItem item_open = new JMenuItem("열기");
		JMenuItem item_save = new JMenuItem("저장");

		menu.add(item_new);
		menu.add(item_open);
		menu.add(item_save);

		// 메뉴이벤트 처리할 객체
		ActionListener listener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Object evt_src = e.getSource();
				if (evt_src == item_new) {
					onNew();
				} else if (evt_src == item_open) {
					onOpen();
				} else if (evt_src == item_save) {
					onSave();
				}
			}
		};

		// 메뉴이벤트 등록
		item_new.addActionListener(listener);
		item_open.addActionListener(listener);
		item_save.addActionListener(listener);

	}

	protected void onSave() {
		// TODO Auto-generated method stub
		JFileChooser jfc = new JFileChooser("C:\\My_Study\\Java_Study\\2020_0515_공굴리기");

		int result = jfc.showSaveDialog(this);
		if (result == JFileChooser.APPROVE_OPTION) {// 저장선택시

			FileOutputStream fos = null;
			ObjectOutputStream oos = null;
			try {
				File f = jfc.getSelectedFile();
				// System.out.println(f);
				fos = new FileOutputStream(f);
				oos = new ObjectOutputStream(fos);

				// 저장 완료...
				oos.writeObject(block_array);

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {

				try {
					if (oos != null)
						oos.close();
					if (fos != null)
						fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}

	}

	protected void onOpen() {
		// TODO Auto-generated method stub
		JFileChooser jfc = new JFileChooser("C:\\My_Study\\Java_Study\\2020_0515_공굴리기");
		int result = jfc.showOpenDialog(this);
		if (result == JFileChooser.APPROVE_OPTION) {// 열기 선택
			File f = jfc.getSelectedFile();
			FileInputStream fis = null;
			ObjectInputStream ois = null;

			try {
				fis = new FileInputStream(f);
				ois = new ObjectInputStream(fis);

				block_array = (Block[][]) ois.readObject();

				repaint();

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			} finally {

				try {
					if (ois != null)
						ois.close();
					if (fis != null)
						fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}

	}

	protected void onNew() {
		// TODO Auto-generated method stub
		init_block();

		repaint();

	}

	private void init_mouse_event() {
		// TODO Auto-generated method stub
		MouseAdapter adapter = new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				// super.mousePressed(e);
				Point pt = e.getPoint();// 마우스 클릭좌표
				if (pt.y >= 300)
					return;
				Block block = block_array[0][0];

				int row = pt.y / block.pos.height;
				int col = pt.x / block.pos.width;

				Block select_block = block_array[row][col];

				if (select_block.color != Color.white) {
					// 이전에 선택된 블럭이면 지우기
					select_block.color = Color.white;
					select_block.bShow = false;
				} else {
					// 선택된 블럭이 아니면 선택해라
					select_block.color = select_color;
					if (select_color != Color.white)
						select_block.bShow = true;
				}
				repaint();

			}

			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				// super.mouseDragged(e);
				Point pt = e.getPoint();// 마우스 클릭좌표
				if (pt.y >= 300)
					return;
				Block block = block_array[0][0];

				int row = pt.y / block.pos.height;
				int col = pt.x / block.pos.width;
				// 범위을 벗어나면
				if (row < 0)
					return;
				if (col < 0 || col >= block_array[0].length)
					return;

				Block select_block = block_array[row][col];

				select_block.color = select_color;
				if (select_color == Color.white)
					select_block.bShow = false;
				else
					select_block.bShow = true;

				repaint();
			}

		};

		grimPan.addMouseListener(adapter); // pressed
		grimPan.addMouseMotionListener(adapter);// dragged

	}

	private void init_block() {
		// TODO Auto-generated method stub

		block_array = new Block[10][10];

		int block_w = 1000 / block_array[0].length;
		int block_h = 30;

		for (int i = 0; i < block_array.length; i++) {
			for (int k = 0; k < block_array[i].length; k++) {
				Block block = new Block();
				block.bShow = false;

				block.pos.width = block_w;
				block.pos.height = block_h;
				block.pos.x = k * block_w;
				block.pos.y = i * block_h;

				block_array[i][k] = block;
			}
		}

	}

	private void init_block_pan() {
		// TODO Auto-generated method stub
		JPanel p = new JPanel(new GridLayout(7, 1));
		p.setPreferredSize(new Dimension(80, 0));

		this.add(p, "East");

		JButton jbt_red = new JButton("Red");
		jbt_red.setBackground(Color.red);

		JButton jbt_green = new JButton("Green");
		jbt_green.setBackground(Color.green);

		JButton jbt_blue = new JButton("Blue");
		jbt_blue.setBackground(Color.blue);

		JButton jbt_magenta = new JButton("Magenta");
		jbt_magenta.setBackground(Color.magenta);

		JButton jbt_gray = new JButton("Gray");
		jbt_gray.setBackground(Color.gray);

		JButton jbt_orange = new JButton("Orange");
		jbt_orange.setBackground(Color.orange);

		JButton jbt_white = new JButton("지우기");
		jbt_white.setBackground(Color.white);

		p.add(jbt_red);
		p.add(jbt_green);
		p.add(jbt_blue);
		p.add(jbt_magenta);
		p.add(jbt_gray);
		p.add(jbt_orange);
		p.add(jbt_white);

		// 7개버튼의 이벤트 처리할 객체
		ActionListener listener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Object evt_src = e.getSource();
				if (evt_src == jbt_red) {

					select_color = Color.red;

				} else if (evt_src == jbt_green) {

					select_color = Color.green;

				} else if (evt_src == jbt_blue) {

					select_color = Color.blue;

				} else if (evt_src == jbt_magenta) {

					select_color = Color.magenta;

				} else if (evt_src == jbt_gray) {

					select_color = Color.gray;

				} else if (evt_src == jbt_orange) {

					select_color = Color.orange;

				} else if (evt_src == jbt_white) {

					select_color = Color.white;
				}

				grimPan.repaint();

				repaint();

			}
		};
		// 이벤트 등록
		jbt_red.addActionListener(listener);
		jbt_green.addActionListener(listener);
		jbt_blue.addActionListener(listener);
		jbt_magenta.addActionListener(listener);
		jbt_gray.addActionListener(listener);
		jbt_orange.addActionListener(listener);
		jbt_white.addActionListener(listener);

	}

	private void init_grimpan() {
		// TODO Auto-generated method stub
		grimPan = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				// TODO Auto-generated method stub
				// 이전화면 지우기
				g.clearRect(0, 0, 1000, 600);

				for (int i = 0; i < block_array.length; i++) {
					for (int k = 0; k < block_array[i].length; k++) {
						Block block = block_array[i][k];
						block.draw(g);

						g.setColor(Color.green);
						g.drawRect(block.pos.x, block.pos.y, block.pos.width, block.pos.height);
					}
				}

				// 선택된 아이템(칼라)
				g.setColor(select_color);
				g.fillRect(400, 400, 100, 100);
			}
		};

		grimPan.setPreferredSize(new Dimension(1000, 600));
		this.add(grimPan, "Center");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyMain_BlockGame_MapEditor();
	}
}