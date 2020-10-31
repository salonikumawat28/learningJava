import java.util.Scanner;

public class SimpleCalculator {
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
    } else if(operation.equals("multiply")){
        // multiply
        System.out.println("Type first number to multiply: ");
        int a = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Type second number to multiply: ");
        int b = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Bro, your multiplication is: " + (a * b));
    }
    else if (operation.equals("divide")) {
        //divide
        System.out.println("Type first number to divide: ");
        int a = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Type second number to divide: ");
        int b = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Bro, your divion is: " + (a / b));
        
    } else {
        //opaertion not applicable
        System.out.println("not applicable");
        
    }
}
}