
import java.util.Scanner;
public class GetUserName
{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        String f_name = "";
        String l_name = "";

        f_name = SafeInput.getNonZeroLenString(in, "Enter your first name");
        l_name = SafeInput.getNonZeroLenString(in, "Enter your last name");
        System.out.println("\nYour full name is " + f_name + " " + l_name);
    }
}