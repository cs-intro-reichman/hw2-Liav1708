// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {

		int seed = Integer.parseInt(args[0]);
		String value = args[1];

		boolean endLoop = true;
		int counter = 1;
		int moveCounter = 0 ;
		int hailStoneCounter = 0;


		if ( value.charAt(0) == 'v') {

			for (int i = seed; i != 0; i--){

				int temp = counter;

				while (endLoop) {
					
					System.out.print(temp + " ");
					if (temp % 2 == 1) {
						temp = (temp * 3) + 1;
						moveCounter++;
					}
					else {
						temp = temp / 2;
						moveCounter++;
					}
					if (temp == 1) {
						endLoop = false;
						moveCounter++;
					}
				}
				counter++;
				endLoop = true;
				System.out.print("1 (" + moveCounter + ")");
				System.out.println("");
				moveCounter = 0;
			}
			System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
		}
		else if (value.charAt(0) == 'c') {

			for (int i = seed; i != 0; i--){

				int temp = counter;

				while (endLoop) {
					
					if (temp % 2 == 1) {
						temp = (temp * 3) + 1;
					}
					else {
						temp = temp / 2;
					}
					if (temp == 1) {
						endLoop = false;
					}
				}
				counter++;
				endLoop = true;
				hailStoneCounter++;
			}
			System.out.println("Every one of the first " + hailStoneCounter + " hailstone sequences reached 1.");
		}
	}
}

