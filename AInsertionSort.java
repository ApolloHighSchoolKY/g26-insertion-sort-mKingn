import java.util.Arrays;

public class AInsertionSort
{

    public static void main(String[] args)
    {
    	Integer myNumbers[] = {0, 15, 6, 8, 2, 37};
        System.out.println(Arrays.toString(myNumbers));
        for(int i=myNumbers.length-1; i>0; i--){
            if(myNumbers[i]<myNumbers[i-1]){
                int tempNum=myNumbers[i-1];
                myNumbers[i-1]=myNumbers[i];
                myNumbers[i]=tempNum;
                System.out.println(Arrays.toString(myNumbers));
            }
        }
        System.out.println(Arrays.toString(myNumbers));
    }
}
