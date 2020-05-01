import java.util.Random;

class Ex_if1 
{
	public static void main(String[] args) 
	{
  
        //난수발생 객체
		// new생성된 객체는 heap에 생성된다
		Random rand = new Random();

		// int num = rand.nextInt(45) + 1;// 1~45

		int age = rand.nextInt( 101 );//0~100

		// 0~ 9 : 아동
		//10~19 : 청소년
		//20~49 : 성년
		//50~69 : 장년
		//70~   : 노년

		String res="";
        /*
		if(age>=0  && age  < 10)  
			res = "아동";
		else
		{
			if(age>=10 && age  < 20)
				res = "청소년";
			else
			{
				if(age>=20 && age  < 50)  
					res = "성년";
				else
				{
					if(age>=50 && age  < 70)  
						res = "장년";
					else
					{
					    if(age>=70)  res = "노년";
					}
				}
			}
		}*/

        if(age>=0  && age  < 10)  
			res = "아동";
		else if(age>=10 && age  < 20)
			res = "청소년";
		else if(age>=20 && age  < 50)  
			res = "성년";
		else if(age>=50 && age  < 70)  
			res = "장년";
	    else if(age>=70)  
			res = "노년";

        System.out.printf("[%d]살은 [%s]\n", age,res); 


	}
}
