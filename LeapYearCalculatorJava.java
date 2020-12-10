
/**
 * @author Adam Schilperoort
 * Homework 2, CS 136
 */

import java.util.Scanner;

public class LeapYearCalculatorJava {

    public static void main(String[] args) {

        System.out.print("Enter the year you want to check: ");
        Scanner sc = new Scanner(System.in);
        int Year = sc.nextInt();
        boolean LeapYear= false;

        //int year = (new Scanner(System.in)).nextInt();


        if (Year <= 1582){
            System.out.println("The Gregorian correction doesn't apply. Cannot compute.");
            System.exit(0);
        }


        if (Year%400 == 0){  //simple logic tiers to determine which years are leap years
            LeapYear= true;
        }
        else if (Year%100 ==0){
            LeapYear= false;
        }
        else if (Year%4 ==0){
            LeapYear= true;
        }


        if(LeapYear ==true){
            System.out.print(+Year);
            System.out.println(" is a leap year!");
        }
        else{
            System.out.print(+Year);
            System.out.println(" isn't a leap year.");
        }

    }
}
