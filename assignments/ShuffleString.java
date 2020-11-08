package assignments;

import java.util.Arrays;

/** Given a string s and an integer array indices of the same length.
* The string s will be shuffled such that,
* the character at the ith position moves to indices[i] in the shuffled string.
* Return the shuffled string.
*
* Constraints:
* s.length == indices.length == n
* 1 <= n <= 100
* s contains only lower-case English letters.
* 0 <= indices[i] < n
* All values of indices are unique (i.e. indices is a permutation of the integers from 0 to n - 1).
* 
*/
public class ShuffleString {
    public static void main(String[] args) {
        String str = "codeleet";
        int[] indices = new int[] {4,5,6,7,0,2,1,3};
        System.out.println("s = " + str);
        System.out.println("indices = " + Arrays.toString(indices));
        String result = shuffleString(str, indices);
        System.out.println("Shuffled String is....." + result);
    }
    /** Shuffled String Method
     * 
     * @param str
     * @param indices
     * @return result
     */
    
    public static String shuffleString (String str, int[] indices) {
        char[] result = new char[indices.length];

        for (int i = 0; i < indices.length; i++) {
            result[indices[i]] = str.charAt(i);
            
        }

        return new String(result);
    }
}
