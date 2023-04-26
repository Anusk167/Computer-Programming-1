import java.util.Scanner;
public class FuelCosts {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num_Gal = 0;
        double fuel_eff = 0;
        double price_Gal = 0;
        double mileage;
        double Gal_per_100;

        String trash = "";
        System.out.println("Enter the gallons of gas in your fuel tank: ");
        if(input.hasNextInt()) {

            num_Gal = input.nextInt();
            input.nextLine();}
        else {
            trash = input.nextLine();
            System.out.println("Needs to enter a valid entry: " + trash);
            System.exit(0);}

        System.out.println("What's your car's fuel efficiency (mpg)?");
        if(input.hasNextDouble()) {
            fuel_eff = input.nextDouble();
            input.nextLine();}
        else {
            trash = input.nextLine();
            System.out.println("Must enter a valid entry: " + trash);
            System.exit(0);}

        System.out.println("What is the price per gallon of gas?");
        if(input.hasNextDouble()) {
            price_Gal = input.nextDouble();
            input.nextLine();
        }
        else {
            trash = input.nextLine();
            System.out.println("Needs to enter a valid entry: " + trash);
            System.exit(0);
        }

        mileage = fuel_eff*num_Gal;
        Gal_per_100 = 100/fuel_eff;

        //Output
        System.out.println("The cost per 100 miles is "+Gal_per_100*price_Gal);
        System.out.println("The car can go "+mileage+" miles with the current fuel level");

    }

}
