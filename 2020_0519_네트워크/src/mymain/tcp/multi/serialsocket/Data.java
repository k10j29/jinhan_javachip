package mymain.tcp.multi.serialsocket;

import java.io.Serializable;
import java.util.List;

//네트워크 상에서 해당 객체를 전송하려면
public class Data implements Serializable { // 직렬화를 위해 implements Serializable

	// 데이터 종류를 구분할 상수

	public static final int IN = 1;
	public static final int OUT = 2;
	public static final int MSG = 3;
	public static final int LIST = 4;
	public static final int DRAW = 5;

	int data_kind; // 넘어온 데이터 종류가 무엇이냐

	// 채팅 입/퇴장시 필요한 정보

	String user_name; // 대화명
	String message; // 내용

	// 접속자 목록 전송할때 필요한 정보

	List<String> userList;

	// 그리기 정보

	int x, y; // 좌표
	int thick; // 선굵기
	int color; // 색상

	// 직렬화를 위하여 getter, setter 만들어 줘야함 !

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
