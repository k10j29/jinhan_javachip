
import java.util.Scanner;

class Ex_switch1 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		String fruit;
		String res;

		System.out.print("과일명:");
		fruit  = scan.next();

		switch(fruit)
		{
			case "수박" : res="시원하다"; break;
			case "딸기" : res="맛있다";   break;
			case "참외" : res="알아둬";   break;
			default:      res="무슨맛?";
		}
 
        System.out.printf("[%s]은(는) [%s]\n", fruit,res); 

     

		
	}
}
