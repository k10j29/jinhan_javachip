package vo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable; //�������̽� (��ü ����ȭ)

// 1 )implements Externalizable 
// 2 )getter/setter ����
// 3 )�ߺ������ڰ� �����ϸ� �⺻�����ڴ� �ʼ� �Ǵ� �����ڸ� ��λ���

public class PersonVo3 implements Externalizable {

	// ���� Vo�� ����ȭ ���� ��ϼ��� �Ϸ���

	String name;
	int age; // ����ȭ���� ���ܰ��� (����ȵ�)
	String addr;

	public PersonVo3() { // �⺻ ������

	}

	public PersonVo3(String name, int age, String addr) { // �����ε�� ������
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

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {

		out.writeObject(name);
		out.writeInt(age);

	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

		name = (String) in.readObject();
		age = in.readInt();

	}

}
