package day09;

public class Test05 {

	public static void main(String[] args) {
		System.out.println("Start");

		for(int i = 0; i<5;i++) {
			System.out.println("========================");
			
			
			
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}finally {
				System.out.println("자원 반납하시요");
			}
		}
		
		
		
		
		System.out.println("End");
	}

}
