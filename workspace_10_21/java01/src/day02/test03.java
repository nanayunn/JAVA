package day02;

public class test03 {

	public static void main(String[] args) {
		byte b = (byte) (127+1);
		System.out.println(b);
		System.out.printf("int(%d~%d)%n", Integer.MAX_VALUE, Integer.MIN_VALUE);
		System.out.printf("byte(%d~%d)", Byte.MAX_VALUE, Byte.MIN_VALUE);
		
		double d = 99.9;
		System.out.println(d);//99.9
		int i = (int)d;
		System.out.println(i);//99
		
		double f = 99.9;
		
		System.out.println(1/2); //0
		System.out.println(1/2.); //0.5
		
		//double p = 3.1415999999;
		double p = Math.PI;
		
		System.out.printf("%f %n", p);//6째 자리까지, 반올림해서 보여줌
		System.out.printf("%.9f %n", p);//9째 자리까지, 반올림해서 보여줌
		System.out.printf("%.3f %n", p);//3째 자리까지, 반올림해서 보여줌
		//1+1
		//"1"+"1"
		//'1'+'1'
		System.out.println(1+1);//2
		System.out.println('1'+'1');//98
		System.out.println("1"+"1");//11
		
		System.out.println(1+1+"~~~~"+1+1); //2~~~~11
		
		int ii =3, bb=5;
		System.out.println(ii+bb);
		System.out.println(ii+" "+bb);
		
		System.out.printf("%s %s %s %n",1,1,1);
		
		String s1 = "1"+"2";
		int s2 = Integer.parseInt("1")+Integer.parseInt("2");
		double s3 = Double.parseDouble("1.5")+ 2;
		
		System.out.printf("%s %d %f %n", s1, s2, s3);
		
		
		
	}

}
