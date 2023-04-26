import java.util.Scanner;
public class Metric_Converter{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double meters = 0;
        double miles = 0;
        double feet = 0;
        double inches = 0;
        String trash = "";

        System.out.print("Enter the number of meters: ");
        if(input.hasNextDouble()) {
            meters = input.nextDouble();
            input.nextLine();}
        else {
            trash = input.nextLine();
            System.out.println("Need to enter a valid entry for number of meters: " + trash);
            System.exit(0);}

        inches = meters*39.37;
        miles = meters/1609;
        feet = meters*3.281;

        System.out.println(miles + " miles");
        System.out.println(feet + " feet");
        System.out.println(inches + " inches");

    }
}

