package mymain.tcp.multi.serialsocket;

import java.io.Serializable;
import java.util.List;

//��Ʈ��ũ �󿡼� �ش� ��ü�� �����Ϸ���
public class Data implements Serializable { // ����ȭ�� ���� implements Serializable

	// ������ ������ ������ ���

	public static final int IN = 1;
	public static final int OUT = 2;
	public static final int MSG = 3;
	public static final int LIST = 4;
	public static final int DRAW = 5;

	int data_kind; // �Ѿ�� ������ ������ �����̳�

	// ä�� ��/����� �ʿ��� ����

	String user_name; // ��ȭ��
	String message; // ����

	// ������ ��� �����Ҷ� �ʿ��� ����

	List<String> userList;

	// �׸��� ����

	int x, y; // ��ǥ
	int thick; // ������
	int color; // ����

	// ����ȭ�� ���Ͽ� getter, setter ����� ����� !

	public int getData_kind() {
		return data_kind;
	}

	public void setData_kind(int data_kind) {
		this.data_kind = data_kind;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<String> getUserList() {
		return userList;
	}

	public void setUserList(List<String> userList) {
		this.userList = userList;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getThick() {
		return thick;
	}

	public void setThick(int thick) {
		this.thick = thick;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

}
