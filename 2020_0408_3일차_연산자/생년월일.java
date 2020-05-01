
import java.util.Scanner;


class 생년월일 
{
	public static void main(String[] args) 
	{
		//키보드입력
		Scanner scan = new Scanner(System.in);
        
		int year;//출생년도
		int age; //나이
		String tti="쥐";

		System.out.print("출생년도:");
		year = scan.nextInt();

        // 나이 = 현재년도 - 출생년도 + 1
        age = 2020 - year + 1 ;

        System.out.println(year%12);
        // 띠계산 : 출생년도 % 12 => 0 ~ 11 
		//12지
		// 4  5  6  7  8  9  10 11  0  1  2  3 <= tti_index
		// 자 축 인 묘 진 사 오 미 신 유 술 해
		// 쥐 소 범 토 용 뱀 말 양 원 닭 개 돼
    
	    int tti_index = year % 12;
        // if(조건) 명령; 
        if(tti_index == 0) tti="원숭이";
        if(tti_index == 1) tti="닭";
        if(tti_index == 2) tti="개";
        if(tti_index == 3) tti="돼지";
        if(tti_index == 4) tti="쥐";
        if(tti_index == 5) tti="소";
        if(tti_index == 6) tti="호랑이";
        if(tti_index == 7) tti="토끼";
        if(tti_index == 8) tti="용";
        if(tti_index == 9) tti="뱀";
        if(tti_index == 10) tti="말";
        if(tti_index == 11) tti="양";



		System.out.printf("나이:%d(살)\n", age);
		System.out.printf("띠:%s\n", tti);



	}
}
