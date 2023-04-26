import java.util.Scanner;
public class PartyAffiliation{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Type in your affiliation. (R/D/I/Other): ");
        String party = in.nextLine();
        if(party.equals("R"))
        {
            System.out.println("You get a republican elephant.");}
        else  if (party.equals("D"))
        {
            System.out.println("You get a democratic donkey.");}
        else if (party.equals("I"))
        {
            System.out.println("You get an independent human.");}
        else
        {
            System.out.println("You get distinct ");
        }
    }
}