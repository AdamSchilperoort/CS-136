/**
 * @author Adam Schilperoort
 */

import java.awt.Rectangle;    //imports the rectangle class

  public class BetterRectangle extends Rectangle{ //extends the Rectangle class


/**
 * BetterRectangle constructor calls setLocation method and setSize method
 * @param x      int x represents the left point of the rectangle
 * @param y      int y represents the top point of the rectangle
 * @param width  width is the width of the rectangle
 * @param height height is the height of the rectangle
 */
        public BetterRectangle(int x, int y, int width, int height){
                setLocation(x,y);
                setSize(width, height);
        }

/**
 * Calculates the perimeter using width and height from BetterRectangle
 * @return returns the perimeter
 */
        public double getPerimeter(){
            return (2*width+2*height);
        }

/**
 * Calculates the area using width and height from BetterRectangle
 * @return returns the area
 */
        public double getArea(){
            return (width*height);
        }
  }
