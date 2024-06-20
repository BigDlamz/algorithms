package za.co.philani.arrays;

import java.util.List;


public class ArrayElementsSum {

    /**
     * Return the sum of all the elements in the array
     * @param ar - list of long integers
     * @return - the sum of all the elements in the array as a long
     */

    public long aVeryBigSum(List<Long> ar) {
      long sum = 0;
        //iterate through list elements in ar o(n)
        for(long element: ar){
            //add each element to total o(1)
            sum = sum + element;
    }
        return sum;
    }
}
