package mymain;


//여러개 문자 객체 합치기는 formmater 가 제일 편한듯

public class MyMain_String불변 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
///////////해결법 1 그냥찍기
		
		//1. 카운트해보기
		int count = 0;
		String msg = ++count + "little. " + 
						++count + "little. " + 
							++count + "little indian";
		
		
		//2. 문자 길이 찍어보기
		System.out.println(msg);
		System.out.println(msg.length());
		
		//3. 위의 방법으로 계산기 메모리 낭비 발생
		
		//4. 해결방법 
		
		
		
		///////////해결법 2 StinrBuffer
		
		//1) Stiring Buffer 사용
			//1. 미리저장공간 확보후 > 2. 채워나가라
		
		//기본 생성자는 기본적으로 생성할수있는 
		// StringBuffer ch 수가 super 16개

		//지정할 글자수 입력가능
		
		//4. 32글자를 넣을수있는 StringBuffer 생성됨
		StringBuffer sb = new StringBuffer(32);
		count =0;
		sb.append(++count);
		sb.append("little. ");
		
		sb.append(++count);
		sb.append("little. ");
		
		sb.append(++count);
		sb.append("little indian");
		
		
		//5. 최종적으로 String Buffer 값을 가져온다
		msg = sb.toString();
		
		System.out.println(msg);
		System.out.println(msg.length());
		
	
		
///////////해결법 3 String formmater
		count =0;
		
		msg = String.format("%dlittle, %dlittle, %dlittel indian",++count, ++count, ++count);
		System.out.println(msg);
		System.out.println(msg.length());
		
		
	}

}
