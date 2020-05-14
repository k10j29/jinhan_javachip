package mymain.output;

import java.io.OutputStream;

public class MyMain_1_Monitor_Output {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// Console(출력) 창치 스트림 얻기
        OutputStream os = System.out;
        
        //OutputStream buffer기록된다
        os.write('A');
        
        os.write('1');
        
        os.write(50);// ASCII : '2' <- 50
        
        String msg = "안녕하세요";
        //String -> byte[]
        os.write(msg.getBytes());
        
        boolean bOk = true; //
        //String.valueOf(자료형값)=>String으로 변환
        //  true=>"true"
        os.write(String.valueOf(bOk).getBytes());
        
        double d = 3.14;
        os.write(String.valueOf(d).getBytes());
                
        
        
        
        
        //Buffer(비우기)->출력장치로 전송
        os.flush();
        
        
        
        
	}

}
