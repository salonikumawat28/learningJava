import java.util.Scanner;

public class HelloWorld {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("This is a simple calculator");
    System.out.println("What do you want? add or subtract or multiple or divide?");
    String operation = scanner.nextLine().toLowerCase();
    
    if (operation.equals("add")) {
        // Adding here.
        System.out.println("Type first number to add: ");
        int a = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Type second number to add: ");
        int b = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Bro, your addition is: " + (a + b));
    } else if (operation.equals("subtract")) {
        // Subtract here.
        System.out.println("Type first number to subtract: ");
        int a = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Type second number to subtract: ");
        int b = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Bro, your subtraction is: " + (a + b));
    } else {
        // Not supported operation.
        System.out.println("Unsupported operation: " + operation);
    }
}
}