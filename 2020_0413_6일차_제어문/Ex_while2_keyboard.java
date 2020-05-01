class Ex_while2_keyboard 
{
	public static void main(String[] args) throws Exception
	{
		int ch;//입력받을 변수

        int count=0;//반복횟수 누적

        System.out.println("종료하려면 Ctrl + Z"); 

		while(true){ //무한 loop(반복)

           ch = System.in.read();//의미?

           if(ch==-1) break;//탈출문
           
		   count++;//증가

		   System.out.printf("%c",ch);

		}

		System.out.printf("while문 반복횟수:%d(회)\n", count);

		System.out.println("--End--");
	}
}
