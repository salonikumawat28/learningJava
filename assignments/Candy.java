package assignments;

import java.util.Arrays;

// Given the array candies and the integer extraCandies,
// where candies[i] represents the number of candies that the ith kid has.
//
// For each kid check if there is a way to distribute extraCandies among the kids
// such that he or she can have the greatest number of candies among them.
// Notice that multiple kids can have the greatest number of candies.

 

public class Candy {
    public static void main(String[] args) {
        int[] candies = new int[] {5,1,3,4};
        int extracandies = 3;
        boolean[] result = greatestCandyCount(candies, extracandies);
        System.out.println(Arrays.toString(result));
    }

    // Finding greatest candy in the array.
    // Time complexity = O(n) and SC = O(1)
    public static int greatestCandy(int[] candies){ 
        int greaterCandy = 0; //O(1) , O(1)

        for (int i = 0; i < candies.length; i++) { // O(n) , O(1)
            if(candies[i] > greaterCandy){ // O(1)
                greaterCandy = candies[i]; // O(1)
            }  
        }

        return greaterCandy; // O(1) ,O(1)
    }

    // Checking if greatest candy can ith kid have.
    // TC = O(n) and SC = O(n)
    public static boolean[] greatestCandyCount(int[] candies, int extracandies) {
        boolean[] result =  new boolean[candies.length]; //Tc = O(1) , Sc = O(n)
        int greaterCandy = greatestCandy(candies); // O(n) , O(1)

        for (int i = 0; i < candies.length; i++) { // O(n) , O(1)
            int canHaveCandies = candies[i] + extracandies; // O(1) , O(1)
            result[i] = canHaveCandies >= greaterCandy; // O(1) , O(1)
            // result[i] = canHaveCandies - greaterCandy >= 0;
        }

        return result;
    }

    
}
