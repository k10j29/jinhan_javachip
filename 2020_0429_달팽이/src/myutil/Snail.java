package myutil;

public class Snail {
    //방향을 결정하는 상수 
	final static int RIGHT = 1;
	final static int DOWN  = 2;
	final static int LEFT  = 3;
	final static int UP    = 4;
	
	int [][] snail_array;
	int chasu;
	
	public void setChasu(int chasu) {
		this.chasu = chasu;
	     
		//달팽이 채우기
		make_snail();
	}

	private void make_snail() {
		// TODO Auto-generated method stub
		snail_array = new int[chasu][chasu];
		//달팽이 채우기
		int row = 0;
		int col = -1;
		int su  = 1;
		//R:1  D:2  L:3  U:4
		int direction = RIGHT;
		
		for(int i=0;i<chasu*chasu;i++) {
			
			//첨자이동시키기....
			//오른쪽:col++
			//아래쪽:row++
			//왼  쪽:col--
			//위  쪽:row--
			if(direction==RIGHT) {
				col++;
				//조건1)오른쪽으로 벗어났거나
				//조건2)이미값이 채워져 있으면
				if( col>=chasu || snail_array[row][col]!=0) {
					col--;//이동전 이전위치로
					row++;//오른쪽->아래로
					direction=DOWN;
				}
				
			}else if(direction==DOWN) {
				row++;
				
				if( row>=chasu || snail_array[row][col]!=0) {
					row--;
					col--;
					direction=LEFT;
				}
				
			}else if(direction==LEFT) {
				col--;
				
				if( col<0 || snail_array[row][col]!=0) {
					col++;
					row--;
					direction=UP;
				}
				
			}else if(direction==UP) {
				row--;
				
				if(snail_array[row][col]!=0) {
					row++;
					col++;
					direction=RIGHT;
				}
			}
			
			//값 채우기
			snail_array[row][col] = su++;
		}
	}
	
	
	private void make_snail2() {
		// TODO Auto-generated method stub
		snail_array = new int[chasu][chasu];
		//달팽이 채우기
		int row = 0;
		int col = -1;
		int su  = 1;
		//R:1  D:2  L:3  U:4
		//int direction = RIGHT;
		
		Direction direction = Direction.RIGHT;
		
		
		for(int i=0;i<chasu*chasu;i++) {
			
			//첨자이동시키기....
			//오른쪽:col++
			//아래쪽:row++
			//왼  쪽:col--
			//위  쪽:row--
			if(direction==Direction.RIGHT) {
				col++;
				//조건1)오른쪽으로 벗어났거나
				//조건2)이미값이 채워져 있으면
				if( col>=chasu || snail_array[row][col]!=0) {
					col--;//이동전 이전위치로
					row++;//오른쪽->아래로
					direction=Direction.DOWN;
				}
				
			}else if(direction==Direction.DOWN) {
				row++;
				
				if( row>=chasu || snail_array[row][col]!=0) {
					row--;
					col--;
					direction=Direction.LEFT;
				}
				
			}else if(direction==Direction.LEFT) {
				col--;
				
				if( col<0 || snail_array[row][col]!=0) {
					col++;
					row--;
					direction=Direction.UP;
				}
				
			}else if(direction==Direction.UP) {
				row--;
				
				if(snail_array[row][col]!=0) {
					row++;
					col++;
					direction=Direction.RIGHT;
				}
			}
			
			//값 채우기
			snail_array[row][col] = su++;
		}
	}
	
	
	public void display() {
		
		for(int i=0;i<chasu;i++) {
			for(int k=0;k<chasu;k++) {
				System.out.printf("%4d", snail_array[i][k]);
			}
			System.out.println();
		}
		
	}
	
	
	
	
	
	
}
