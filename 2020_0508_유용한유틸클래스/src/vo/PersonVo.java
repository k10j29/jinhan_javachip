package vo;

// main 배열이랑 어드레스 만들기
//Value Object

public class PersonVo {

	String name;
	int age;
	String addr;
	String tell;

	public PersonVo() {

	}

	public PersonVo(String name, int age, String addr, String tell) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.tell = tell;

	}

	public String getTell() {
		return tell;

	}

	public void setTell(String tell) {
		this.tell = tell;
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
	public String toString() {

		return String.format("[%s-%d-%s-(%s)] : ", name, age, addr, tell);
	}

}
