package day09;




public class Test06 {

	public static void main(String[] args) {
		System.out.println("시작");
		
		
		try {
			throw new Exception("그럴수 있지");
		} catch (Exception e) {
			
			//e.printStackTrace();
		
			System.out.println(e.getMessage());
		}finally {
			
			System.out.println("**************************");
			
			
		}
		
		
		
		System.out.println("끝");

	}

}
