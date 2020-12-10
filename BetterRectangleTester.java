
/**
 * @author Adam Schilperoort
 */
  public class BetterRectangleTester{

            /**
             * Main method, creates 3 BetterRectangles, then prints, calling getPerimeter and getArea methods
             * @param args main method containing String[] and args
             */
            public static void main(String[] args){

              /**
               * Creates three BetterRectangle objects a,b,c with 4 values in each
               */
              BetterRectangle a = new BetterRectangle(2,3,1,1);
              BetterRectangle b = new BetterRectangle(15,0,2,3);
              BetterRectangle c = new BetterRectangle(1,2,4,4);

              /**
               * Series of print statements which call getPerimeter and getArea
               * for all three BetterRectangle objects
               */

              System.out.println("Rectangle A's perimeter is: " +a.getPerimeter());
              System.out.println("Rectangle A's area is: " +a.getArea());
              System.out.println("Expected Perimeter: 4.0   \nExpected Area: 1.0");
              System.out.println("Rectangle B's perimeter is: " +b.getPerimeter());
              System.out.println("Rectangle B's area is: " +b.getArea());
              System.out.println("Expected Perimeter: 10.0  \nExpected Area: 6.0");
              System.out.println("Rectangle C's perimeter is: " +c.getPerimeter());
              System.out.println("Rectangle C's area is: " +c.getArea());
              System.out.println("Expected Perimeter: 16.0   \nExpected Area: 16.0");

            }
  }
