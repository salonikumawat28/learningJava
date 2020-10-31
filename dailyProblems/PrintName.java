package dailyProblems;

import java.util.Scanner;

public class PrintName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the your name : ");
        String name = scanner.next();
        // Greeting user with their name.
        System.out.println("Hello " + name + "! How are you. Welcome to Java World");
    }    
}
