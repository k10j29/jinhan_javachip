package myutil;

//클라스 안에 하나이상의 추상 메소드가 존재하면 (14라인) 
// 클라스도 추상 클라스가 되어야한다.

// 객체생성을 못함 (new 를 못함)

public abstract class 학생 {

	int 학년;
	int 학번;

	// 추상화 전에는 불가능 public void 공부한다();

	abstract public void 공부한다();
}
