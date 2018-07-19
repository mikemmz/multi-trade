
public class MatrixMulta extends Thread {
	//int[][] X = { {1,2,3}, {4,5,6}, {7,8,9}};
	//int[][] Y = { {9,8,7}, {6,5,4}, {3,2,1}};
	
	private int[] a;      // ·∂« {1,2,3} []  
	private int[][] b;  //  À≈—° {9,8,7}  
	private int c;
	private int Row;
	

	
	
	public MatrixMulta(int[] X,int[][] Y,int r){		
		a = X;
        b = Y;
        c = 0;
        Row = r;
	}

	public int getAns(){
		return this.c;  
	}
	
	public void run(){
		System.out.println("Thread id: "+this.getId());  
		for(int i=0;i<3;i++){
					c += (a[i]*b[i][Row]);
		}
		
	}
	
}

// ¿»‘π  ª√’™“∏π“§ÿ≥   5702041620115 
