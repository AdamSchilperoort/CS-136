/*
* @author Adam Schilperoort
* @since 2018-04-13
*
* The FileElementsCounter program asks the user for a file name, then accesses it,
* and reads through it line by line, counting number of lines, words, and characters
*/

import java.util.Scanner;
import java.io.*;

public class FileElementsCounter {

    /**
     * Main method is the only method in this program, as it can be accomplished
     * in fairly few lines of code. I felt methods were unecessary
     * @param args standard main method argumentation
     */
    public static void main(String[] args){

      /*
       *This first code block prompts the user for an input and loads it into a String
       */
      System.out.print("Please enter the name of a file: ");
      Scanner scan = new Scanner(System.in);
      String fileName = scan.nextLine();

      File inputFile = null;
      Scanner reader = null;

      try{ //If the file isn't found, an exception will be thrown by try/catch block

          //initializes the File and Scanner using the fileName String of the user input
          inputFile = new File(fileName);
          reader = new Scanner(inputFile);

          int LineCount = 0;  //These three ints initialize the counts
          int WordCount = 0;
          int CharacterCount = 0;


          //loops through the input file line by line until there isn't another line
          while(reader.hasNextLine()){
              LineCount++;  //Counts every time a new line is read
              String line = reader.nextLine();  //Takes the whole line into a String
              if(line.equals("")){ //doesn't count strings that are empty
              }
              else{
                  CharacterCount += line.length(); //increments Characters by the line length
                  String[] SplitLine = line.split(" "); //splits line into an [] by spaces
                  for(int i=0; i<SplitLine.length; i++){  //loops through [], counting words
                      WordCount++;
                  }
              }
          }

          //StringTokenizer tokens = new StringTokenizer(line);
          //wordsCount += tokens.countTokens();
          //wordsCount += (new StringTokenizer(line)).countTokens();

          //Finalizes the program by printing the outputs, Line, Word, and Character count
          System.out.println("Number of lines: " + LineCount);
          System.out.println("Number of words: " + WordCount);
          System.out.println("Number of characters: " + CharacterCount);

      }
      catch(FileNotFoundException ex){  //throws the exception
        System.out.println("File was not found!");
      }
      finally{
          if(reader != null){
            reader.close(); //Closes the scanner
          }
      }

    }

}
