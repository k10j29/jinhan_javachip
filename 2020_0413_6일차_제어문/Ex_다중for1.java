
class Ex_����for1 //(����....)
{
	public static void main(String[] args) throws Exception
	{
		for(int a=0;a<3;a++)
		{
			for(int i=0; i<5 ;i++) // i = 0 1 2 3 4
			{
				for(int k=0;k<5;k++){  //k = 0 1 2 3 4
					System.out.print('*');
					Thread.sleep(10);
				}
				System.out.println();//�ٹٲٱ�
			}

			System.out.println("-------------");
		}

	}
}
