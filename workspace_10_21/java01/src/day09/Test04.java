package day09;

public class Test04 {
		public static void main(String[] args) {
			System.out.println("START");

			String msg = "5";
			
			int num=0;
			int res = 0;
			try {
			
			num = Integer.parseInt(msg);   //예외가 발생하는 라인
			if(num!=0)res = 1000/num;
			if(num>=0) {
				int j[] = new int[num];
			}
			
			}catch (NumberFormatException e) {
				System.out.println("숫자만 입력하세요..^^");
				System.out.println(e.getMessage());
				}
				//e.printStackTrace();
//			catch(ArithmeticException e) {
//				System.out.println("0은 입력하지 마시지...");
//				// e.printStackTrace();
//			}
//			catch (NegativeArraySizeException e) {
//				System.out.println("그 숫자는 좀..."+e.toString());
			//}	
			finally {
				System.out.println("일단 실행은 해드렸어요;");
			}
//			System.out.println(num);
//			System.out.println(res);
			
			System.out.println("======================================");
			
			int[] j = {1,2,3,4,5};
			for(int i = 0;i<j.length;i++) {
				System.out.print(j[i]+"   ");
			}
			
			
			
			
			
			
			
			
			
			
			
			System.out.println("END");
		}

	}
