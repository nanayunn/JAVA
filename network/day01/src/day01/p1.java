package day01;

public class p1 {

	public static void main(String[] args) throws Exception {
		int data = 0;
		for(int i =0;i<=10;i++) {
			data += i;
			System.out.println("For1:"+i);
			Thread.sleep(200);
		}
		for(int i =0;i<=10;i++) {
			data += i;
			System.out.println("For2:"+i);
			Thread.sleep(200);
		}
		System.out.println("Data :"+ data);
	}

}
