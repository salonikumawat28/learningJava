import java.util.Scanner;

public class LoopDemo{
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number upto which you want to run the loop:");
        int num= Integer.valueOf(sc.nextLine());

        // printing N number
        for( int a=1; a<=num; a++)
        {
            System.out.println(a);
        }


    }
}