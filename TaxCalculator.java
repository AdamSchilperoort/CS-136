
//imports the method scanner into the class
import java.util.Scanner;

//taxCalcualto class
public class TaxCalculator {

	//main method
	public static void main(String[] args) {

	//creates the scanner method
	Scanner input = new Scanner(System.in);

	//a print statement followed by a prompt for the user for an input 
	System.out.println("Are you single or married please specify: ");
	String status = input.next();

	//a print statement followed by a prompt for the user for an input 
	System.out.println("How much bacon did you bring this year?" + 
		   			   "cause you owe uncle sam: ");
	double income = input.nextDouble();
	
	//variables initialized 
	double tax = 0;
	String single = "single";
	String married = "married";

	//comparrison statment to make sure user used the correct characters
	if (status.compareTo(single) == 0) {
	
		//if user sets income less than or equal to 8000 tax variable updates
		if (income <= 8000) {
			tax = income * .10; 
		}

	//if user sets income greater than 8000 and less than or 
	//equal to 32000 tax variable updates
	else if (income > 8000 && income <= 32000) {
		 tax = income * .15 + 800;
	}

	//if user sets income greater than 32000 tax variable updates
	else if (income > 32000) {
		 tax = income * .25 + 4400;
	}
	}

	//comparrison statment to make sure user used the correct characters
	if (status.compareTo(married) == 0) {

		//if user sets income less than or equal to 16000 tax variable updates
		if (income <= 16000) {
			tax = income * .10; 
	}
	//if user sets income greater than 16000 tax variable updates
	//equal to 64000 tax variable updates
	else if (income > 16000 && income <= 64000) {
		tax = income * .15 + 1600;
	}
	//if user sets income greater than 64000 tax variable updates
	else if (income > 64000) {
		tax = income * .25 + 8800;

			}
		}
	//a print statement that prints out a statement and how much tax owed
	System.out.println("You owe Trump this much cheddar " + tax);

	}
}
