package assignments;

import java.util.Arrays;

// Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
//
// Return the array in the form [x1,y1,x2,y2,...,xn,yn].

public class ArrayShuffle {
    public static void main(String[] args) {
        int[] nums = new int[]{2,5,1,3,4,7};
        int n = 3;
        System.out.println("2n elements in nums array ... " + Arrays.toString(nums) + " where n is " + n);
        int[] result = shuffleApproach4(nums, n);
        System.out.println("Resulting Shuffle array is " + Arrays.toString(result));
    }
    // Approach 1
    // TC = O(n) , SC = O(n)
    public static int[] shuffleApproach1(int[] nums, int n ){
        int[] result = new int[nums.length]; // O(1) , O(n)

        for (int i = 0; i < nums.length; i += 2) { // O(n) , O(1)
            result[i] = nums[i/2]; // O(1) , O(1)    
        }

        for (int i = 1; i < nums.length; i +=2 ) { // O(n) , O(1)
            result[i] = nums[n + (i - 1) /2];  //O(1) , O(1)    
        }

        return result;
    }
    // Approach 2
    // TC = O(n) , SC  = O(n)
    public static int[] shuffleApproach2(int[] nums, int n ){
        int[] result = new int[nums.length]; // O(1) , O(n)

        for (int i = 0; i < nums.length; i += 2) { // O(n) , O(1)

            result[i] = nums[i/2]; // O(1) , O(1)  
            result[i + 1] = nums[n + i / 2];  //O(1) , O(1)     
        }
        
        return result;
    }

    // Approach 3
    // TC = O(n) , SC  = O(n)
    public static int[] shuffleApproach3(int[] nums, int n ){
        int[] result = new int[nums.length]; // O(1) , O(n)

        for (int i = 0; i < nums.length; i ++) { // O(n) , O(1)

            if (i % 2 ==0) {
                result[i] = nums[i/2]; // O(1) , O(1)

            } else {
                result[i] = nums[n + (i - 1) /2]; // O(1) , O(1)
              
            }   
        }
        
        return result;
    }

    // Approach 4
    // TC = O(n) , SC  = O(n)
    public static int[] shuffleApproach4(int[] nums, int n ){
        int[] result = new int[nums.length]; // O(1) , O(n)

        for (int i = 0; i < nums.length; i ++) { // O(n) , O(1)
            result[i] = (i % 2 == 0) ? nums[i / 2] : nums[n + (i - 1) / 2]; //O(1) , O(1)
        }
        
        return result;
    } 
    
}
