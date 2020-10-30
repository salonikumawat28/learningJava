package assignments;

import java.util.Arrays;

//Given an array nums. We define a running sum of an array as 
//runningSum[i] = sum(nums[0]…nums[i]).
//
//Return the running sum of nums.

public class RunningSumArrayAllApproach {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4};
        System.out.println("Nums array is .." + Arrays.toString(nums));
        int[] result= runningSumApproch2(nums);
        System.out.println("Running sum Array is...." + Arrays.toString(result));
    }
    // Approach 1
    public static int[] runningSumApproch1(int[] nums){
        int[] result = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j <= i; j++) {
                sum = sum + nums[j];
                result[j] = sum;
            }  
        }
        return result;
    }
    // Approach 2
    public static int[] runningSumApproch2(int[] nums){
        int[] result = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
           result[i] = result[i] + nums[i];
        }
        return result;
    }
    
}
