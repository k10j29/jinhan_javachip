package mymain;


//������ ���� ��ü ��ġ��� formmater �� ���� ���ѵ�

public class MyMain_String�Һ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
///////////�ذ�� 1 �׳����
		
		//1. ī��Ʈ�غ���
		int count = 0;
		String msg = ++count + "little. " + 
						++count + "little. " + 
							++count + "little indian";
		
		
		//2. ���� ���� ����
		System.out.println(msg);
		System.out.println(msg.length());
		
		//3. ���� ������� ���� �޸� ���� �߻�
		
		//4. �ذ��� 
		
		
		
		///////////�ذ�� 2 StinrBuffer
		
		//1) Stiring Buffer ���
			//1. �̸�������� Ȯ���� > 2. ä��������
		
		//�⺻ �����ڴ� �⺻������ �����Ҽ��ִ� 
		// StringBuffer ch ���� super 16��

		//������ ���ڼ� �Է°���
		
		//4. 32���ڸ� �������ִ� StringBuffer ������
		StringBuffer sb = new StringBuffer(32);
		count =0;
		sb.append(++count);
		sb.append("little. ");
		
		sb.append(++count);
		sb.append("little. ");
		
		sb.append(++count);
		sb.append("little indian");
		
		
		//5. ���������� String Buffer ���� �����´�
		msg = sb.toString();
		
		System.out.println(msg);
		System.out.println(msg.length());
		
	
		
///////////�ذ�� 3 String formmater
		count =0;
		
		msg = String.format("%dlittle, %dlittle, %dlittel indian",++count, ++count, ++count);
		System.out.println(msg);
		System.out.println(msg.length());
		
		
	}

}
