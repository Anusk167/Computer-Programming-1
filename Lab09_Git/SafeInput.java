import java.util.Scanner;

public class SafeInput
{
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int retInt = 0;

        do {
            System.out.print("\n" + prompt + ": ");

            retInt = pipe.nextInt();
        } while (retInt <= low || retInt >= high);

        return retInt;
    }
}
