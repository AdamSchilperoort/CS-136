/*
* @author Adam Schilperoort
*/
import java.util.Random;
import java.util.ArrayList;

public class RunsPrinter {

    public static void main(String[] args) {

        ArrayList<Integer> rolls = new ArrayList<Integer>(); //initializes the arraylist
        boolean inRun= false; //initializes inRun, boolean

        System.out.print("\n[");  //prints a bracket before printing all elements of the arraylist

        for(int i=0; i<20; i++){  //runs 20 times, adding a new random into the next arraylist element
            Random rand = new Random(); //initializes the random method
            rolls.add(rand.nextInt(6)+1);//generates random number 1 to 6, for a roll, adds to rolls
            if(i!=19){
              System.out.print(rolls.get(i)+ ",");  //prints element and comma for all but last element
            }
            else{
              System.out.print(rolls.get(i));   //prints the last element of the arraylist
            }
        }

        System.out.println("]");    //prints closing bracket, end printing of initialization of arraylist


        //After the above initialization, this block prints the numbers in 'runs' with "(" and ")"
        for (int i=0; i<20; i++){ //this loops from the beginning of the arraylist to the second to last element, 0-18
            if(inRun){    //if in a run, ths block executes, printing ")" if the run is over and setting inRun to false
                if(rolls.get(i)!=rolls.get(i-1)){ //if the element is different from the last element, end run ")",
                  System.out.print(")");
                  inRun= false;       //because elements are different, not in a run anymore, set inRun to false
                }
            }
            if(!inRun){  //if not in a run, this block executes, setting inRun to true and printing "(" if run begins
                if(i!=19){   //because the last element cannot start a run, this executes only on elements 0-18
                    if(rolls.get(i)==rolls.get(i+1)){   //this chcks element and the next element to see if it's a run
                      System.out.print("(");    //if the above is true, inRun set to true, and print "(" to start the run
                      inRun= true;
                    }
                }
            }
            System.out.print(rolls.get(i)); //prints the current element in the arraylist
            if(inRun && i==19){     //on last element of array, if still in a run, finish by printing ")"
              System.out.print(")");
            }
        }

    System.out.println("\n");   //executes at the very end for formatting and ease of seeing outputs from terminal


    }
}
