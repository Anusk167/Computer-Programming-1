import java.util.Scanner;
public class FavNumbers{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        double favDouble = 0;
        int favInt = 0;

        favDouble = SafeInput.getDouble(in, "Enter your favorite double");
        favInt = SafeInput.getInt(in, "Enter your favorite integer");

        System.out.println("\nYour favorite integer is " + favInt);
        System.out.println("\n1Your favorite double is " + favDouble);

    }
}
