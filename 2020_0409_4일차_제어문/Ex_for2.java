class Ex_for2 
{
	public static void main(String[] args) 
	{
        for(int i=0; i<26 ;i++) // i = 0 1 2 3 ... 25
		{
			System.out.printf("%c", 'A' + i);
		}

		System.out.println();//�ٹٲٱ�
        
		for(int i='A' ; i<='Z' ;i++) // i = 65 66 67 .... 90
		{
            System.out.printf("%c", i);
		}
 
        System.out.println();//�ٹٲٱ�
        
		//ABCDEF......Z
		
		//AbCdEfGh....Z
        for(int i='A' ; i<='Z' ;i++) // i = 65 66 67 .... 90
		{
            if(i%2==1)//Ȧ����
				System.out.printf("%c", i);//��
            else
				System.out.printf("%c", i+32);//��
		} 

		System.out.println();//�ٹٲٱ�
		
		for(int i='A' ; i<='Z' ;i++) // i = 65 66 67 .... 90
		{
			//                                ��   ��    
			System.out.printf("%c",(i%2==1) ? i : i+32);
		} 

        System.out.println();//�ٹٲٱ�
         
         // 'A' : 65    'a' : 97
		 //         ��32  
       
        //��ҼҴ�ҼҴ�   
		//0  3  6  9
		//0123456789  <= i
		//AbcDefGhiJklM.......
        for(int i=0; i<26 ;i++) // i = 0 1 2 3 ... 25
		{
			if(i%3==0)
			    System.out.printf("%c", 'A' + i);
			else
                System.out.printf("%c", 'A' + i + 32);  
		} 

        System.out.println();//�ٹٲٱ�
     
        // - : ���� �־�� �ǳ�? 
		//012 345 678 <= (i%3==2)
		//ABC-DEF-GHI-.....
		for(int i=0; i<26 ;i++) // i = 0 1 2 3 ... 25
		{
		    System.out.printf("%c", 'A' + i);

			if(i%3==2)
	           System.out.printf("%c", '-');  
		} 

        System.out.println();//�ٹٲٱ�
		
		//012345678..  <= i
		//#@$#@$#@$

		//A#B@C$D#E@F$.....
		for(int i=0; i<26 ;i++) // i = 0 1 2 3 ... 25
		{
		    System.out.printf("%c", 'A' + i);

			if(i%3==0)
	           System.out.printf("%c", '#');  
			else if(i%3==1)
	           System.out.printf("%c", '@');  
			else if(i%3==2)
	           System.out.printf("%c", '$');  
		} 



	}
}
