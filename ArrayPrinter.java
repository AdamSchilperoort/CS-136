/*
* @author Adam Schilperoort
*/
import java.util.Random;

public class ArrayPrinter {

	public static void main(String[] args) {

		//initializes an array with ten random integers (between 2 and 20 inclusive)
		//then prints six lines of output, containing

		//creates an array of size 10 and loads randome numbers 2-20 inclusive in
		int array[] = new int[10]; //initializes the int array
		for(int i=0; i<10; i++){		//loop to run through the whole array, loading in random #s 2-20
			Random rand = new Random();  //initializes randomization
			array[i]= rand.nextInt(19)+2;  //2 is minimum, 20 is our max, generating 2-20 inclusive
		}

		//prints all array contents in order
		System.out.print("\nThe whole array: ");
		for(int i=0; i<10; i++){					//loops through the whole array
			System.out.print(+ array[i]+ " ");		//printing all elements of array in the loop
		}

		//prints array elements at even indexes
		System.out.print("\nElements at even indexes: ");
		for(int i=0; i<10; i += 2){			//loop increments by 2 each time rather than 1 to get even #s
			System.out.print(+array[i]+ " ");
		}

		//print all even elements in the array
		System.out.print("\nEven elements: ");
		for(int i=0; i<10; i++){	//loops through the whole array
			if(array[i]%2 ==0){		//checks if the element is even
				System.out.print(+array[i]+ " ");	//prints the array element if it's even
			}
		}

		//prints all elements in reverse order
		System.out.print("\nThe whole array in reverse order: ");
		for(int i=9; i> -1; i--){				//loop decrements from 9 to 0, reversing the array elements
			System.out.print(+array[i]+ " ");
		}

		//print the first element in the ArrayPrinter
		System.out.print("\nThe first element: " +array[0]);

		//print the last element of the array
		System.out.println("\nThe last element: " +array[9]+ "\n");

  }

  }
