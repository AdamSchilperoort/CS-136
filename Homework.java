
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

    public class Homework{

          public static void main(String[] args){

            /*

            LinkedList<String> hello = new LinkedList<String> (); //Step 1
            hello.addFirst("Harry"); //Step 2
            hello.addLast("Diana"); //Step 3
            hello.addFirst("Tom"); //Step 4
            System.out.println(hello.removeLast()); //Step 5
            System.out.println(hello.removeFirst()); //Step 6
            System.out.println(hello.removeLast()); //Step 7

            System.out.println('\n');

            */

            LinkedList<String> staff = new LinkedList<String> (); //Step 1
            ListIterator<String> iterator = staff.listIterator(); //Step 2
            iterator.add("Tom"); //Step 3
            iterator.add("Diana"); //Step 4
            iterator.add("Harry"); //Step 5
            System.out.println(staff);
            iterator = staff.listIterator(); //Step 6
            if (iterator.next().equals("Tom"))
            {iterator.remove();} //Step 7
            while (iterator.hasNext())
            { System.out.println(iterator.next()); } //Step 8

          }


    }
