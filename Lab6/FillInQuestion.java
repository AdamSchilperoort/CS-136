/**
* Lab06 Questions
* @author Adam Schilperoot, Keil Hubbard
* CS136L, Sect. 002
* 03.09.2018
*
* Extend Question class to handle FillIn questions.
* (Take only ONE input string, no use of setAnswer() method)
*/
public class FillInQuestion extends Question{

  private String text;
  private String answer;
  private String outString = "";
  private final int pointValue = 2;
  /**
     Constructs a question with empty question and answer.
  */
  public FillInQuestion()
  {
     answer = "";
     text = "";
  }
  /**
     Sets the question text.
     @param questionText the text of this question
  */
  public void setText(String questionText)
  {
     text = questionText;
     this.parseAnswer(text);
  }
  /**
  * Iterate through the given text, determine blank question & answer.
  * @param textIn original un-modified question text.
  */
  private void parseAnswer(String textIn){
    boolean isAnswer = false;
    String answerParsed = "";
    for(int i=0; i<textIn.length(); i++){
      if((textIn.charAt(i) == '_') && !isAnswer){
        isAnswer = true;
        outString += "_______";
      } else if((textIn.charAt(i) == '_') && isAnswer){
        isAnswer = false;
      }
      if(!isAnswer){
        outString += String.valueOf(textIn.charAt(i));
      }
      if(isAnswer){
        answerParsed += String.valueOf(textIn.charAt(i));
      }
    }
    answer = answerParsed.substring(1);
  }
  /**
  * Return point value of Fill-In Question.
  */
  public int getValue(){
    return pointValue;
  }
  /**
     Checks a given response for correctness.
     @param response the response to check
     @return true if the response was correct, false otherwise
  */
  public boolean checkAnswer(String response){
    return response.equalsIgnoreCase(answer);
  }
  /**
     Displays this question.
  */
  public void display(){
    System.out.println(outString);
  }
}
