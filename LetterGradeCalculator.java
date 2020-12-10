/**
 * @author Adam Schilperoort
 * CS 136 HW 2
 */

/*This program is dynamic.  I'm using two variables: ExamScores and AverageScore.
However, unlike the static HW where 3 and only 3 exams can be entered,
this program will accept any number of exams to average.
ExamScores changes in size depending on the number of exams, while
AverageScore adds up all the exams then averages them.
This way, this program saves all test scores AND dynamically changes,
making it more useful. */

import java.util.Scanner;

public class LetterGradeCalculator {

    public static void main(String[] args) {

        System.out.print("Enter the number of exams to be averaged: ");
        Scanner sc0 = new Scanner(System.in);           //scanner for the total number of exams
        float[] ExamScores = new float[sc0.nextInt()];   //creates an array the size of the number of exams
        float AverageScore=0;

            for (int i=0; i<ExamScores.length; i++){     //this for loop loads an array with all the exam scores

                    if(i==0){
                        System.out.print("Enter the 1st exam score: ");  //case statements for neatness
                    }
                    if(i==1){
                        System.out.print("Enter the 2nd exam score: ");
                    }
                    if(i==2){
                        System.out.print("Enter the 3rd exam score: ");
                    }
                    if(i>2){
                        System.out.print("Enter the " +(i+1));  //every "iteration after 3 uses the "Nth" tag
                        System.out.print("th exam score: ");
                    }

                Scanner sc1 = new Scanner(System.in);
                ExamScores [i] = sc1.nextFloat();      //Loads every exam score into the array
                AverageScore= AverageScore + ExamScores[i];   //Sums all the exam scores
            }


                AverageScore= (AverageScore / ExamScores.length);  //Divides all the summed exams by the numnber of exams, giving avg.

                System.out.println("Your average is: " +AverageScore);   //prints out the average

            if (AverageScore>= 90){       //this series of if statements gives you a grade based on the average
                System.out.println("Your grade is an A");
            }
            else if (AverageScore>= 80){
                System.out.println("Your grade is a B");
            }
            else if (AverageScore>= 70){
                System.out.println("Your grade is a C");
            }
            else if (AverageScore>= 60){
                System.out.println("Your grade is a D");
            }
            else{
                System.out.println("Your grade is an F");
            }
    }

}
