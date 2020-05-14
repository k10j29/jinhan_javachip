package vo;

import java.io.Serializable; //�������̽� (��ü ����ȭ)

// 1 )implements Serializable 
// 2 )getter/setter ����
// 3 )�ߺ������ڰ� �����ϸ� �⺻�����ڴ� �ʼ� �Ǵ� �����ڸ� ��λ���

public class PersonVo implements Serializable {

	// ���� Vo�� ����ȭ ���� ��ϼ��� �Ϸ���

	String name;
	int age;
	String addr;

	public PersonVo() { // �⺻ ������

	}

	public PersonVo(String name, int age, String addr) { // �����ε�� ������
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	@Override // toString (�������̵�)
	public String toString() {

		return String.format("[%s-%d-%s]", name, age, addr);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

}
