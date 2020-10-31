import java.util.Scanner;

public class CalculatorMethod{
   //calculator program

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num1, num2 ;

        System.out.println("What operation You want to perform : add / substract / multiple / divide");
        String operation = sc.nextLine().toLowerCase();

        System.out.println("Enter your first number");
        num1= Integer.valueOf(sc.nextLine());

        System.out.println("Enter your second number");
        num2= Integer.valueOf(sc.nextLine());

        if(operation.equals("add"))
        {
                 Addition();
        }       
        else if(operation.equals("subatrct"))
        {
                substraction();
        }
        else if(operation.equals("multiply"))
        {
                Multiplication();
        }
         else if (operation.equals("divide"))
        {
                Division();
        }
                
        else
        {
                System.out.println("not applicable");
        }
        
       
   }
   //Addition function
   void Addition(float a,float b) {
         


   }
   // substraction
   void substraction(){


    }
    //divide
     void Division(){


    }

    //multiply
    void Multiplication(){


    }




}