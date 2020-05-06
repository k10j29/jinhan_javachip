package jinhan;

public class Exceptiontest {

	public static void main(String[] args) {

		int[] var = { 10, 200, 30 };
		for (int i = 0; i <= 3; i++)
			
		try {

			System.out.println("var[" + i + "] : " + var[i]);
		}catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("배열을 넘었습니다.");
			
		} 

	}

}
