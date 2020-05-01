package mymain;

//method ���� ���� �Ǵ°� = ����
public class MyMain_�迭4_�������� {

	// elipsis : ... ���� ��ȣ variable argument
	static void int_arg(int... data) {
		// int [] data = {10};
		// int [] data = {10,20};
		// int [] data = {10,20,30};

		System.out.print("[");
		for (int n : data)
			System.out.printf("%3d", n);
		System.out.println(" ]");
	}

	// n ���� ���߿� ����ū��
	static int max(int... data) {
		// int [] data = {12,94,867,92,15,80,730}; �迭�� ��������
	
		int max_val = Integer.MIN_VALUE; //���� ������
		for (int n : data) {
			max_val =  (n> max_val) ? n : max_val;
			
		}
		return max_val;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int_arg(10);
		int_arg(10, 20);
		int_arg(10, 20, 30);

		int res = max(12, 94, 867, 92, 15, 80, 730);
		System.out.println(res);
	}

}
