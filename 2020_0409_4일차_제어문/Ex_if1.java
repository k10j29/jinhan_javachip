import java.util.Random;

class Ex_if1 
{
	public static void main(String[] args) 
	{
  
        //�����߻� ��ü
		// new������ ��ü�� heap�� �����ȴ�
		Random rand = new Random();

		// int num = rand.nextInt(45) + 1;// 1~45

		int age = rand.nextInt( 101 );//0~100

		// 0~ 9 : �Ƶ�
		//10~19 : û�ҳ�
		//20~49 : ����
		//50~69 : ���
		//70~   : ���

		String res="";
        /*
		if(age>=0  && age  < 10)  
			res = "�Ƶ�";
		else
		{
			if(age>=10 && age  < 20)
				res = "û�ҳ�";
			else
			{
				if(age>=20 && age  < 50)  
					res = "����";
				else
				{
					if(age>=50 && age  < 70)  
						res = "���";
					else
					{
					    if(age>=70)  res = "���";
					}
				}
			}
		}*/

        if(age>=0  && age  < 10)  
			res = "�Ƶ�";
		else if(age>=10 && age  < 20)
			res = "û�ҳ�";
		else if(age>=20 && age  < 50)  
			res = "����";
		else if(age>=50 && age  < 70)  
			res = "���";
	    else if(age>=70)  
			res = "���";

        System.out.printf("[%d]���� [%s]\n", age,res); 


	}
}
