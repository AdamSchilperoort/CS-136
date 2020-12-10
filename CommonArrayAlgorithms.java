/*
 * ADAM SCHILPEROORT
 * CS 136 HOMEWORK 04
 */
package commonarrayalgorithmsapp; //including for NETBEANS BECAUSE IT'S A NETBEANS PROJECT

/**
 *
 * @author adamschilperoort
 */
public class CommonArrayAlgorithms {

    //Methods
        public String arrayToString(int input[]){ //receives an array, returns a string
            String A = ("");        //initializes the string A
            for(int i=0; i<input.length; i++)       //for loop which will run from 0 to length of the input[]
            {
                if(input.length - i !=1){
                    A =(A + input[i]+ "|");  //adds elements to A, and a | as long as it's not the last element
                }
                else{
                    A =(A + input[i]);      //only adds element to A, no bar because last element
                }
            }
            return A;   //returns the string of elements in the array
        }


        public int arraySum(int input[]){ //method which receives an array of ints and returns the sum
            int sum=0;
            for(int i=0; i<input.length; i++){
                sum += input[i];        // sums all the elements in the array
            }
            return sum;     //returns the sum
        }

        public int arrayAvg(int input[]){  //receives an array of ints, returns the average
            int sum=0;
            int average;
            for(int i=0; i<input.length; i++){
                sum += input[i];    //sums all the elements in the array
            }
            average= sum/input.length;  //takes the average
            return average;
        }


        public int arrayMax(int input[]){ //returns the largest element of an input int array
            int max=0;
            for(int i=0; i<input.length; i++){
                if(input[i]>max){       //if an element in the array is greater than max,
                    max= input[i];       //set the new max to that element
                }
            }
            return max;
        }


        public int arraySearch(int input[], int num){ //receives two inputs, array of ints & int
            for(int i=0; i<input.length; i++){
                if(input[i]==num){  //runs through the array and searches for element
                    return i;  //returns the index of where that number is in the array
                }
            }
            return -1;  //returns -1 if the number isn't in the array
        }


        public boolean arraySwap(int input[], int index, int index2){ //swaps elements in an array
            int temp;
            if(index>=0 && index2>=0 && index<input.length && index2<input.length){ //conditionals defining if it's possible to swap
                temp = input[index];            //holds temporary value to set the first [index] to
                input[index]= input[index2];    //sets the element at first index to the element at sexond
                input[index2]= temp;            //sets element at second index to the temp (which is the value of first index)
                return true;
            }
            else
            return false;   //returns false if these conditions don't apply, the fuction won't run
        }


        public int[] arrayGrowDouble(int input[]){
            int[] DoubleArray = new int[2*input.length]; //creates array double in size of input[]
            for(int i=0; i<(DoubleArray.length); i++){  //loop incrementing from 0 to size of doublearray
                if(i<input.length){
                    DoubleArray [i]= input[i];  //loads the input array into the double-sized array
                }
                else{
                    DoubleArray[i]=0;       //fills the rest of the array with zeroes
                }
            }
            return DoubleArray;     //returns the larger array
        }

}
