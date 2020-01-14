package day06;

public class test03 {

	public static void main(String[] args) {
		
		Time t1 = new Time();
		t1.hour = 11;
		t1.minute = 59;
		t1.second = 32;
		
		t1.print();
		
		Location p1 = new Location();
		
		p1.x = 3.134;
		p1.y = 5.2366;
		p1.print();
		
		
		
	}

}


class Time{
	int hour;
	int minute;
	int second;
	
	public void print()
	{
		System.out.printf("%d시 : %d분 : %d초  %n", hour, minute, second);
	}
	
}

class Location{
	double x;
	double y;
	public void print()
	{
	System.out.printf("위치 좌표(%f, %f)", x, y);
	}
	}