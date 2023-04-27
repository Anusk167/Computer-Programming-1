import java.util.Scanner;
public class RockPaperScissors
{
    public static void main(String[] args)
    {
        String pl_A = "";
        String pl_B = "";
        String trash = "";
        boolean done = false;
        Scanner in = new Scanner(System.in);
        String playAgain = "";
        do
        {
            System.out.print("Player A, Enter your move.[r,s,p] :");
            if(in.hasNextLine())
            {
                pl_A = in.nextLine();
                System.out.print("Player B, Enter your move.[r,s,p]");
                pl_B = in.nextLine();
                if (pl_A.equalsIgnoreCase("r"))
                {
                    if (pl_B.equalsIgnoreCase("r"))
                    {
                        System.out.println("It's a Draw. Both of you selected Rock.");
                        System.out.print("Another one? [Y/N]: ");
                        playAgain = in.nextLine();
                        if(playAgain.equalsIgnoreCase("n"))
                        {
                            done = true;
                        }
                    }
                    else if (pl_B.equalsIgnoreCase("p"))
                    {
                        System.out.println("Player B wins! Paper beats Rock.");

                        System.out.print("Another one? [Y/N]: ");
                        playAgain = in.nextLine();
                        if(playAgain.equalsIgnoreCase("n"))
                        {
                            done = true;
                        }
                    }
                    else if (pl_B.equalsIgnoreCase("s"))// Player B must be Scissors
                    {
                        System.out.println("Player A Wins!Rock beats Scissors.");

                        System.out.print("Another one? [Y/N]: ");
                        playAgain = in.nextLine();
                        if(playAgain.equalsIgnoreCase("n"))
                        {
                            done = true;
                        }
                    }
                    else
                    {
                        trash = in.nextLine();
                        System.out.println("You need to enter a valid RPS Move for both players to continue playing. ");}
                }
                else if (pl_A.equalsIgnoreCase("p"))
                {
                    if (pl_B.equalsIgnoreCase("r"))
                    {
                        System.out.println("Player A Wins! Paper beats Rock.");

                        System.out.print("Another one? [Y/N]: ");
                        playAgain = in.nextLine();
                        if(playAgain.equalsIgnoreCase("n"))
                        {
                            done = true;
                        }
                    }
                    else if (pl_B.equalsIgnoreCase("p"))
                    {
                        System.out.println("It's a Draw!Both of you selected Paper");
                        System.out.print("Another one? [Y/N]: ");
                        playAgain = in.nextLine();
                        if(playAgain.equalsIgnoreCase("n"))
                        {
                            done = true;
                        }
                    }
                    else if (pl_B.equalsIgnoreCase("s")) // Player B must be Scissors
                    {
                        System.out.println("Player B Wins!Scissors beats Paper");

                        System.out.print("Another one? [Y/N]: ");
                        playAgain = in.nextLine();
                        if(playAgain.equalsIgnoreCase("n"))
                        {
                            done = true;
                        }
                    }
                    else
                    {
                        trash = in.nextLine();
                        System.out.println("You need to enter a valid RPS Move for both players to continue. ");
                    }
                }
                else if (pl_A.equalsIgnoreCase("s")) // pl_A must be Scissors
                {
                    if (pl_B.equalsIgnoreCase("r"))
                    {
                        System.out.println(" Player B Wins!Rock beats Scissors.");

                        System.out.print("Another one? [Y/N]: ");
                        playAgain = in.nextLine();
                        if(playAgain.equalsIgnoreCase("n"))
                        {
                            done = true;
                        }
                    }
                    else if (pl_B.equalsIgnoreCase("p"))
                    {
                        System.out.println("Player A Wins!Scissors beats Paper.");

                        System.out.print("Another one? [Y/N]: ");
                        playAgain = in.nextLine();
                        if(playAgain.equalsIgnoreCase("n"))
                        {
                            done = true;
                        }
                    }
                    else if (pl_B.equalsIgnoreCase("s")) // Player B must be Scissors
                    {
                        System.out.println("It's a Draw!Both of you selected Scissors");

                        System.out.print("Another one? [Y/N]: ");
                        playAgain = in.nextLine();
                        if(playAgain.equalsIgnoreCase("n"))
                        {
                            done = true;
                        }
                    }
                    else
                    {
                        trash = in.nextLine();
                        System.out.println("You need to enter a valid RPS Move for both players to continue. ");
                    }
                }
                else
                {
                    trash = in.nextLine();
                    System.out.println("You need to enter a valid RPS Move for both players to continue. ");
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You need to enter a valid RPS Move for both players to continue.");}

        }while(!done);

    }
}
