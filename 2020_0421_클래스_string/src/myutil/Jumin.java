package myutil;

import java.util.Calendar;

public class Jumin {

	String jumin_no;

	public void setJumin_no(String jumin_no) {
		this.jumin_no = jumin_no;
	}
	
	public int getYear () {
		
		
		
///////////////////////����⵵////////////////////////////
		
	    //             01234567890123  <= index(÷��)
	    // jumin_no = "801212-1234567";
		
		// �ֹι�ȣ �� 0��° �ڸ����� 2���� �ڸ����� �⵵
		String strYear = jumin_no.substring(0,0+2);
		// ���ڿ��� ������ ��ȯ ���ִ� �Լ� 
		int year = Integer.parseInt(strYear);
		
		// ���ڿ����� �Ѱ����� �����Ҷ� (��,�� ����)
		char gender = jumin_no.charAt(7);
		
		//1900��� ���� 1/2/5/6
		
		if (gender=='1' || gender=='2' || gender=='5'  || gender=='6')
		
		//1900���
	    year = year + 1900;
		
		//������ 1900��밡 �ƴϸ�
		else 
		year = year + 2000;
		
		return year;
		
	}	        
//         ������    �ܱ���    
//         ��  ��    ��  ��
// 1900    1   2     5   6  
// 2000    3   4     7   8  

	
	
///////////////////////���̱��ϱ�////////////////////////////
	
	public int getAge() {
		
		//���� �ý��� �ð� ���ϱ� 
		Calendar c = Calendar.getInstance();
		//���� ���� current_year �̶�� Ī�ϰ�, �ý��� �ð� c���� ���� ���ϱ�
		int current_year = c.get(Calendar.YEAR);
		//���� 2020�⿡�� getYear �A�� �� �ѻ� ��ġ��
		int age = current_year - this.getYear() +1;
		
		return age;}

	

///////////////////////12�� ���ϱ�////////////////////////////
	
	// 4 5 6 7 8 9 10 11 0 1 2 3 
	// 
	/*
	// 12��
	// 4  5  6  7  8  9  10 11 0  1  2  3  <= ����⵵%12
	// �� �� �� �� �� �� �� �� �� �� �� �� 
	//��
	public String getTti() {
		
		switch(this.getYear()%12)
		{
		  case  0: return "������";
		  case  1: return "��";
		  case  2: return "��";
		  case  3: return "����";
		  case  4: return "��";
		  case  5: return "��";
		  case  6: return "ȣ����";
		  case  7: return "�䳢";
		  case  8: return "��";
		  case  9: return "��";
		  case 10: return "��";
		  case 11: return "��";
		}
		
		return "";
	}
	
	
*/
	
	//����
	public String getGender() {
		char gender = jumin_no.charAt(7);
		
		if(gender=='1' || gender=='3' || gender=='5' || gender=='7')
		   return "����";
		
		return "����";
	}
	
	//      4  5  6  7  8  9  0  1  2  3        <=����⵵%10 
	//10��  �� �� �� �� �� �� �� �� �� ��
	//      4  5  6  7  8  9  10 11 0  1  2  3  <=����⵵%12
	//12��  �� �� �� �� �� �� �� �� �� �� �� ��
	
	//2020%10 -> 0
	//2020%12 -> 4
	
	//60����
	public String getGanji() {
		String gan="��";
		String ji="��";
		int gan_index = this.getYear()%10;//0~9
		int ji_index  = this.getYear()%12;//0~11
		
		switch(gan_index)
		{
		   case 0: gan = "��";break;
		   case 1: gan = "��";break; 
		   case 2: gan = "��";break; 
		   case 3: gan = "��";break; 
		   case 4: gan = "��";break; 
		   case 5: gan = "��";break; 
		   case 6: gan = "��";break; 
		   case 7: gan = "��";break; 
		   case 8: gan = "��";break; 
		   case 9: gan = "��";break; 
		}
		
		switch(ji_index)
		{
			case  0: ji = "��";break;
			case  1: ji = "��";break;
			case  2: ji = "��";break;
			case  3: ji = "��";break;
			case  4: ji = "��";break;
			case  5: ji = "��";break;
			case  6: ji = "��";break;
			case  7: ji = "��";break;
			case  8: ji = "��";break;
			case  9: ji = "��";break;
			case 10: ji = "��";break;
			case 11: ji = "��";break;
		}
		
		return String.format("%s%s��", gan,ji);
		
	}
	
