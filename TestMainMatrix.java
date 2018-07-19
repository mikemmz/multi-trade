
public class TestMainMatrix {

	public static void main(String[] args) {
		
	int[][] X = { {1,2,3}, {4,5,6}, {7,8,9}};
	int[][] Y = { {9,8,7}, {6,5,4}, {3,2,1}};
	int[][] Z  = new int [3][3];
		
		MatrixMulta T1 = new MatrixMulta(X[0],Y,0);
		MatrixMulta T2 = new MatrixMulta(X[0],Y,1);
		MatrixMulta T3 = new MatrixMulta(X[0],Y,2);
		MatrixMulta T4 = new MatrixMulta(X[1],Y,0);
		MatrixMulta T5 = new MatrixMulta(X[1],Y,1);
		MatrixMulta T6 = new MatrixMulta(X[1],Y,2);
		MatrixMulta T7 = new MatrixMulta(X[2],Y,0);
		MatrixMulta T8 = new MatrixMulta(X[2],Y,1);
		MatrixMulta T9 = new MatrixMulta(X[2],Y,2);
		
		
		T1.start();     //Start thread  T1
		T2.start();     
		T3.start();
		T4.start();
		T5.start();
		T6.start();
		T7.start();
		T8.start();
		T9.start();
		
		
		try {
			T1.join();
			T2.join();
			T3.join();
			T4.join();
			T5.join();
			T6.join();
			T7.join();
			T8.join();
			T9.join();
		} 
		catch (InterruptedException e) { 
			
		}
		
		
		
		Z[0][0] = T1.getAns();    //ดึงผลลัพธ์ออกมา
		Z[0][1] = T2.getAns();
		Z[0][2] = T3.getAns();
		Z[1][0] = T4.getAns();
		Z[1][1] = T5.getAns();
		Z[1][2] = T6.getAns();
		Z[2][0] = T7.getAns();
		Z[2][1] = T8.getAns();
		Z[2][2] = T9.getAns();

		
		for(int i=0;i<3;i++){           //ลูปนี้ใช้แสดงค่าผลลัพธ์
            for(int j=0;j<3;j++){
                System.out.print(Z[i][j]+"  |  ");   
            }
            System.out.println();
        }
		
		
	}

}
//// ภศิน  ปรีชาธนาคุณ   5702041620115 