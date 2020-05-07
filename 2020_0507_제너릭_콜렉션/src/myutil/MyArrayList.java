package myutil;

public class MyArrayList<T> {

	//Generic Type 저장
	T [] data = null;
	
	//데이터 갯수 
	public int size() {
		return (data==null) ? 0 : data.length;
	}
	
	//데이터 추가
	public void add(T newVal) {
        //1번째 데이터가 들어오면
		/*
		 * if(data==null) { data = new Object[1]; data[0] = newVal; return; }
		 */
		//기존데이터 + 1 개의 배열 생성
		T [] imsi = (T[])new Object[this.size()+1];
		//기존데이터를->새로만든 배열로 복사해온다
		for(int i=0;i< this.size();i++) {
			imsi[i] = data[i];
		}
		
		//새로만든 배열 맨 마지막에 newVal넣기
		imsi[size()] = newVal;
		
		//imsi ->data : 기존 data가 갖고있던 배열은 제거
		data = imsi;
	
	}
	
	//값 얻어오기
	//                         throws : 예외처리의 양도(위임) 
	public T get(int index) throws Exception{
		//안되는 경우
		if(index < 0 || index >= size()) {
			String message = 
					String.format("첨자범위:0~%d  input:%d", size()-1,index);
			//예외 던진다
			throw new Exception(message);
		}
		
		return data[index];
	}
	
	//삭제
	public void remove(int index) throws Exception{
		//안되는 경우
		if(index < 0 || index >= size()) {
			String message = 
					String.format("첨자범위:0~%d  input:%d", size()-1,index);
			//예외 던진다
			throw new Exception(message);
		}
		
		//삭제처리
		
		//1개만 남았을경우
		if(size()==1) {
			data = null;
			return;
		}
		
		//2개이상...
		//1.
		T [] imsi = (T[])new Object[size()-1];
		
		//2
		for(int i=0;i<imsi.length;i++) {
			if(i<index)
				imsi[i] = data[i];
			else
				imsi[i] = data[i+1];
		}
		//3
		data = imsi;
		
	}
	
	//모두삭제
	public void clear() {
		data = null;
	}
	
	
	
	
	
	
}
