import java.util.Scanner;
public class CtoF {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String trash = "";
        double temp = 0;
        double Fahr = 0;
        boolean done = false;
        do {
            System.out.println("enter the temperature in celsius: ");

            if (in.hasNextDouble()) {
                temp = in.nextDouble();
                in.nextLine();
                Fahr = (temp * 1.8) + 32;
                System.out.println("Temperature in Fahrenheit is " + Fahr);
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println(trash + " is not valid number");
            }
        } while (!done);
    }
}