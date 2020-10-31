package dailyProblems;

import java.util.Scanner;

public class NumberSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The Number n for sum of 1....to n :");
        int num = scanner.nextInt();
        int sum = num * ( num + 1) / 2;
        // Printing sum of n Numbers
        System.out.println("Sum = " + sum);

    }
    
}
