package myutil;

import java.io.IOException;

public class MyArrayList2 {

	// 자바의 모든객체를 저장
	Object[] data = null;

	// 데이터 갯수
	public int size() {
		return (data == null) ? 0 : data.length;
	}

	// 데이터 추가
	public void add(Object newVal) {
		// 1번째 데이터가 들어오면
		/*
		 * if(data==null) { data = new Object[1]; data[0] = newVal; return; }
		 */

		// 기존데이터 + 1 개의 배열 생성
		Object[] imsi = new Object[this.size() + 1];
		// 기존데이터를->새로만든 배열로 복사해온다
		for (int i = 0; i < this.size(); i++) {
			imsi[i] = data[i];
		}

		// 새로만든 배열 맨 마지막에 newVal넣기
		imsi[size()] = newVal;

		// imsi ->data : 기존 data가 갖고있던 배열은 제거
		data = imsi;

	}

	// 값 얻어오기
	// throws : 예외처리의 양도(위임)
	public Object get(int index) throws Exception {
		// 안되는 경우
		if (index < 0 || index >= size()) {
			String message = String.format("첨자범위:0~%d  input:%d", size() - 1, index);
			// 예외 던진다
			throw new Exception(message);
		}

		return data[index];
	}

	// 삭제
	public void remove(int index) throws Exception {
		// 안되는 경우
		if (index < 0 || index >= size()) {
			String message = String.format("첨자범위:0~%d  input:%d", size() - 1, index);
			// 예외 던진다
			throw new Exception(message);
		}

		// 삭제처리

		// 1개만 남았을경우
		if (size() == 1) {
			data = null;
			return;
		}

		// 2개이상...
		// 1.
		Object[] imsi = new Object[size() - 1];

		// 2
		for (int i = 0; i < imsi.length; i++) {
			if (i < index)
				imsi[i] = data[i];
			else
				imsi[i] = data[i + 1];
		}
		// 3
		data = imsi;

	}
	
	public void clear() {
		data = null;
		
	}

}
