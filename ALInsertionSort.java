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
		for(int i=1; i<myNumbers.length; i++){
			System.out.println(sorted);
			if(myNumbers[i-1] > myNumbers[i]){
				sorted.add(i-1,myNumbers[i]);
				inserted=true;
			}
			if( !inserted){
				sorted.add(myNumbers[i]);
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
