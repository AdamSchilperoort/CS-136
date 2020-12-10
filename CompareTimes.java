
/**
 * @author Adam Schilperoort
 * @since 4/18/2018
 */

import java.util.*;
import java.text.NumberFormat; //Formatting library

/**
 * This program measures the time it takes to create and initialize an object with
 * one million Integer values, for Array, ArrayList, and a LinkedList
 */
public class CompareTimes{

  /**
   * Main method calls the methods Array, ArrayList, and LinkedList, which each
   * calculate their respective execution time and return that time in type long.
   * They also combine with a formatting method for better print statements
   * @param args Typical main method arguments
   */
  public static void main(String[] args){
    NumberFormat F = NumberFormat.getInstance(Locale.US); //formatting call
    System.out.println("Array: " +F.format(measureArrayTime()));
    System.out.println("ArrayList: " +F.format(measureArrayListTime()));
    System.out.println("LinkedList: " +F.format(measureLinkedListTime()));
  }

  /**
   * This method measures the time execution for creating and initializing objects
   * of an Integer Array of length 1000000
   * @return returns the time (type long), which is calculated by endTime-startTime
   */
  public static long measureArrayTime(){
    long startTime=System.nanoTime();
    Integer[] arr = new Integer[1000000];

    for(int index=0; index<1000000; index++){
      arr[index]=index;
    }
    long endTime = System.nanoTime();

    return endTime-startTime;
  }

  /**
   * This method measures the time execution, creation and initialization
   * for an Integer ArrayList of length 1000000
   * @return returns the time (type long), which is calculated by endTime-startTime
   */
  public static long measureArrayListTime(){
    long startTime=System.nanoTime();
    ArrayList<Integer> arraylist = new ArrayList<Integer>();

    for(int index=0; index<1000000; index++){
      arraylist.add(index);
    }
    long endTime = System.nanoTime();

    return endTime-startTime;
  }

  /**
   * Measures time execution for creation and initialization of
   * an Integer LinkedList of length 1000000
   * @return returns the time (type long), endTime-startTime
   */
  public static long measureLinkedListTime(){
    long startTime=System.nanoTime();
    LinkedList<Integer> linkedList = new LinkedList<Integer>();

    for(int index=0; index<1000000; index++){
      linkedList.add(index);
    }
    long endTime = System.nanoTime();

    return endTime-startTime;
  }
}
