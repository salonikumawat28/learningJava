package assignments;

import java.util.Arrays;

/**
* Given an array of integers nums.
*
* A pair (i,j) is called good if nums[i] == nums[j] and i < j.
*
* Return the number of good pairs.
* 
*Constraints:
*
* 1 <= nums.length <= 100
* 1 <= nums[i] <= 100
*/

public class GoodPair {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,1,1,3};
        System.out.println("Num array is ..." +Arrays.toString(nums));

        int result = goodPairCount(nums);
        System.out.println("Good Pair Count is ..." + result);
    }

    /**
     * Time Complexity = O(n^2) and Space Compleity = O(1).
     * 
     * Method counts number of good pair in array
     * @param nums
     * @return result
     *
     */

    public static int goodPairCount(int[] nums) {
        int result = 0;

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if( nums[i] == nums[j] ) {
                    result ++;

                }

            }
            
        }

        return result;
        
    }
 
}
