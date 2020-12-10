//Adam Schilperoort
//CS 136
import java.util.Scanner;  //imports the scanner method
import java.util.Random;   //imports the random method

public class DrunkardsWalk {  //initializes the class

    public static void main(String[] args) { //initializes main method

        int[] Location = new int[2];     //Location is initialized as an int array of size 2

        System.out.print("Enter the starting x coordinate: "); //asks user to input x coordinate
        Scanner sc0 = new Scanner(System.in);
        Location [0] = sc0.nextInt();     //x coordinate is scanned into the first value of Location[]
        System.out.print("Enter the starting y coordinate: ");  //asks user to input y coordinate
        Scanner sc1 = new Scanner(System.in);
        Location [1] = sc1.nextInt();     //y coordinate is scanned into the second value of Location[]
        System.out.println("The starting coordinates are: (" +Location[0]+ "," +Location[1]+ ")");

            for (int j=0; j<100; j++){    //loops 100 iterations

                Random rand = new Random();
                int n = rand.nextInt(4);  //generates random number 0-3

                if(n==0){    //4 cases for 4 possible directions, only one direction per iteration
                    Location [0] --; //increments x by -1, moves left by 1
                }
                if(n==1){
                    Location [1] ++;  //increments y by 1, moves up by 1
                }
                if(n==2){
                    Location [0] ++;  //increments x by 1, moves right by 1
                }
                if(n==3){
                    Location [1] --;   //increments y by -1, moves down by 1
                }
            }


        System.out.println("The final coordinates are: (" +Location[0]+ "," +Location[1]+ ")");  //prints final coordinates

     }
 }