	//60���ڸ� �ٸ�������� ���غ�.
	public String getGanji2() {
		
		int gan_index = this.getYear()%10;//0~9
		int ji_index  = this.getYear()%12;//0~11
		
		//                 0 1                   <=index   
		String gan_list = "����Ӱ谩����������";
		//                 0 1 2 3 4 5
		String ji_list  = "�������������ι��������";
		
		//2020
		char gan = gan_list.charAt(gan_index); //'��'
		char ji  = ji_list.charAt(ji_index);   //'��'
		
		return String.format("%c%c��", gan, ji);
		
	}
	
	
	//�������
	public String getSeason() {
		
		String strMonth = jumin_no.substring(2,2+2);
	    int    month    = Integer.parseInt(strMonth);
	    // 3~5:��  6~8:����  9~11:���� 12,1,2:�ܿ�
	    switch(month/3) 
	    {
	     case 1: return "��";
	     case 2: return "����";
	     case 3: return "����";
	    }
	    
		return "�ܿ�";
	}
	
	//�������
	public String getLocal() {
		String strLocal = jumin_no.substring(8, 8+2);
		int    local    = Integer.parseInt(strLocal);
		
		if(local>=0 && local<=8) return "����";
		else if(local>= 9 && local<=12) return "�λ�";
		else if(local>=13 && local<=15) return "��õ";
		else if(local>=16 && local<=25) return "��⵵";
		else if(local>=26 && local<=34) return "������";
		else if(local>=35 && local<=39) return "��û�ϵ�";
		else if(local==40) return "����";
		else if(local>=41 && local<=47) return "��û����";
		else if(local>=48 && local<=54) return "����ϵ�";
		else if(local>=55 && local<=58) return "����";
		else if(local>=59 && local<=66) return "���󳲵�";
		else if(local>=67 && local<=70) return "�뱸������";
		else if(local>=71 && local<=81) return "���ϵ�";
		else if(local>=82 && local<=84 ||
				 local>=86 && local<=91) return "��󳲵�";
		else if(local==85) return "���";
		else if(local>=92 && local<=95) return "���ֵ�";
	
		
		return "";
	}
	
	//��ȿ��
	public boolean isValid() {
		
		//           01234567890123   
		//jumin_no ="801212-1234560"
		//           234567 892345 
		// '0':48 '1':49 '2':50
		//'1'=>1 ��ȯ
		//'1' - '0' => 1
		//49  -  48 =>   
		
		int sum = 0;
		
		/*
		//���1)
		sum = sum + (jumin_no.charAt(0)  - '0') * 2 ;
		sum = sum + (jumin_no.charAt(1)  - '0') * 3 ;
		sum = sum + (jumin_no.charAt(2)  - '0') * 4 ;
		sum = sum + (jumin_no.charAt(3)  - '0') * 5 ;
		sum = sum + (jumin_no.charAt(4)  - '0') * 6 ;
		sum = sum + (jumin_no.charAt(5)  - '0') * 7 ;
		sum = sum + (jumin_no.charAt(7)  - '0') * 8 ;
		sum = sum + (jumin_no.charAt(8)  - '0') * 9 ;
		sum = sum + (jumin_no.charAt(9)  - '0') * 2 ;
		sum = sum + (jumin_no.charAt(10) - '0') * 3 ;
		sum = sum + (jumin_no.charAt(11) - '0') * 4 ;
		sum = sum + (jumin_no.charAt(12) - '0') * 5 ;
		*/
		
		//���2)�ݺ��� �̿�
		int su = 2;
		for(int i=0;i<=12;i++) {
			if(i==6)continue;
			
			sum = sum + (jumin_no.charAt(i)  - '0') * su ;
			su++;
			if(su>9)su=2;
		}
		
		//üũ��
		int check_num = (11-(sum%11))%10;
		
		System.out.println(check_num);
		
		//������ ��
		int last_num  = jumin_no.charAt(13) - '0';
		
		return (last_num == check_num);
	}

	
	
	
	
	
	
	
	
}
