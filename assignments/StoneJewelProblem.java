package assignments;

/** You're given strings J representing the types of stones that are jewels, and S representing the stones you have.
* Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.
* The letters in J are guaranteed distinct, and all characters in J and S are letters.
* Letters are case sensitive, so "a" is considered a different type of stone from "A". 
*
* Note:
* S and J will consist of letters and have length at most 50.
* The characters in J are distinct.
*/
public class StoneJewelProblem {

    public static void main(String[] args) {
        String jewels = "aA";
        String stone = "aAAbbbb";
        System.out.println("Jewels are ...." + jewels);
        System.out.println("Stones are...." + stone);
        int count = jewelCount(jewels, stone);
        System.out.println("Jewel count is ....."+ count);  
    }

    /** Counting jewels in the stone.
     * 
     * @param jewels
     * @param stone
     * @return count
     */
    public static int jewelCount(String jewels , String stone) {
        int count =0;
        for (int i = 0; i < jewels.length(); i++) {
            for (int j = 0; j < stone.length(); j++) {
                if (stone.charAt(j) == jewels.charAt(i) ) {
                    count++;
                } 
            }
        }
        return count;
    }
}
