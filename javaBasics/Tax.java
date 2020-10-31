import java.util.Scanner;

public class Tax{
    //Tax deduction calculator
     public static void main(String[] args) {
        
     Scanner sc= new Scanner(System.in);
     System.out.println(" This is a Tax deduction calculator.Enter your salary :");
     float salary= Float.valueOf(sc.nextLine());

     if(salary>=250001 & salary<=500000)
     {
         float tax= (float) (0.05 * salary);
         System.out.println(tax);
     } else if (salary>= 500001 & salary<=100000) {

         float tax= (float) (12500 + 0.2 * salary);
         System.out.println(tax );
     } else if( salary>= 1000001 ) {

        float tax= (float) (112500 + 0.3 * salary);
         System.out.println(tax );
     }else{
         System.out.println("Good News: no Tax");
     }
        
    }
}