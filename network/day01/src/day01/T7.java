package day01;


class Calc extends Thread{
	int cnt;
	int sum;
	
	public Calc(int cnt) {
		this.cnt = cnt;
	}
	
	@Override
	public void run() {
	//1���� cnt ������ ���� ���϶�
	//Thread.sleep(200)
		for(int i = 1;i<=cnt;i++) {
			sum += i;
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
		
}
}


public class T7 {

	public static void main(String[] args) {
			Calc c = new Calc(100);
			c.start();
			try {
				c.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(c.sum);
			//sum���� ����Ͻÿ�
	}

}
