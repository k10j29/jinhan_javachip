class 이모티콘 
{
	//
	//  java 이모티콘  웃음  울음
	public static void main(String[] args) 
	{
		//                      0      1
		// String [] args = { "웃음","울음" };

		System.out.println(args[0]);

		if(args[0].equals("웃음")){
            System.out.println("^ ^");
            System.out.println(" ^");
            System.out.println(" ~");
		}

		if(args[0].equals("슬픔")){
            System.out.println("▼ ▼");
            System.out.println(" ^");
            System.out.println(" ~");
		}

		

/*
		System.out.println("^ ^");
		System.out.println(" ^ ");
		System.out.println("~~~");
*/
	}
}
