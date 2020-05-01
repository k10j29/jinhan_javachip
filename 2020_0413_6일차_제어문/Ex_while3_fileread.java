// io(input output package)
import java.io.FileReader;

class Ex_while3_fileread 
{
	public static void main(String[] args) throws Exception
	{
		//화일 읽는 객체
		FileReader fr = new FileReader("a.txt");
		int ch;
        int count = 0;
		int alpha_upper_count = 0;//대문자 갯수 저장
		int alpha_lower_count = 0;//소문자 갯수 저장
		int number_count = 0;     //숫자갯수
		//white문자 : ' '(공백) '\t'  \r   \n
		int white_count = 0;      //눈에 보이지 않는 문자
		int etc_count = 0; //특수문자 또는 한글                       

        while(true){
            //fr의 위치의 1문자(char)씩 읽어오기
			ch = fr.read();
			//File 끝을 만나면 -1 반환(EOF:End Of File)
			if(ch==-1) break;
			count++;//읽은 문자수 증가
            //대문자냐?
			if(ch>='A' && ch<='Z')      alpha_upper_count++;
			else if(ch>='a' && ch<='z') alpha_lower_count++;
			else if(ch>='0' && ch<='9') number_count++;
			else if(ch==' ' || ch=='\t' || ch=='\r' || ch=='\n')
				white_count++;
			else
				etc_count++;
   
			System.out.printf("%c",ch);
			//Thread.sleep(1000);
		}

        System.out.printf("총문자수:%d(개)\n",count);
        System.out.printf("대문자수:%d(개)\n",alpha_upper_count);
        System.out.printf("소문자수:%d(개)\n",alpha_lower_count);
        System.out.printf("숫자수:%d(개)\n",  number_count);
        System.out.printf("화이트문자수:%d(개)\n",  white_count);
        System.out.printf("기타문자수:%d(개)\n",  etc_count);


        //사용한 화일은 닫아줘야 함.
		fr.close();

	}
}
