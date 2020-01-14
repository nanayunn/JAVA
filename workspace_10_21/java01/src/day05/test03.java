package day05;

public class test03 {

	public static void main(String[] args) {
		TV tv = null;
		tv = new TV();
		tv.color = "블랙";
		tv.print();
		tv.powerOn();
		tv.setchannel(17);
//		tv.channelUp();
//		tv.channelUp();
//		tv.channelUp();
		tv.print();

	}

}

class TV{
	String color;
	int channel;
	boolean power;
	
	
	public void setchannel(int c) {
		channel = c;
	}
	public void channelUp() {
		channel ++;
		
	}
	public void channelDown() {
		channel --;
		
	}
	public void powerOn() {
		power = true;
		
	}
	public void powerOff() {
		power = false;
		
	}
	public void print() {
		System.out.printf("TV[%s, %d, on/off(%b) ]%n", color, channel, power);
	}
}


