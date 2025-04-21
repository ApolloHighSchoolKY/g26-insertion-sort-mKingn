import java.util.ArrayList;

public class ALInsertionSort
{

    public static void main(String[] args)
    {
    	Integer myNumbers[] = {0, 15, 6, 8, 2, 37};
    	ArrayList<Integer> sorted = new ArrayList<Integer>();
    	boolean inserted=false;

		//Add the first number to the array list
	sorted.add(myNumbers[0]);
		//Loop once for all of the remaining numbers in the unsorted list
		for(int i=myNumbers.length-1; i>0; i-- ){
			int store=myNumbers[i];
			for(int k=i-1; k>0; k--){
				if(myNumbers[k]>myNumbers[k-1]){
					int tempNum = myNumbers[k];
					myNumbers[k]=myNumbers[k-1];
					myNumbers[k-1]=tempNum;
				}
			}
		}
		}
			//Check with each of the numbers in the sorted list

				//If this number is less than one in the sorted list,
				//insert it there

			//If it was not inserted, stick it on the end.


		//End Loop for unsorted list

		System.out.println(sorted);

		//Move the data back to the array

		//Print the contents of the array

    }


}
