import java.io.*;
import java.util.*;

public class ListFileMaker
{
    public static ArrayList<String> addItem(ArrayList<String> param) throws IOException
    {
        Scanner scanner = new Scanner(System.in);
        String read_item;
        do
        {
            System.out.print("\nEnter an item to add: ");

            read_item = scanner.nextLine();

            if(read_item.length() != 0)
            {
                param.add(read_item);
                System.out.println("Item added successfully.");
            }
            else 
                System.out.println("Item data is empty. Please re-enter!");
        }while(read_item.length() <= 0);
        scanner.close();
        return param;
    }
    public static ArrayList<String> delItem(ArrayList<String> param) throws IOException
    {
        Scanner scanner = new Scanner(System.in);
        int n;

        viewList(param);

        if(param.size() == 0)

            return param;
        do
        {
            System.out.print("\nEnter the index of the item to delete: ");

            n = scanner.nextInt();

            if(n >= 1)
            {
                param.remove(n-1);

                System.out.println("Item was deleted successfully.");
            }
            else 
                System.out.println("Invalid Index. Re-Enter the Value");

        }while(n <= 0);

        return param;
    }
    public static ArrayList<String> loadList(String name) throws IOException
    {
        ArrayList<String> all_lines = new ArrayList<String>();
        BufferedReader in = new BufferedReader(new FileReader(new File(name)));

        String s ="";
        while((s = in.readLine()) != null)

            all_lines.add(s);
        System.out.println("\nLoaded successfully");

        return all_lines;
    }
    public static void clearList(ArrayList<String> param)
    {
        param.clear();
        System.out.println("\nList cleared successfully");
    }
    public static void saveList(ArrayList<String> l, String name) throws IOException
    {
        PrintWriter out = new PrintWriter(new FileWriter(new File(name)));
        int i;

        for(i = 0; i < l.size(); ++i)
            out.println(l.get(i));
        System.out.println("\nList saved successfully");
    }
    public static void viewList(ArrayList<String> param)
    {
        int i;

        if(param.size() > 0)
        {
            System.out.println();
            for(i = 0; i < param.size(); ++i)

                System.out.println((i+1) + ") " + param.get(i));
        }
        else
            System.out.println("Empty List");

    }
    public static void main(String[] args) throws IOException
    {
        Scanner scanner = new Scanner(System.in);
        char char1, char2;
        boolean needsToBeSaved = false;
        ArrayList<String> list = new ArrayList<String>();
        String file_name = "";
        loop:
        do
        {
            System.out.println("\nMENU");
            System.out.println("A - Add to list");
            System.out.println("D - Delete an item from list");
            System.out.println("O - Open a file from disk");
            System.out.println("S - Save file to disk");
            System.out.println("C - Clear all items from list");
            System.out.println("V - View list");
            System.out.println("Q - Quit Program");
            System.out.print("\nEnter your choice: ");

            char1 = scanner.next().toUpperCase().charAt(0);
            switch(char1)
            {
                case 'A':
                    list = addItem(list);
                    needsToBeSaved = true;
                    break;
                case 'D':
                    list = delItem(list);
                    needsToBeSaved = true;
                    break;
                case 'O':
                    if(needsToBeSaved == true && (list.size() > 0 || file_name != "" ))
                    {
                        System.out.println("\nList not saved. Do you really wish to continue Y/N");
                        char2 = scanner.next().toUpperCase().charAt(0);
                        if(char2 == 'Y')
                        {
                            System.out.print("\nEnter list filename: ");
                            scanner.nextLine();
                            file_name = scanner.nextLine();
                            list = loadList(file_name);
                        }
                    }
                    else
                    {
                        System.out.print("\nEnter list filename: ");
                        scanner.nextLine();
                        file_name = scanner.nextLine();
                        list = loadList(file_name);
                    }
                    break;
                case 'S':
                    if(file_name == null)
                    {
                        System.out.print("\nEnter filename for saving the list: ");
                        file_name = scanner.nextLine();
                    }
                    saveList(list, file_name);
                    needsToBeSaved = false;  
                    break;
                case 'C':
                    clearList(list);
                    needsToBeSaved = false;
                    break;
                case 'V':
                    viewList(list);
                    break;
                case 'Q':
                    if(needsToBeSaved == true  && (list.size() > 0 || file_name != "" ))
                    {
                        System.out.println("\nList not saved. Do you wish to continue Y/N ");
                        char2 = scanner.next().toUpperCase().charAt(0);
                        if(char2 == 'Y')
                        {
                            break loop;
                        }
                    }
                    else
                        break loop;
                    break;
                default:
                    System.out.println("Invalid Input. Try Again");
            }
        }while(true);
        System.out.println("\nClosing the prgoram");
    }
}