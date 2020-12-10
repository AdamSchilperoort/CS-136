/**
* Lab06 Questions
* @author Adam Schilperoot, Keil Hubbard
* CS136L, Sect. 002
* 03.09.2018
*
* Extend Question class to handle Questions w/ multiple correct answers.
* take all correct answers in a single String.
*/
public class AnyCorrectChoiceQuestion extends Question{

  private String text;
  private String[] answers;
  private final int pointValue = 3;

  /**
     Constructs a question with empty question and answer.
  */
  public AnyCorrectChoiceQuestion()
  {
     text = "";
  }

  /**
     Sets the question text.
     @param questionText the text of this question
  */
  public void setText(String questionText)
  {
     text = questionText;
  }

  /**
     Sets the answer for this question.
     @param correctResponse the answer
  */
  public void setAnswer(String correctResponse)
  {
     answers = correctResponse.split(" ");
  }

  /**
  * Return point value of Any Correct Question.
  */
  public int getValue(){
    return pointValue;
  }

  /**
     Checks a given response for correctness.
     @param response the response to check.
     @return true if the response is in the answer array, false otherwise.
  */
  public boolean checkAnswer(String response)
  {
     for(String answer : answers){

         String out="";

         for(int i=0; i<answer.length(); i++){
           if(answer.charAt(i) == '-'){
           out += " ";
           }
           else{
           out += answer.charAt(i);
           }
        }

       if(response.equalsIgnoreCase(out)){return true;}
     }
     return false;
  }

  public void display()
  {
     System.out.println(text);
  }

}
