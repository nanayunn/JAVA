package ex;

public class DiceGame {
	public static void main(String args[]) {
		DiceGame game = new DiceGame();

		int result1 = game.countSameEye(10);
		System.out.println("면의 개수가 8개인 주사위 2개를  던져서 같은 눈이 나온 횟수 : " + result1);

		int result2 = game.countSameEye(-10);
		System.out.println("면의 개수가 8개인 주사위 2개를  던져서 같은 눈이 나온 횟수 : " + result2);

	}

	int countSameEye(int n) {
		Dice d = new Dice(8);
		Dice d1 = new Dice(8);
		int i = 0;
		try {
			if (n < 0)
				throw new IllegalArgumentException();
			else{
				for (int cnt = 0; cnt <= n; cnt++) {

					if (d.play() == d1.play()) {
						i++;
					}

				}
			}
		} catch (IllegalArgumentException e) {
			System.out.println("음수 안된다고!!!!!!!!!");
		}
		return i;
	}

}

class Dice extends DiceGame {
	int size;

	public Dice() {
		super();
	}

	Dice(int size) {
		this.size = size;
	}

	int play() {
		int number = (int) (Math.random() * size) + 1;
		return number;
	}

}
