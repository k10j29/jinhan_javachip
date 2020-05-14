package vo;

import java.io.Serializable; //인터페이스 (객체 직렬화)

// 1 )implements Serializable 
// 2 )getter/setter 생성
// 3 )중복생성자가 존재하면 기본생성자는 필수 또는 생성자를 모두생략

public class PersonVo implements Serializable {

	// 현재 Vo를 직렬화 가능 토록설정 하려면

	String name;
	int age;
	String addr;

	public PersonVo() { // 기본 생성자

	}

	public PersonVo(String name, int age, String addr) { // 오버로드된 생성자
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

}
