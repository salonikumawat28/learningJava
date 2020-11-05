package assignments;

import java.util.Arrays;

/** Given a valid (IPv4) IP address, return a defanged version of that IP address.
 *
 * A defanged IP address replaces every period "." with "[.]".
 * 
 * Constraints:
 * The given address is a valid IPv4 address.
*/

public class IPAddressDefanging {

    public static void main(String[] args) {
 
        char[] ipAddress = new char[]{'1','.','1','.','1','.','1'};
        System.out.println(Arrays.toString(ipAddress));
        char[] result = defangingProgram(ipAddress);
        System.out.println(Arrays.toString(result));
        
    }
    /**
     * Time complexity = O(n), where n is length of array.
     * Space Complexity = O(n), where n is length of result array.
     * 
     * 
     * Defanging IP Addess where replacing '.' with '[.]'.
     * @param ipAddress
     * @return result
     */
    
    public static char[] defangingProgram( char[] ipAddress) {
        char[] result = new char[ipAddress.length + 6];

        for (int i = 0; i < ipAddress.length; i++) {
           if (ipAddress[i] == '.') {
               result[i * 2 -1] = '[';
               result[i * 2] = '.';
               result[i * 2 + 1] = ']';
               
           } else {
               result[i * 2] = ipAddress[i];
 
           }
            
        }
        return result;
        
    }
}
