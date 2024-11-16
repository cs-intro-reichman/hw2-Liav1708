// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    
		int reps = Integer.parseInt(args[0]);

		int counter = 1;
		double divider = 3.0;
		double sum = 1.0;
		boolean minusOrPlus = false;


		while(counter < reps) {

			if(minusOrPlus == false) {

				sum = sum - (1.0 / divider);
				minusOrPlus = true;
			}
			else {

				sum = sum + (1.0 / divider);
				minusOrPlus = false;
			}

			counter++;
			divider = divider + 2.0;
		}

		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated: " + sum * 4.0);
	}
}
