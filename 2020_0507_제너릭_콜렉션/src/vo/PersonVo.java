package vo;
//VO (Value Object) 어떤 정보를 저장 관리하는 객체 

// = DTO (Data Transfer Object) 데이터를 전달하는 객체ㄴ 
//   = TO

public class PersonVo { // 생성자를 아예 만들지 말거나 기본생성자를 계속 만들거나

	private String name;
	private int age;
	private String addr;

	public PersonVo() {

	}

	public PersonVo(String name, int age, String addr) { // 생성자 생성 ( 데이터 저장 ) Alt + Shift + S 아래에서 세번째
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	public String getName() { // 필요에따라 수정, 할수있는 getters ,setters 만들기
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
	public String toString() { // Override 하여 재정의 하여 내가지정한 private 정보들 띄울거임
		return String.format("[%s]-[%d]-[%s]", name, age, addr);
	}

}
