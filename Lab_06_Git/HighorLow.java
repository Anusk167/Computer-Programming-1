import java.util.Random;
import java.util.Scanner;

public class HighorLow{
    public static void main(String[] args) {
        Random random = new Random();;
        Scanner in = new Scanner(System.in);

        int guess;
        int number = random.nextInt( 10)+ 1;


        System.out.println("Enter your guess:");
        guess = in.nextInt();

        if (guess<number){
            System.out.println("Your guess was not high enough. The number was:" + number );}
        else if (guess > number) {
            System.out.println("Your guess was not not low enough. The number was: " + number);}
        else {
            System.out.println("You guessed it right! The number is:" + number);}
    }
}
