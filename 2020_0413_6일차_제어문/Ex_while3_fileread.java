// io(input output package)
import java.io.FileReader;

class Ex_while3_fileread 
{
	public static void main(String[] args) throws Exception
	{
		//ȭ�� �д� ��ü
		FileReader fr = new FileReader("a.txt");
		int ch;
        int count = 0;
		int alpha_upper_count = 0;//�빮�� ���� ����
		int alpha_lower_count = 0;//�ҹ��� ���� ����
		int number_count = 0;     //���ڰ���
		//white���� : ' '(����) '\t'  \r   \n
		int white_count = 0;      //���� ������ �ʴ� ����
		int etc_count = 0; //Ư������ �Ǵ� �ѱ�                       

        while(true){
            //fr�� ��ġ�� 1����(char)�� �о����
			ch = fr.read();
			//File ���� ������ -1 ��ȯ(EOF:End Of File)
			if(ch==-1) break;
			count++;//���� ���ڼ� ����
            //�빮�ڳ�?
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

        System.out.printf("�ѹ��ڼ�:%d(��)\n",count);
        System.out.printf("�빮�ڼ�:%d(��)\n",alpha_upper_count);
        System.out.printf("�ҹ��ڼ�:%d(��)\n",alpha_lower_count);
        System.out.printf("���ڼ�:%d(��)\n",  number_count);
        System.out.printf("ȭ��Ʈ���ڼ�:%d(��)\n",  white_count);
        System.out.printf("��Ÿ���ڼ�:%d(��)\n",  etc_count);


        //����� ȭ���� �ݾ���� ��.
		fr.close();

	}
}
