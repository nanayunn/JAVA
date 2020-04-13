package day01;

class MyThread extends Thread{
	
	String name;
	public MyThread() {
		
	}
	public MyThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for(int i = 1;i<=100;i++) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			yield();
			System.out.println(name + ":"+ i);
		}
		super.run();
	}
	
}

public class t1 {

	public static void main(String[] args) {
		Thread T1 = new MyThread("t1");
		Thread T2 = new MyThread("t2");
		Thread T3 = new MyThread("t3");
		T1.setPriority(1);
		T2.setPriority(5);
		T3.setPriority(10);
		T1.start();
		T2.start();
		T3.start();

	}

}
