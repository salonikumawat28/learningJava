import java.util.Scanner;

public class Area{

    public static void main(String[] args) {
        float a= Triangle();
        System.out.println("Area of triangle is : " + a);

    }

    static float Triangle()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of triangle :");
        int length=Integer.valueOf(sc.nextLine());
        System.out.println("Enter breath of triangle:");
        int breath=Integer.valueOf(sc.nextLine());
        float area= (float) (0.5 * length * breath);
        return area;



    }
}