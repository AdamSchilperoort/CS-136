/*
* @author Adam Schilperoort
* @since 2018-05-02
*
* The HW11 program asks the user for a file name, then accesses it,
* and reads through it line by line, adding 2 columns and counting number of lines
* calculating and printing the average of each column
*/

import java.util.Scanner;
import java.io.*;

public class HW11 {

    /**
     * Main method is the only method in this program, as it can be short and simple
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

          float Column1 = 0;  //These initialize the three numbers necessary for the program
          float Column2 = 0;
          int LineCount = 0;


          //loops through the input file line by line
          while(reader.hasNextLine()){
              LineCount++;  //Counts every time a new line is read
              Column1 += reader.nextFloat(); //totals column 1 by adding each line
              Column2 += reader.nextFloat();  //totals column 2 by adding to each line
              }

              System.out.println("Column 1 average: " + Column1/LineCount);
              System.out.println("Column 2 average: " + Column2/LineCount);

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
