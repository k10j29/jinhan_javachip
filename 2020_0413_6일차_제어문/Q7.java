class Q7 
{
	public static void main(String[] args) 
	{
		System.out.println("������  ����   ������ ");
		System.out.println("======================");
		for(int i=0;i<=5;i++){
           //System.out.printf("%5d%5d%5d\n",i, i*i,i*i*i);
		   System.out.printf("%5d%5d%5d\n",
			                  i,
			                  (int)Math.pow(i,2),
			                  (int)Math.pow(i,3));
		}
	}
}
