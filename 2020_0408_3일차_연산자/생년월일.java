
import java.util.Scanner;


class ������� 
{
	public static void main(String[] args) 
	{
		//Ű�����Է�
		Scanner scan = new Scanner(System.in);
        
		int year;//����⵵
		int age; //����
		String tti="��";

		System.out.print("����⵵:");
		year = scan.nextInt();

        // ���� = ����⵵ - ����⵵ + 1
        age = 2020 - year + 1 ;

        System.out.println(year%12);
        // ���� : ����⵵ % 12 => 0 ~ 11 
		//12��
		// 4  5  6  7  8  9  10 11  0  1  2  3 <= tti_index
		// �� �� �� �� �� �� �� �� �� �� �� ��
		// �� �� �� �� �� �� �� �� �� �� �� ��
    
	    int tti_index = year % 12;
        // if(����) ���; 
        if(tti_index == 0) tti="������";
        if(tti_index == 1) tti="��";
        if(tti_index == 2) tti="��";
        if(tti_index == 3) tti="����";
        if(tti_index == 4) tti="��";
        if(tti_index == 5) tti="��";
        if(tti_index == 6) tti="ȣ����";
        if(tti_index == 7) tti="�䳢";
        if(tti_index == 8) tti="��";
        if(tti_index == 9) tti="��";
        if(tti_index == 10) tti="��";
        if(tti_index == 11) tti="��";



		System.out.printf("����:%d(��)\n", age);
		System.out.printf("��:%s\n", tti);



	}
}
