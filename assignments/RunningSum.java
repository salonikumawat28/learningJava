package assignments;

import java.util.Arrays;
import java.util.Scanner;

// Reviewed: Not reviewed yet.

/**
* Given an array nums. We define a running sum of an array as 
* runningSum[i] = sum(nums[0]…nums[i]).
*
* Return the running sum of nums.
*/
public class RunningSum {
    
    public static void main(String[] args) {
        // TODO: Hard Code the input instead from taking from terminal.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Length of the Array");
        int length = scanner.nextInt();

        int[] input = new int[length];
        int[] result = new int[length];
        int sum = 0;
        
        System.out.println("Enter the Elements of the Array");
        for(int i = 0; i < length; i++){
            input[i] = scanner.nextInt();
            sum = sum + input[i];
            result[i]=sum;
            
        }
        System.out.println(Arrays.toString(input));
        System.out.println(" Running sum array :- " + Arrays.toString(result));
    }
}
