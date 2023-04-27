import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Lab_12_File_Away
{

    public static void main(String args[])
    {
        final JFileChooser f_chooser = new JFileChooser();
        int result = f_chooser.showOpenDialog(null);
        File selectedFile = f_chooser.getSelectedFile();
        int number_of_lines = 0;
        int number_of_words = 0;
        int number_of_characters = 0;
        String current_line = "";
        try {
            Scanner load_all_text = new Scanner(selectedFile);
            while(load_all_text.hasNextLine())
            {
                current_line = load_all_text.nextLine();
                String words_in_line[]= current_line.split(" ");
                number_of_characters =number_of_characters + current_line.length();
                number_of_words = number_of_words + words_in_line.length;
                number_of_lines = number_of_lines + 1;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.printf("File Opened: %s \n Total number of characters: %d \n Total number of words: %d \n Total number of lines: %d \n",selectedFile.getName(),number_of_characters ,number_of_words ,number_of_lines );

    }

}