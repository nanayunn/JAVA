package day09;

public class Prob_dice {

	public static void main(String[] args) {
		
		Prob_dice game = new Prob_dice ();
		 
	 	int result1 = game.countSameEye(10);
	 		System.out.println("면의 개수가 8개인 주사위 2개를  던져서 같은 눈이 나온 횟수 : " + result1);
	 
		int result2 = game.countSameEye(-10);
			System.out.println("면의 개수가 8개인 주사위 2개를  던져서 같은 눈이 나온 횟수 : " + result2);
	 
	 
 			}
			int countSameEye(int n)  {
				try {
			if(n<0) throw new IllegalArgumentException();
				}catch (IllegalArgumentException e){
					System.out.println("음수로 던질 수 있다구..?");
				}
				Dice d = new Dice(8);
				Dice d1 = new Dice(8);
				int cnt = 0;
				
				for(int i = 0;i<n;i++) {
					if (d.play() == d1.play())
						cnt++;
				}
				
				
				
				return cnt;
 //구현	
				
				}



					}
		


	class Dice {
		int size;
		Dice(int size){
			this.size = size;
		}
	        int play(){
	 	      int number = (int)(Math.random() * size) + 1;
	              return number;
	        }
					}

	
	