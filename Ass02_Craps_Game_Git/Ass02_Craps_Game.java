

import java.util.Random;
import java.util.Scanner;
public class Ass02_Craps_Game {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random Roll = new Random();
        String playAgain = "";
        int dice1 = Roll.nextInt(6) + 1;
        int dice2 = Roll.nextInt(6) + 1;
        int Sum = dice1 + dice2;
        int point = 0;
        boolean done = false;
        boolean later = false;

        do {
            dice1 = Roll.nextInt(6) + 1;
            dice2 = Roll.nextInt(6) + 1;
            System.out.println("Dice 1: " + dice1 + ".");
            System.out.println("Dice 2: " + dice2 + ".");
            Sum = dice1 + dice2;

            if (Sum == 2 || Sum == 3 || Sum == 12) {

                System.out.println("The sum of the two dice is " + Sum);
                System.out.println("You have crapped out. ");
                System.out.print("Would you like to play again? [Y/N]: ");
                playAgain = in.nextLine();

                if (playAgain.equalsIgnoreCase("N")) {
                    done = true;

                } else if (playAgain.equalsIgnoreCase("Y")) {
                    done = false;
                }
            } else if (Sum == 7 || Sum == 11) {

                System.out.println("The sum of the two dice was " + Sum);
                System.out.println("You have won.");
                System.out.print("Would you like to play again? [Y/N]: ");
                playAgain = in.nextLine();

                if (playAgain.equalsIgnoreCase("N")) {
                    done = true;

                } else if (playAgain.equalsIgnoreCase("Y")) {
                    done = false;
                }
            } else {
                point = Sum;
                System.out.println("You should try to get point " + point );

                do {

                    System.out.print("Would you like to roll again? [Y/N]: ");
                    playAgain = in.nextLine();

                    if (playAgain.equalsIgnoreCase("N")) {
                        done = true;

                    } else if (playAgain.equalsIgnoreCase("Y")) {
                        done = false;

                        do {
                            dice1 = Roll.nextInt(6) + 1;
                            dice2 = Roll.nextInt(6) + 1;
                            System.out.println("Dice 1: " + dice1 + ".");
                            System.out.println("Dice 2: " + dice2 + ".");
                            Sum = dice1 + dice2;

                            if (Sum == 7) {

                                System.out.println("The sum of the two dice is " + Sum);
                                System.out.println("You have crapped out. ");
                                System.out.print("Would you like to play again? [Y/N]: ");
                                playAgain = in.nextLine();

                                if (playAgain.equalsIgnoreCase("N")) {

                                    done = true;
                                    later = true;

                                } else if (playAgain.equalsIgnoreCase("Y")) {

                                    done = false;
                                    later = true;
                                }


                            } else if (Sum == point) {

                                System.out.println("You have won.");
                                System.out.print("Would you like to play again? [Y/N]: ");
                                playAgain = in.nextLine();

                                if (playAgain.equalsIgnoreCase("N")) {

                                    done = true;
                                    later = true;

                                } else if (playAgain.equalsIgnoreCase("Y")) {

                                    done = false;
                                    later = true;

                                }
                            } else {
                                System.out.println("You haven't won or lost ");
                                System.out.print("Do you want to roll again? [Y/N]: ");
                                playAgain = in.nextLine();

                                if (playAgain.equalsIgnoreCase("N")) {

                                    done = true;
                                    later = true;

                                } else if (playAgain.equalsIgnoreCase("Y")) {

                                    done = false;
                                    later = false;
                                }
                            }
                        } while (!later);
                    }
                } while (!done);
            }
        }while (!done);
    }
}
