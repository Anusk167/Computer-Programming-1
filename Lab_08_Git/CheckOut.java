import java.util.Scanner;
public class CheckOut {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double total = 0;
        do
        {
            total += SafeInput.getRangedDouble(in,"Enter price (.50 cents to $9.99 dollars)",0.5,9.99);
        }
        while(SafeInput.getYNConfirm(in, "Do you want to enter the price of another item? (Yy/Nn)") == true);
        System.out.printf("\nTotal cost of the items: $%.2f\n", total);
    }
}
