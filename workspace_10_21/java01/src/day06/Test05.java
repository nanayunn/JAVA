//package day06;
//
//public class Test05 {
//
//	public static void main(String[] args) {
//		singleTone s1 =  singleTone.getInstance();
//			singleTone s2 = singleTone.getInstance();
//		
//		System.out.println(s1 ==s2);
//	}
//
//}
//
// class singleTone{
//
//	 private static singleTone s ;
//	 private singleTone() {}
//	 
// 	public static singleTone getInstance() {
// 		return s;
//	 singleTone s = new singleTone();
////	 public static singleTone getInstance() {
//		 if (s == null) s = new singleTone();
//		 return s;
//	 }
// 
// 
// 		
// 	}
// 
// 
// 