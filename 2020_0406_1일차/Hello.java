//1.���� :  Hello.java(<=Ŭ������� ������ �̸����� ����)

class  Hello
{
   public static void main(String [] args) throws Exception
   {
       // Console->��,�����ġ
	   //          �Է�->Ű����
	   //          ���->�����(��������ϴ� cmdâ)

	   //Ŭ������.��ü��.�޼ҵ��()
       System.out.println("�ȳ� �ڹ�~~");// print -> line next
       System.out.print("�ȳ� �ڹ�~~\n");// print:   \n-> line feed (�ٹٲٱ�)
	                                     //               new line   
       //         print format(����)���� ����ض�...   
	   System.out.printf("%s\n","�ȳ� �ڹ�~~");
       System.out.write("�ȳ� �ڹ�~~\n".getBytes());



       System.out.println("���: ���� ��ȭ����"); 
   } 
   
}