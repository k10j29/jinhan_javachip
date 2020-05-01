package myutil;

// 22222222222222222222222222222222222222222222222222222222222222222 //

public class AdvanceCalc extends BaseCalc {

	public int hap(int n) {

		int sum = 0;
		for (int i = 0; i < n; i++) {
			// 자식입장에서 부모(Basecalc) 의 기능 plus를 가져다가 사용함
		
			sum = super.plus(sum, i);//정확한표현
			
			// sum =this.plus(sum, i);
			// sum = plus(sum, i); 사용가능

		}

		return 0;
	}

	// n's m승
	public double pow(int n, int m) {
		double res = 1.0;
		for (int i = 0; i < m; i++) {
			res = super.multiply(res, n); // res * n;
			
			//오류 안나도록 하고싶으면 (int) 추가 but 불안정
			res = super.multiply((int)res, n); // res * n;

		}
		return res;
	}

}
