package vo;
//VO (Value Object) � ������ ���� �����ϴ� ��ü 

// = DTO (Data Transfer Object) �����͸� �����ϴ� ��ü�� 
//   = TO

public class PersonVo { // �����ڸ� �ƿ� ������ ���ų� �⺻�����ڸ� ��� ����ų�

	private String name;
	private int age;
	private String addr;

	public PersonVo() {

	}

	public PersonVo(String name, int age, String addr) { // ������ ���� ( ������ ���� ) Alt + Shift + S �Ʒ����� ����°
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	public String getName() { // �ʿ信���� ����, �Ҽ��ִ� getters ,setters �����
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
	public String toString() { // Override �Ͽ� ������ �Ͽ� ���������� private ������ ������
		return String.format("[%s]-[%d]-[%s]", name, age, addr);
	}

}
