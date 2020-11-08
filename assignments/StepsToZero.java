package assignments;

/** Given a non-negative integer num, return the number of steps to reduce it to zero.
 *  If the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
 * 
 * Constraints:
 * 0 <= num <= 10^6
 * 
 * num = 19
 * 1. 19-1=18
 * 2. 18/2=9
 * 3. 9-1=8
 * 4. 8/2=4
 * 5. 4/2=2
 * 6. 2/2=1
 * 7. 1-1=0
 * 
 * result = 7
 * 
 * mum = -5
 * 1. -5-1=-6
 * 2. -6/2=-3
 * 3. -3-1=-4
 * 4. -4/2=-2
 * 5. -2-1=-3
 * infinite
 */

public class StepsToZero {

    public static void main(String[] args) {
        int num = -5;
        System.out.println("num is..." + num);
        int stepCount = stepsToReduceToZero(num);
        System.out.println("Step count is..." + stepCount);
    }
    
    /** Counting steps to reduce nums to 0.
     * 
     * @param num
     * @return stepCount
     */
    public static int stepsToReduceToZero(int num) { // O(n)
        int stepCount = 0; // O(1) , O(1)
        if(num < 0) {
            throw new IllegalArgumentException("number cannot be negative");
        }

        while(num >= 0) { // O(n), where n is step count 
            if (num == 0)  break; // O(1) , O(1)
            num =  (num % 2 == 0 ) ? num / 2 : num - 1; // O(1) , O(1)
            stepCount++; // O(1) , O(1)
        }
        
        return stepCount;
    }
    
}
