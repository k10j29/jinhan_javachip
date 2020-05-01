package mymain;

	import java.util.InputMismatchException;

	import java.util.Scanner;



	public class MyMain_달팽이2 {

	    public static void main(String[] args){

	    	Scanner scan = new Scanner(System.in);

	    	int deg;

	    	while(true){

		    	System.out.print("달팽이의 차수를 입력하세요 : ");

		    	try{

		    		deg = scan.nextInt();

		    		break;

		    	}catch(InputMismatchException e){

		    		System.out.println("숫자만 입력해야 합니다.");

		    	}

	    	}

	    	scan.close();

	        int n;

	        int row,col;

	        int k=0;

	        

	        int snail[][]= new int[deg][deg];

	        

	        int i =1;

	              

	        for(n=deg; n>0;n-=2){

	            for(col=0;col<n;col++){

	                snail[k][k+col]=i;

	                i++;           

	            }

	            for(row=1;row<n;row++){

	                snail[k+row][deg-k-1]=i;

	                i++;

	            }

	            for(col=1;col<n;col++){

	                snail[k+row-1][deg-k-col-1]=i;

	                i++;

	            }

	            for(col=1;col<n-1;col++){

	                snail[deg-k-col-1][k]=i;

	                i++;

	            }   

	            k++;

	        }

	        

	        //출력

	        for(row=0;row<deg;row++){

	            for(col=0;col<deg;col++){

	                System.out.printf("%3d",snail[row][col]);

	            }

	            System.out.println();

	        }

	    }

	}
