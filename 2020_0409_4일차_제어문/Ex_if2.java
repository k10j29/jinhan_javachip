class Ex_if2 
{
	public static void main(String[] args) 
	{
		int kor = 85;//��������
		String grade="F";

        //90~100 : A
		//80~89  : B
		//70~79  : C
		//60~69  : D
		//         F

        //��ȿ�� üũ(0~100)
		if( kor>=0 && kor<=100 ){ 
			//�������� ����� 1 �׷����� ������ ���
			if(kor>=90) grade="A";
			else if(kor>=80) grade="B";
			else if(kor>=70) grade="C";
			else if(kor>=60) grade="D";
            else grade="F";
            
			System.out.printf("[%d]�� ���:%s\n",kor,grade);

 
		}else{
			System.out.println("������ 0~100�����̾�� �մϴ�");
		}




	}
}
