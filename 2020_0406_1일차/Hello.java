//1.저장 :  Hello.java(<=클래스명과 동일한 이름으로 저장)

class  Hello
{
   public static void main(String [] args) throws Exception
   {
       // Console->입,출력장치
	   //          입력->키보드
	   //          출력->모니터(문자출력하는 cmd창)

	   //클래스명.객체명.메소드명()
       System.out.println("안녕 자바~~");// print -> line next
       System.out.print("안녕 자바~~\n");// print:   \n-> line feed (줄바꾸기)
	                                     //               new line   
       //         print format(형식)으로 출력해라...   
	   System.out.printf("%s\n","안녕 자바~~");
       System.out.write("안녕 자바~~\n".getBytes());



       System.out.println("취미: 독서 영화감상"); 
   } 
   
}