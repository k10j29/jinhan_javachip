class 연산자_예외사항 
{
	public static void main(String[] args) 
	{
		int x = 1;
		int y = 2;
		boolean z;

		// Short circuit evaluation(경제적 연산)
		// && ||

        // x = 0     (x>0) -> false

        //앞조건이 이미 false 위에 명령수행 안함 
		z = (--x > 0) && (++y > 1) ;
//      x = 0   y = 3  z = false
//      x = 0   y = 2  z = false
        System.out.printf("x = %d y = %d z = %b\n",x,y,z);

        //앞조건이 이미 true 위에 명령수행 안함 
		z = (++x > 0) || (++y > 1) ;
//      x = 1   y = 2  z = true
		System.out.printf("x = %d y = %d z = %b\n",x,y,z);

		
	}
}
