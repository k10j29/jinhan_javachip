package myutil; // �ι�°�� �ۼ�

public class Child extends Parent {
	// Parent ��� ����

	// 1. ������ Parent�� sub
	// 2. ���� ���̵� ���� �θ�� �ڽ�
	public void sub() {
		System.out.println("--Child.sub()--");
	}

	// ���Ƽ��? JVM �� ���α׷��� ������ Ȯ�� �ϴ°� (14���� @����ǥ)
		@Override // �θ� ���� �޼ҵ带 �������̵�
		public void sub(int n) {
			// TODO Auto-generated method stub
			super.sub(n);
		}

}
