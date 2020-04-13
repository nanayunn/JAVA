package day01;

class MyT implements Runnable{
	
	String name;
	boolean flag;
	public MyT() {
		
	}
	public MyT(String name) {
		this.name = name;
		flag = true;
	}

	
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	@Override
	public void run() {
//		for(int i = 1;i<100;i++) {
//			System.out.println(name +":"+i);
//		}
//		
		while(true) {
			if(flag ==false) {
				break;
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name);
		}
		System.out.println("End..");
	}
	
}

public class T2 {
	

	public static void main(String[] args) throws Exception {
//		Thread t1 = new Thread(
//				new MyT("T1"));
//		t1.start();
//		Thread t2 = new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				
//			}
//		});
//		t2.start();
		MyT r = new MyT("R1");
		Thread t1 = new Thread(r);
		t1.setDaemon(true);
		t1.start();
		Thread.sleep(3000);
//		t1.start();
//		Thread.sleep(3000);
//		r.setFlag(false);
//		System.out.println("end main...");
	}

}
