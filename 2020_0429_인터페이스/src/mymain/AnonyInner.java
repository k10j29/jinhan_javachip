//2

package mymain;

import myutil.interTest;

public class AnonyInner {

	public void test() {

		// 내부클래스 만들기
		/*
		 * class interTestlmpl implements InterTest {
		 * 
		 * @Override public void printData() {
		 * 
		 * System.out.println("data : " + data);
		 * 
		 * }
		 * 
		 * }
		 * 
		 * new interTestlmpl().printData();
		 */

		new interTest() {

			@Override
			public void printData() {
				System.out.println("data : " + data);

			}

		}.printData();

		// -------------------------------------------------------------------------------------

		new interTest() {

			@Override
			public void printData() {
				System.out.println("data : " + data);

			}
		};

	}

}
