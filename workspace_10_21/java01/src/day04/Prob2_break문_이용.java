package day04;

public class Prob2_break문_이용 {

	public static void main(String[] args) {

		A : for(int i = 1; i<10; i ++) {
			for(int j =2; j<10; j++) {
				//if (j==5) break;
				//if (j==9) break A;
				if (j==5) return;
				
				//if (j==5) continue;
				System.out.printf("%d * %d = %d |", j, i, j*i);
			
				}
				System.out.println();
		}
		}
		
			

	}
