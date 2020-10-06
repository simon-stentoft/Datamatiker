import java.util.Scanner;
import java.util.Random;

public class Gaetettal {
        public static void Gaettal() {

            //Random tal generator, og integer der holder øje med hvor mange forsøg der er brugt
            Random rand = new Random();
            int randInt1 = rand.nextInt(101);
            int numberofTries = 0;
            boolean win = false;

            while (win == false) {

                //Bruger inputter et tal
                System.out.print("Guess a random number between 0 - 100: ");
                Scanner input = new Scanner(System.in);
                int guess = input.nextInt();
                numberofTries++;

                //If statement der printer "Korrekt" hvis bruger gættede korrekt, og Else statement hvis gættet forkert.
                if (randInt1 == guess) {
                    win = true;
                    System.out.println("You guessed correctly!!");
                } else if (guess >= 101 || guess <= -1) {
                        System.out.println("Keep your guesses within the boundaries of 0 - 100!");
                } else if (guess < randInt1) {
                    System.out.println("You guessed wrong, your number was too low.");
                    System.out.println("Number of times you've guessed incorrectly: " + numberofTries);
                } else if (guess > randInt1) {
                    System.out.println("You guessed wrong, your number was too high!");
                    System.out.println("Number of times you've guessed incorrectly: " + numberofTries);
                } if (numberofTries == 10) {
                    System.out.println("I feel bad, the random number is " + randInt1 + ".");
                }
            }
        }
}
