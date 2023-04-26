public class GettingLoopy {
    public static void main(String[] args) {
        for (int i = 0; i <= 30; i++)
        {
            System.out.println(i);
        }
        for (int i = 0; i <= 30; i++)
        {
            System.out.println(30-i);
        }
        for (int i = 3; i <= 18; i = i+3)
        {
            System.out.println(i);
        }
        for (int i = 10; i >= 0; i = i-2)
        {
            System.out.println(i);
        }
        for (int i = 0; i <= 4; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print("*");

            }
            System.out.println("");
        }
        for (int i = 0; i <= 4; i++)
        {
            for (int j = 4; j >= i; j--)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = 0; i <= 4; i++)
        {
            System.out.println("*****");
        }
    }
}