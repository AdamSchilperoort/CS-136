/**
* Lab06 Questions
* @author Adam Schilperoot, Keil Hubbard
* CS136L, Sect. 002
* 03.09.2018
*
* Extend Question class to handle Numeric questions & answers.
* (Most similar to Question superclass vs FillIn & AnyCorrect)
* If answer differs by no more than 0.01, accept as correct.
*/

import java.lang.*;

public class NumericQuestion extends Question{

  private double answer;
  private final int pointValue = 1;
  /**
     Constructs a question with empty question and answer.
  */
  public NumericQuestion()
  {
     answer = 0.0;
  }

  /**
     Sets the answer for this question.
     @param correctResponse the answer
  */
  public void setAnswer(double correctResponse)
  {
     answer = correctResponse;
  }

  /**
  * Return point value of Numeric Question.
  */
  public int getValue(){
    return pointValue;
  }

  /**
     Checks a given response for correctness.
     @param response the response to check
     @return true if the response was correct, false otherwise
  */
  public boolean checkAnswer(String response)
  {
    // Convert String response to Double, allows presentQuestion
    // in QuestionsApp to remain unchanged.
    double parseResponse = Double.parseDouble(response);

     if (answer==parseResponse){
       return true;
     }
     double subtracted = answer-parseResponse;
     if(subtracted < 0){
       subtracted = subtracted * -1;
     }

     if (subtracted <= 0.01000001){  // <= 0.01 was outputting incorrectly due to memory errors, so 0.01000001 fixes it
       return true;
     }
     return false;

   }
 }
