/**
 * @author Adam Schilperoort
 */

    public class LabeledPointTester{


/**
 * tester for LabeledPoint, creates 3 different Objects for LabeledPoint, and calls the toString method to test functionality
 * @param args standard main method arguments
 */
          public static void main(String[] args){


            // creates objects and call arg-constructor of class LabeledPoint for testing
              LabeledPoint test1 =new LabeledPoint(12,23,"Hello");
              System.out.println(test1.toString());
              LabeledPoint test2 =new LabeledPoint(18,30,"Bye");
              System.out.println(test2.toString());
              LabeledPoint test3 =new LabeledPoint(25,40,"Supercalifragilisticexperthalitosis");
              System.out.println(test3.toString());


          }


    }
