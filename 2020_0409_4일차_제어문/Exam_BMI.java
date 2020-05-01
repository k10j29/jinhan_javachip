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

        System.out.print("키/몸무게:");
		height = scan.nextDouble();
		weight = scan.nextDouble();

		//BMI계산
        height = height/100.0;// cm->m단위로 변환

		bmi = weight / (height*height);

        if(bmi < 18.5) 
			bmi_res = "저체중";
		else if(bmi>=18.5 && bmi<=23) 
			bmi_res = "정상";
		else if(bmi> 23 && bmi<=25) 
			bmi_res = "과체중";
		else if(bmi > 25) 
			bmi_res = "비만";

		System.out.printf("BMI:%.1f  상태:%s\n", bmi,bmi_res);

	}
}
