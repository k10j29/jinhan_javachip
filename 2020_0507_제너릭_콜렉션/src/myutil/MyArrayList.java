package myutil;

public class MyArrayList<T> {

	//Generic Type ����
	T [] data = null;
	
	//������ ���� 
	public int size() {
		return (data==null) ? 0 : data.length;
	}
	
	//������ �߰�
	public void add(T newVal) {
        //1��° �����Ͱ� ������
		/*
		 * if(data==null) { data = new Object[1]; data[0] = newVal; return; }
		 */
		//���������� + 1 ���� �迭 ����
		T [] imsi = (T[])new Object[this.size()+1];
		//���������͸�->���θ��� �迭�� �����ؿ´�
		for(int i=0;i< this.size();i++) {
			imsi[i] = data[i];
		}
		
		//���θ��� �迭 �� �������� newVal�ֱ�
		imsi[size()] = newVal;
		
		//imsi ->data : ���� data�� �����ִ� �迭�� ����
		data = imsi;
	
	}
	
	//�� ������
	//                         throws : ����ó���� �絵(����) 
	public T get(int index) throws Exception{
		//�ȵǴ� ���
		if(index < 0 || index >= size()) {
			String message = 
					String.format("÷�ڹ���:0~%d  input:%d", size()-1,index);
			//���� ������
			throw new Exception(message);
		}
		
		return data[index];
	}
	
	//����
	public void remove(int index) throws Exception{
		//�ȵǴ� ���
		if(index < 0 || index >= size()) {
			String message = 
					String.format("÷�ڹ���:0~%d  input:%d", size()-1,index);
			//���� ������
			throw new Exception(message);
		}
		
		//����ó��
		
		//1���� ���������
		if(size()==1) {
			data = null;
			return;
		}
		
		//2���̻�...
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
	
	//��λ���
	public void clear() {
		data = null;
	}
	
	
	
	
	
	
}
