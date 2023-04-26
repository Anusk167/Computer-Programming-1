import java.util.Scanner;
public class CtoFConverter{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double tempinC = 0.0;

        String trash ="";

        System.out.println("Enter the temperature in Celsius: ");

        if (in.hasNextDouble()){
            tempinC = in.nextDouble();
            in.nextLine();

        }else {
            trash = in.nextLine();
            System.out.println("Enter temperature in celsius only.");
            System.out.println("Try again");
            System.exit(0);
        }
        double tempinF = tempinC * 9.0/5.0;

        tempinF += 32.0;

        System.out.format("The temperature in Fahrenheit is %.2f\n", tempinF);
    }
}