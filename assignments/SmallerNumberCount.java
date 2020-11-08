package assignments;

import java.util.Arrays;

/** Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it.
 *  That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i]. 
 * Return the answer in an array.
 * 
 * Constraints: 
 * 2 <= nums.length <= 500 
 * 0 <= nums[i] <= 100
*/
public class SmallerNumberCount {
    public static void main(String[] args) {
        int[] nums = new int[] {6,5,4,8};
        System.out.println("Nums Array is ...." + Arrays.toString(nums));
        int[] result = smallerNumberArray(nums);
        System.out.println("Smaller number array is...." + Arrays.toString(result));
    }

    /** Smaller number count for every number in the array.
     * 
     * @param nums
     * @return result
     */
    public static int[] smallerNumberArray(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    result[i]++;
                } 
            } 
        }
        return result;
    } 
}
