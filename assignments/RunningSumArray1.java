package assignments;

import java.util.Arrays;
import java.util.Scanner;

// Given an array nums. We define a running sum of an array as
// runningSum[i] = sum(nums[0]…nums[i]).
//
//Return the running sum of nums.

public class RunningSumArray1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Length of the Array");
        int length = scanner.nextInt();

        int[] myArray = new int[length];
        int[] myResult = new int[length];
        int sum = 0;
        System.out.println("Enter the Elements of the Array");
        for(int i = 0; i < length; i++){
            myArray[i] = scanner.nextInt();
            sum = sum + myArray[i];
            myResult[i]=sum;
            
        }
        System.out.println(Arrays.toString(myArray));
        System.out.println(" Running sum array :- " + Arrays.toString(myResult));


    }
}