class Ex_if4 
{
	public static void main(String[] args) 
	{
		int su = 12;

        //3 과 4의 배수냐?
		if( su%3==0 && su%4==0 ){
			//2가지 이상일 경우에는 {  } 묶어라...
			System.out.printf("[%d]는 3의 배수\n",su); //1
			System.out.printf("[%d]는 4의 배수\n",su); //2
		}
        else
			System.out.println("--조건이 만족하지 않습니다");//3

        

	}
}
