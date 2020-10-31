package dailyProblems;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class SumOrProductProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int number = scanner.nextInt();
        System.out.print("What you want to calculate sum or product : ");
        String problem = scanner.next();
        int product = 1;

        if (problem.equalsIgnoreCase("sum")) {
            int sum = number * ( number + 1) / 2;
            System.out.println("Sum of number is : " + sum);
            
        } else if(problem.equalsIgnoreCase("product")) {
            for (int i = 1; i <= number; i++) {
                product = product * i;  
            }
            System.out.println("Product of  number is : " + product);

            
        } else{
            System.out.println("Invalid operation.");
        }
    }
    
}
