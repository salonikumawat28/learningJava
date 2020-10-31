package dailyProblems;

import java.util.Scanner;

public class SelectiveGreeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.next();
        if (name.equalsIgnoreCase("alice") || name.equalsIgnoreCase("bob")) {
            System.out.println("Hello " + name + "! Welcome to java World.");
            
        } else {
            System.out.println("Invalid Entry");
            
        }
    }
    
}
