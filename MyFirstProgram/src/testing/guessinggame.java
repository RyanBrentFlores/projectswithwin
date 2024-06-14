package testing;

import java.util.Random;		// import random need daw sabi
import java.util.Scanner;		// import scanner. need din daw eh sabi ni eclipse
public class guessinggame {

	public static void realGuessingGame() {
		
		
        Random rand = new Random();
        int guessNum = rand.nextInt(100) + 1;
        int numTries = 0;
        Scanner input = new Scanner(System.in);		//System.in need ata ito para sa input
        int guess;
        boolean win = false;

        while (numTries < 10 && !win) {
            System.out.println("Guess a number between 1 and 100:");
            guess = input.nextInt();		// nextInt to limit input as Int type
            numTries++;

            if (guess == guessNum) {
                win = true;
            } else if (guess < guessNum) {
                System.out.println("Your guess is too low");
            } else if (guess > guessNum) {
                System.out.println("Your guess is too high");
            }
        }

        if(win) {
            System.out.println("You won. Yey!");
            System.out.println("The number is " + guessNum);
            System.out.println("Your tries: " + numTries + " tries");
        } else {
            System.out.println("Sorry, you exceeded the number of tries. The number was " + guessNum);
        }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		realGuessingGame();

		
	}

}
