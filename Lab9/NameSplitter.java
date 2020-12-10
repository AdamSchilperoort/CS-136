import java.util.Scanner;
import java.io.*;

/**
 * @author Adam Schilperoort Courtney Richmond
 * @since 4/20/18
 * This program reads in a file babynames.txt and generates two files, boys.txt and girls.txt,
 * separating the data from the given file into two separate files for boys and girls.
 */
public class NameSplitter{

    /**
     * Main method contains all functional code for the program, taking the input file
     * babynames.txt, creating two new files, one for boys, one for girls, and splitting
     * the data from the source file into the two files.
     * @param  args default main method arguments
     * @throws IOException Exception to throw when file isn't found
     */
    public static void main(String[] args) throws IOException{
        try{
            File input = new File("babynames.txt");
            File boysNames = new File("boysnames.txt");
            File girlsNames = new File("girlsnames.txt");

            Scanner reader = new Scanner(input);

            PrintWriter boy = new PrintWriter(boysNames);
            PrintWriter girl = new PrintWriter(girlsNames);

            while(reader.hasNext()){  //loops through the whole file line by line
                int line = reader.nextInt(); //Moves the curser past the line number in the file
                //boyline and girlline strings strategically read in the 3 elements, moving curser 3 times for those
                String boyLine = reader.next() + " " + reader.next() + " " + reader.next(); //segregated boy elements
                String girlLine = reader.next() + " " + reader.next() + " " + reader.next(); //segregated girl elements
                boy.println(boyLine); //prints the boyLine string into the boy file
                girl.println(girlLine); //prints the girlLine string into girl file
            }
            reader.close(); //closes the reaser
            boy.close();  //closes the printwriter so the file can save
            girl.close(); //closes the girl printwriter to save the file

        }
        catch(FileNotFoundException ex){  //Catch statement to show user a file was not found
            System.out.println("File was not found!");
        }

    }
}
