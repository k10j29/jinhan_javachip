package myutil;

// 22222222222222222222222222222222222222222222222222222222222222222 //

public class AdvanceCalc extends BaseCalc {

	public int hap(int n) {

		int sum = 0;
		for (int i = 0; i < n; i++) {
			// �ڽ����忡�� �θ�(Basecalc) �� ��� plus�� �����ٰ� �����
		
			sum = super.plus(sum, i);//��Ȯ��ǥ��
			
			// sum =this.plus(sum, i);
			// sum = plus(sum, i); ��밡��

		}

		return 0;
	}

	// n's m��
	public double pow(int n, int m) {
		double res = 1.0;
		for (int i = 0; i < m; i++) {
			res = super.multiply(res, n); // res * n;
			
			//���� �ȳ����� �ϰ������ (int) �߰� but �Ҿ���
			res = super.multiply((int)res, n); // res * n;

		}
		return res;
	}

}
