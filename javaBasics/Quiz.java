import java.util.Scanner;

public class Quiz{
    
     public static void main(String[] args) {
        
        Scanner Sc= new Scanner(System.in);
        System.out.println("What is the capital of India? choose the corrct option");
        System.out.println("1.Mumbai ");
        System.out.println("2.New Delhi");
        System.out.println("3.Jaipur ");
        System.out.println("4.kanpur");
        String answer= Sc.nextLine().toLowerCase();

        if (answer.equals("new delhi")) {
            System.out.println("Your answer " + answer + " is correct");
            
        } else {
            System.out.println("Your answer is incorrect. ");
            
            
        }
        
    }
}