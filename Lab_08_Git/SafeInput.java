import java.util.Scanner;
import java.util.regex.Pattern;

public class SafeInput
{

    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        {
            String retString = "";  // Set this to zero length. Loop runs until it isn’t
            do
            {
                System.out.print("\n" +prompt + ": "); // show prompt add space
                retString = pipe.nextLine();
            }

            while(retString.length() == 0);

            return retString;

        }
    }

    public static int getInt(Scanner pipe, String prompt)
    {
        int retInt = 0;
        boolean valueFound = false;
        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextInt())
            {
                retInt = pipe.nextInt();
                valueFound = true;
            }
            else
            {
                pipe.nextLine();
            }
        } while (!valueFound);

        return retInt;
    }

    public static double getDouble(Scanner pipe, String prompt)
        {

            double retDouble = 0;
            boolean valueFound = false;
            do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextDouble())
            {
                retDouble = pipe.nextDouble();
                valueFound = true;
            }
            else
            {
                pipe.nextLine();
            }
        } while (!valueFound);

            return retDouble;
        }


    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int retInt = 0;

        do {
            System.out.print("\n" + prompt + ": ");

            retInt = pipe.nextInt();
        } while (retInt <= low || retInt >= high);

        return retInt;
    }

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        double retDouble = 0;

        do {
            System.out.print("\n" + prompt + ": ");

            retDouble = pipe.nextDouble();
        } while (retDouble <= low || retDouble >= high);

        return retDouble;
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        String retBoolean = "";

        do {
            System.out.print("\n" + prompt + ": ");

            retBoolean = pipe.next();
        } while (retBoolean.length() == 0);

        if (retBoolean.equalsIgnoreCase("y"))
            return true;
        else if (retBoolean.equalsIgnoreCase("n"))
            return false;

        return false;
    }

    public static String getRegExString(Scanner pipe, String prompt,String regEx) {
        String input;
        System.out.println(prompt + "String that Matches " + regEx + ":");
        if (pipe.hasNext()) {
            input = pipe.next();
            pipe.reset();
            if (Pattern.matches(regEx, input)) {
                return input;
            }
            return null;
        }
        pipe.reset();
        return null;
    }
    }
