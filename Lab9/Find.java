import java.util.Scanner;
import java.io.*;

/**
 * @author Adam Schilperoort Courtney Richmond
 * @since 4/20/18
 * This program searches all files specified on the command line and prints out
 * all lines containing a specified word. EX: java Find word file1.txt file2.txt
 */
public class Find{

    /**
     * Main method takes a word and input files from the command line as
     * elements in args[] then calls the findAndPrint method for each file inputted,
     * passing the word and file name into the method
     * @param args from the command line, takes a word then .txt files into args[]
     */
    public static void main(String[] args){
        if(args.length > 0){
            System.out.println();
            String word = args[0]; //Sets the first input to args as the word to search for
            for(int i = 1; i < args.length; i++){ //Loops through the text files
                findAndPrint(word, args[i]);  //Passes word and text file to findAndPrint method
                System.out.println();
            }
        }
        else{
            System.out.println("Needs a word and text files to search!");
        }
    }

    /**
     * findAndPrint method takes a word and filename, searches for that word in the file,
     * and prints the entire lines where the word is found. (case sensitive version)
     * @param word String word is the word input from the command line, passed to findAndPrint
     * @param fileName name of the file passed to the method to search through for the word
     */
    public static void findAndPrint(String word, String fileName){
        try{
            File input = new File(fileName);
            Scanner scanner = new Scanner(input);
            while(scanner.hasNext()){       //Scans through each line of the file
                String thisLine = scanner.nextLine();   //Turns each line into a string
                if(thisLine.contains(word)){ //Checks to see if line contains word
                    System.out.println(fileName + ": " + thisLine); //prints the file name and the whole line
                }
            }
            scanner.close(); //closes the file
        }
        catch(FileNotFoundException ex){  //Catch statement to indicate file wasn't found
            System.out.println("File not found");
        }
     }

}
