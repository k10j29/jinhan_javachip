package vo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable; //인터페이스 (객체 직렬화)

// 1 )implements Externalizable 
// 2 )getter/setter 생성
// 3 )중복생성자가 존재하면 기본생성자는 필수 또는 생성자를 모두생략

public class PersonVo3 implements Externalizable {

	// 현재 Vo를 직렬화 가능 토록설정 하려면

	String name;
	int age; // 직렬화에서 제외가됨 (저장안됨)
	String addr;

	public PersonVo3() { // 기본 생성자

	}

	public PersonVo3(String name, int age, String addr) { // 오버로드된 생성자
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	@Override // toString (오버라이드)
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
