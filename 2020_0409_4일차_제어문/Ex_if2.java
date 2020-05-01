class Ex_if2 
{
	public static void main(String[] args) 
	{
		int kor = 85;//국어점수
		String grade="F";

        //90~100 : A
		//80~89  : B
		//70~79  : C
		//60~69  : D
		//         F

        //유효성 체크(0~100)
		if( kor>=0 && kor<=100 ){ 
			//여러개의 명령을 1 그룹으로 묶을때 사용
			if(kor>=90) grade="A";
			else if(kor>=80) grade="B";
			else if(kor>=70) grade="C";
			else if(kor>=60) grade="D";
            else grade="F";
            
			System.out.printf("[%d]점 등급:%s\n",kor,grade);

 
		}else{
			System.out.println("점수는 0~100사이이어야 합니다");
		}




	}
}
