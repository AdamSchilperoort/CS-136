/**
* Lab06 Questions
* @author Adam Schilperoort, Keil Hubbard
* CS136L, Sect. 002
* 03.09.2018
*/
import java.util.Scanner;
import java.util.ArrayList;

public class QuestionsApp{

   public static void main(String[] args){

     ArrayList<Question> questionList = new ArrayList<>(0);
     int maxPoints = 0;
     int currentPoints = 0;

     NumericQuestion numericOne = new NumericQuestion();
     numericOne.setText("What is 870.0 / 40.0?");
     numericOne.setAnswer(21.75);
     questionList.add(numericOne);

     NumericQuestion numericTwo = new NumericQuestion();
     numericTwo.setText("What is 2.3 * 88.0?");
     numericTwo.setAnswer(202.40);
     questionList.add(numericTwo);

     Question fillInOne = new FillInQuestion();
     fillInOne.setText("\'Titanic\'(1997) stars _Leonardo Dicaprio_ as Jack.");
     questionList.add(fillInOne);

     Question fillInTwo = new FillInQuestion();
     fillInTwo.setText("_Billy Joel_ released his 11th Album, \"Storm Front\", in 1989.");
     questionList.add(fillInTwo);

     AnyCorrectChoiceQuestion anyCorrectOne = new AnyCorrectChoiceQuestion();
     anyCorrectOne.setText("One of the first 3 letters of the greek alphabet?");
     anyCorrectOne.setAnswer("Alpha Beta Gamma");
     questionList.add(anyCorrectOne);

     AnyCorrectChoiceQuestion anyCorrectTwo = new AnyCorrectChoiceQuestion();
     anyCorrectTwo.setText("A previous federal capitol of the United States?");
     anyCorrectTwo.setAnswer("Philadelphia Baltimore Lancaster York Princeton Annapolis Trenton New-York-City NYC");
     questionList.add(anyCorrectTwo);

     System.out.println("\n");

     /*
      * KEY loop, calls PresentQuestion, adding points to score according to the user's input
      */
      for(Question element : questionList){
        maxPoints += element.getValue();
        if(presentQuestion(element)){currentPoints += element.getValue();}

        System.out.println("Your Point Total: " + currentPoints + "/" + maxPoints+ "\n");
      }
  }

   /**
      Presents a question to the user and checks the response. Returns true if correct, false if incorrect
      @param q the question
   */
   public static boolean presentQuestion(Question q)
   {
      q.display();
      System.out.print("Your answer: ");
      Scanner in = new Scanner(System.in);
      String response = in.nextLine();
      if(q.checkAnswer(response)){
        System.out.println("Correct!");
      }
      else{
        System.out.println("Incorrect!");
      }
      return q.checkAnswer(response);
   }
}
