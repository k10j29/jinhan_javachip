package mymain;

//method 에서 전달 되는값 = 인자
public class MyMain_배열4_가변인자 {

	// elipsis : ... 생략 부호 variable argument
	static void int_arg(int... data) {
		// int [] data = {10};
		// int [] data = {10,20};
		// int [] data = {10,20,30};

		System.out.print("[");
		for (int n : data)
			System.out.printf("%3d", n);
		System.out.println(" ]");
	}

	// n 개의 수중에 가장큰수
	static int max(int... data) {
		// int [] data = {12,94,867,92,15,80,730}; 배열로 들어왔을때
	
		int max_val = Integer.MIN_VALUE; //가장 작은값
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
