import java.util.Scanner;
public class TheaterKiosk {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        if (age>=21)
        {
            System.out.println("Yes, You are old enough to get a wristband !");}
        else {
            System.out.println("No, You are not old enough to get a wristband.");}
    }
}