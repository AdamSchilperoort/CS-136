import java.util.Scanner;                  //Imports scanner
import java.util.Random;                   //Imports random

class Nim{                                 //Initializes class Nim

public static void main(String[] args){    //Initializes main method
Random rand=new Random();
int n = rand.nextInt(90)+11;							 //this line generates a random number of marbles without exceeding 100.
int k = rand.nextInt(2);  							   //this line generates 0 or 1, 1 the user goes first, 0 the computer goes first.
int a = rand.nextInt(2); 								   //generates randomly 0 or 1. 0 is smart computer, 1 is dumb computer
int ComputerTakes=0;									     //initializes the amount ComputerTakes with the value zero.
int userTakes=0;									         //initializes the userTakes with the value zero.

System.out.println("");
System.out.println("Current number of marbles in the pile: " +n);//printing out to the user the current number of marbles.

if(a==0){										               //this if statement checks if a==0 if true smart computer will start playing.
 System.out.println("Playing with smart computer");					     //printing to the screen saying that the smart computer is playing.
}
else{											                 //if the number 1 is generated for a dumb computer will start playing.
System.out.println("Playing with dumb computer");			       		 //printing to the screen saying that the dumb computer is playing.
}

if(k==1){ 										             //IF USER GOES FIRST, THIS IF STATEMENT WILL EXECUTE.
        System.out.println("You go first!");						//printing to the screen saying that the user goes first.
        Scanner x = new Scanner(System.in);						  //getting the user input statement.
        System.out.println("How many marbles do you want to remove? ");		//print to the screen statement, prompting user.
        userTakes=x.nextInt();							           //storing the user input to userTakes.
        System.out.println("");							           //print statement for formatting purposes

              while((userTakes <= 0) || (userTakes > n/2)){			//while loop will execute when user takes
                                                        //is less than or equal to 0 or the userTakes is larger that n/2.
                  System.out.println("Invalid, must choose more than 0 or less than half."); 	//print to the screen statement saying that it’s invalid input
                  System.out.println("How many marbles do you want to remove? ");		//print to the screen statement
                  userTakes=x.nextInt();						    //storing the user input in userTakes.
                  System.out.println("");               //Formatting
              }

        n = n - userTakes;
        System.out.println("Current number of marbles in the pile: " +n);		//printing out to the user the current number of marbles.
}
else if(k==0){									 //if k==0 the computer goes first.
        System.out.println("Computer goes first!");
}
        //END OF THE ONE-TIME EXECUTED BLOCKS STATING WHO GOES FIRST

        //NOW EXECUTE THE BIG WHILE LOOP WHICH CONTAINS THE MEAT OF THE PROGRAM

while(n!=0){										//this while loop will start the game as long as n doesn’t equal zero.

        if(a==0){  						  //begin smart computer code block. when the number of marbles in the stack isn't n^2-1, it takes an amount to make it n^2-1
                                //if marbles is n^2-1 computer will take a random number
            if(n==1){
              ComputerTakes=1;
            }
            if(n==2){
              ComputerTakes=1;
            }
            if(n==3){
              ComputerTakes = rand.nextInt(n/2)+1;	//generates a random number between 1 and n/2, and sets ComputerTakes to this value
            }
            if(n>3 && n<7){
              ComputerTakes=(n-3);
            }
            if(n==7){
              ComputerTakes = rand.nextInt(n/2)+1;
            }
            if(n>7 && n<15){
              ComputerTakes=(n-7);
            }
            if(n==15){
              ComputerTakes = rand.nextInt(n/2)+1;
            }
            if(n>15 && n<31){
              ComputerTakes=(n-15);
            }
            if(n==31){
              ComputerTakes = rand.nextInt(n/2)+1;
            }
            if(n>31 && n<63){
              ComputerTakes=(n-31);
            }
            if(n==63){
              ComputerTakes = rand.nextInt(n/2)+1;
            }
            if(n>63){
              ComputerTakes=(n-63);
            }


            System.out.println("Computer Takes " +ComputerTakes+ " marbles!");			//printing out to the user the current number of marbles after the computer take some.

            n= n-ComputerTakes;								     	//subtracting the current number of marbles with the computer’s choice.
            if(n==0){									            	//when n==0 the block will execute.
              System.out.println("You win!");				//printing statement saying that the user won.
              System.out.println("");
              System.exit(0);									      //this statement will exit the block.
            }

            System.out.println("Current number of marbles in the pile: " +n);			//printing out to the user the current number of marbles.

      }                           //ENDS SMART COMPUTER BLOCK
      else{ 									   	//dumb computer	block.

            if(n==1){										     //checks if n==1 (number of marbles in the stack), then if true the next block will execute.
                System.out.println("You win!");				//printing statement saying that the user won.
                System.out.println("");
                System.exit(0);							 //this statement will exit the program
            }

            ComputerTakes = rand.nextInt(n/2)+1;		  //this will generate a random number between 1 and n/2 and storing it in ComputerTakes.
            System.out.println("Computer Takes " +ComputerTakes+ " marbles!");	//printing out statement telling the user how marbles the computer took.
            n= n-ComputerTakes;							 //updating n with the new value after the computer takes from it.
     	      System.out.println("Current number of marbles in the pile: " +n);		//printing out to the user the current number of marbles.
      }         									          //end dumb computer.
                                  //END COMPUTER BLOCKS

                                  //Human block
      if(n==1){										//If the size of the pile is 1 before your turn, you lose
          System.out.println("You lose! Computer wins!");					//printing statement saying that the computer won.
          System.out.println("");
          System.exit(0);								   	//this statement will exit the block.
      }

      Scanner x = new Scanner(System.in);		//taking user input statement.
      System.out.println("How many marbles do you want to remove? ");			//printing to the screen how many marbles do you want to take.
      userTakes=x.nextInt();								//storing the user input in a variable called userTakes.
      System.out.println("");								//printing a new line for formatting.

      while((userTakes<=0) || (userTakes > n/2)){		//a while loop that will run when the userTakes is less than or equal to 0, or userTakes is larger than n/2.
          System.out.println("Invalid, must choose more than 0 or less than half.");	//printing to the screen saying that invalid number choose more than zero or less than half.
          System.out.println("How many marbles do you want to remove? ");		//printing to the screen asking again how many marbles do want to remove.
          userTakes=x.nextInt();						//storing user input in a variable called userTakes
          System.out.println("");           //formatting
      }

  n = n - userTakes;							         	//updating n with a new value after the user took some.

  System.out.println("Current number of marbles in the pile: " +n);			//printing out to the user the current number of marbles.


}                     //closes giant while loop

}   									//close main
}											//close class
