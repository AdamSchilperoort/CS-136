
/**
 * @author Adam Schilperoort
 */

import java.awt.Point;

      public class LabeledPoint extends Point{

            String SomeString;

            /**
             * Labeled Point constructor calls setLocation method from the poitn class and allocates global variable SomeString to the value of label
             * @param x     takes the first value passed into LabeledPoint as an int x to be used in setLocation
             * @param y     takes the second value passed into LabeledPoint as an int y and uses in setLocation
             * @param label the final value passed into LabeledPoint constructor is a String label, which gets allocated to global SomeString
             */
                public LabeledPoint(int x, int y, String label){
                      setLocation(x,y);
                      SomeString= label;

                }

              /**
              * toString method allocates x,y and label to outstring to return as a string
              * @return outString contains x, y, and the label, passing as return
              */
                public String toString(){

                      String outstring = super.toString()+ " " + SomeString; //invoke the toString method of the Point class


                    return outstring;
                }


      }
