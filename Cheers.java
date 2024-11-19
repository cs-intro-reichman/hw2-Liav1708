// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {

	    String word = args[0];
            int reps = Integer.parseInt(args[1]);

            int counter = 0;

            String newWord = word.toUpperCase();
            System.out.println(newWord);


           while(counter < word.length()) {

                if (newWord.charAt(counter) == 'A' || newWord.charAt(counter) == 'E' || newWord.charAt(counter) == 'F' || newWord.charAt(counter) == 'H' || 
                newWord.charAt(counter) == 'I' || newWord.charAt(counter) == 'L' || newWord.charAt(counter) == 'M' || newWord.charAt(counter) == 'N' ||
                newWord.charAt(counter) == 'O' || newWord.charAt(counter) == 'R' || newWord.charAt(counter) == 'S' || newWord.charAt(counter) == 'X') {

                        System.out.println("Give me an " + newWord.charAt(counter) + ": " + newWord.charAt(counter) + "!");
                }
                else {
                        System.out.println("Give me a  " + newWord.charAt(counter) + ": " + newWord.charAt(counter) + "!");

                }

                counter++;
            }

            System.out.println("What does that spell?");
            if(reps!=0){
            for(int i =0;i < reps;i++){

                System.out.println(newWord + "!!!");
            }
            }     
        }
}
