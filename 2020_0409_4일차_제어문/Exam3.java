import java.util.Scanner;

class Exam3 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
        //ÀÔ·Â¹ÞÀ» º¯¼ö
		double c;
		double f;

		//°á°ú°ª ÀúÀåÇÒ º¯¼ö
		double res_c;
		double res_f;

        System.out.print("¼·¾¾(C)/È­¾¾(F):");
		c = scan.nextDouble();
		f = scan.nextDouble();

		//°è»ê
        res_f  = 9.0/5.0*c  + 32.0 ;  //¼·¾¾->È­¾¾
		res_c  = 5.0/9.0*(f - 32.0);  //È­¾¾->¼·¾¾

        //°á°ú
		System.out.printf("¼·¾¾(C) %.1f´Â È­¾¾·Î %.1f(F)\n",c,res_f);
		System.out.printf("È­¾¾(C) %.1f´Â ¼·¾¾·Î %.1f(F)\n",f,res_c);


			







	}
}
