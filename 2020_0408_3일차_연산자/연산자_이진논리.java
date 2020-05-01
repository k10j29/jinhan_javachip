class 연산자_이진논리 
{
	public static void main(String[] args) 
	{
		int birth_day = 0x19901225;
        
		//                0001 1001 1001 0000
		//       0x19901225 >>> 16
        //       0x00001990    
		int year = birth_day >>> 16 ;

        //       0x19901225 >> 8
        //       0x00199012    9: 1001   1: 0001  
		//     & 0x000000ff    0: 0000   f: 1111 
		//                        0000      0001 

		int month = birth_day >> 8 & 0x000000ff;

        //       0x19901225    9: 1001   5: 0101  
		//     & 0x000000ff    0: 0000   f: 1111 
		//                        0000      0101 
		int day = birth_day  & 0x000000ff;


		System.out.printf("생년월일:%x\n",birth_day);
		System.out.printf("년:%x\n",year);
		System.out.printf("월:%x\n",month);
		System.out.printf("일:%x\n",day);

		//월 수정 : 제거->삽입

		// ^ : 소거
        //       0x19901225     5: 0101
		//     ^ 0x00001200     0: 0000
		//                         0101
		birth_day = birth_day ^ 0x00001200;
		System.out.printf("생년월일:%x\n",birth_day);
        
		//08추가
		// | : 추가
        //       0x19900025     5: 0101   
		//     | 0x00000800     0: 0000
		//                         0101 
		birth_day = birth_day | 0x00000800;
		System.out.printf("생년월일:%x\n",birth_day);



	}
}
