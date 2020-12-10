
import java.util.Scanner;  //imports the Scanner method

public class TimeCalculator {  //initializes the class

  public static void main(String[] args) {  //initializes the main method

    Scanner input = new Scanner(System.in);  //initializes the scanner

    System.out.println("input an amount seconds: ");  //first print function asks user for input

    int seconds = input.nextInt();    //allocates the user-input to a variable seconds
    int initialseconds= seconds;      //duplicates that variable for future use
    int numberOfSecondsInaMinute = 60;  //initializes the number of seconds in a minutes
    int numberOfSecondsInaHour = 3600;  //initializes the number of seconds in an hour
    int numberOfSecondsInaDay = 86400;  //initializes the number of seconds in a day
    int days = seconds / numberOfSecondsInaDay;  //divides seconds by the seconds in a day, giving number of days

      while(seconds >= numberOfSecondsInaDay){  //if seconds > seconds in a day, then seconds gets decremented
          seconds -= numberOfSecondsInaDay;  //after this loop, seconds will remove 'day' number of seconds
      }

    int hours = seconds / numberOfSecondsInaHour;

      while(seconds >= numberOfSecondsInaHour){  //if seconds > seconds in an hour, seconds is decremented
          seconds -= numberOfSecondsInaHour;  //after this loop, seconds will subtract 'hour' number of seconds
      }

    int minutes = seconds / numberOfSecondsInaMinute;

       while(seconds >= numberOfSecondsInaMinute){  //if seconds > seconds in a minute, seconds is decremented
           seconds -= numberOfSecondsInaMinute;  //after this loop, seconds will subtract 'minute' number of seconds
       }                                      //seconds left is leftover seconds

    System.out.println(initialseconds + " seconds is equal to " + days + " days " + hours +
           " hours " + minutes + " minutes " + seconds + " seconds");  //last print statement

  }
}
