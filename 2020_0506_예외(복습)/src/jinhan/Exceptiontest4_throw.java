package jinhan;

public class Exceptiontest4_throw {

	public void PrintString(String[] value) throws Exception {

		if (value.length > 0) {
			for (String str : value) {
				System.out.println(str);

			}

		} else {
			throw new Exception("�迭�� ��Ұ� �����ϴ�.");

		}

	}

	public static void main(String[] args) {
		Exceptiontest4_throw exceptiontest4_throw = new Exceptiontest4_throw();

		String[] arg1 = { "1,2,3", "������" };
		String[] arg2 = {};
		
		try { 
			exceptiontest4_throw.PrintString(arg2);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
