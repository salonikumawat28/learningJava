package dailyProblems;

import java.util.Scanner;

public class MultipleSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number n for Sum of 1......to n : ");
        int number = scanner.nextInt();
        int sum = 0;
        
        for (int i = 1; i <= number; i++) {
            if ( ( i % 3 == 0 ) || ( i % 5 == 0)) {
                sum = sum + i;
                
            } 
         }
         // Time complexity of program = o(n)
         // Printing sum of multiple of numbers only divisible by 3 or 5.
         System.out.println("sum = " + sum);

    }
    
}
