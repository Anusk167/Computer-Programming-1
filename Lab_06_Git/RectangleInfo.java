import java.util.Scanner;
public class RectangleInfo {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        double sideA = 0;
        double sideB = 0;
        double sideC = 0;
        double sideD = 0;
        String trash = "";

        while (true) {
            System.out.println("Enter side A of the rectangle: ");
            if (in.hasNextDouble())
            {
                sideA = in.nextDouble();
                in.nextLine(); //clears the buffer
                break;
            } else
            {
                trash = in.nextLine();
                System.out.println("For side A you entered: " + trash);
                System.out.println("Enter a number and try again: ");}
        }

        while (true) {
            System.out.println("Enter side B of the rectangle: ");
            if (in.hasNextDouble()) //checks the safety of the double
            {
                sideB = in.nextDouble();
                in.nextLine();
                break;
            } else
            {
                trash = in.nextLine();
                System.out.println("Your entry for side B: " + trash);
                System.out.println("Enter a number and try again: ");}
        }
        while (true) {
            System.out.println("Enter side C of the rectangle: ");
            if (in.hasNextDouble())
            {
                sideC = in.nextDouble();
                in.nextLine();
                break;
            } else
            {
                trash = in.nextLine();
                System.out.println("Your entry for side C: " + trash);
                System.out.println("Enter a number and try again: ");}
        }
        while (true) {
            System.out.println("Enter side D of the rectangle: ");
            if (in.hasNextDouble())
            {
                sideD = in.nextDouble();
                in.nextLine();
                break;
            }
            {
                trash = in.nextLine();
                System.out.println("Your entry for side D: " + trash);
                System.out.println("Enter a number and try again: ");}
        }
        double perimeter = sideA + sideB + sideC + sideD;
        System.out.println("Perimeter of the rectangle is: " +perimeter);
        double area = sideA * sideD;
        System.out.println("Area of the rectangle is: " +area);
        double diagonal = Math.sqrt((sideA * sideA) + (sideD * sideD));
        System.out.println("The diagonal of the rectangle is: " +diagonal);
    }
}