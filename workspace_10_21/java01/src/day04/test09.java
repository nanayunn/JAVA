package day04;

public class test09 {

	public static void main(String[] args) {
		int[] n1 = {99, 55, 77, 88};
		int[] n2 = {90, 83};
		int[] n3 = {24, 68, 55};
		int[] n4 = {52, 64, 24, 77};
		
		
		int[][] nn = {
					{99, 55, 77, 88}, 
					{90, 83}, 
					{24, 68, 55}, 
					{52, 64, 24, 77}
					};
		
//		nn[0] = n1;
//		nn[1] = n2;
//		nn[2] = n3;
//		nn[3] = n4;
		
//		System.out.printf("[%d, %d, %d, %d] %n", nn[0][0], nn[0][1], nn[0][2],nn[0][3]);
//		System.out.printf("[%d, %d, %d, %d] %n", nn[1][0], nn[1][1], nn[1][2],nn[1][3]);
//		System.out.printf("[%d, %d, %d, %d] %n", nn[2][0], nn[2][1], nn[2][2],nn[2][3]);
//		System.out.printf("[%d, %d, %d, %d] %n", nn[3][0], nn[3][1], nn[3][2],nn[3][3]);
		
		for(int i =0;i<nn.length;i++) {
			for(int j = 0; j<nn[i].length;j++) {
				if (nn[i][j] %2 ==0) {
					nn[i][j] = 0;
				}else {
					nn[i][j] =1;
					
				}
				
			}
		}
			System.out.println();
			
		for(int a =0;a<nn.length;a++) {
			for(int j = 0; j<nn[a].length;j++) {
				System.out.printf("%d ", nn[a][j]);
			
			}
			
			System.out.println();
		}
		}
	}

		
		
	


