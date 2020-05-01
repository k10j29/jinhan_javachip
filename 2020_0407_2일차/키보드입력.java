//Java Home\jre\lib\.... rt.jar

//위치정보 알려줘야 된다
import java.util.Scanner;

class 키보드입력 
{
	public static void main(String[] args) 
	{
		//키보드로부터 입력받는 객체 생성
		Scanner scan = new Scanner(System.in);

		String name;//이름
		int    age; //나이
		String addr;//주소
		double ki;  //키
		String tel; //전화

		//이름 입력받기
		System.out.print("이름:");
		//     키보드 버퍼에서 값을 가져오기
		//name = scan.next();  //입력구분자 : 공백 or 엔터
		//                       입력구분자 전까지 가져옴 
		name = scan.nextLine();//입력구분자: 엔터
		                       //            엔터까지 가져와서

        System.out.print("나이:");
		age = scan.nextInt();

        scan.nextLine();//이전 엔터값 가져온다(버린다)

        System.out.print("주소:");
		addr = scan.nextLine();

		System.out.print("키:");
		ki = scan.nextDouble();

		scan.nextLine();//이전 엔터값 가져온다(버린다)

        System.out.print("전화:");
		tel = scan.nextLine();

        System.out.println("---[출력내용]---");
		System.out.printf("이름: %s\n",name);
		System.out.printf("나이: %d(살)\n",age);
		System.out.printf("주소: %s\n",addr);
		System.out.printf("키: %.1f(cm)\n",ki);
		System.out.printf("전화: %s\n",tel);


	}
}
