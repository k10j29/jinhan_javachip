import java.util.Scanner;

class Exam_BMI 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		double height;
		double weight;
		double bmi;
		String bmi_res="";

        System.out.print("Ű/������:");
		height = scan.nextDouble();
		weight = scan.nextDouble();

		//BMI���
        height = height/100.0;// cm->m������ ��ȯ

		bmi = weight / (height*height);

        if(bmi < 18.5) 
			bmi_res = "��ü��";
		else if(bmi>=18.5 && bmi<=23) 
			bmi_res = "����";
		else if(bmi> 23 && bmi<=25) 
			bmi_res = "��ü��";
		else if(bmi > 25) 
			bmi_res = "��";

		System.out.printf("BMI:%.1f  ����:%s\n", bmi,bmi_res);

	}
}
