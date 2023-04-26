import java.util.Scanner;
public class BirthMonth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What is the number of your birth month? :");
        int MonthNum = in.nextInt();

        if(MonthNum >= 1 && MonthNum <= 12){
            System.out.println("Your birth month is: " + MonthNum);
        }
        else
        {
            System.out.println("You entered an invalid input: " + MonthNum);
        }
    }
}
