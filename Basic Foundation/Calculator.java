
import java.util.Scanner;


public class Calculator
{
    public static void main(String[] args) {
        int a,b;
        System.out.print("Enter first number:");
        Scanner myobj1= new Scanner(System.in);
        a=myobj1.nextInt();
        System.out.print("Enter second number:");
        Scanner myobj2= new Scanner(System.in);
        b=myobj2.nextInt();

        System.out.println("Addition:"+ (a+b));
        System.out.println("Substraction:"+ (a-b));
        System.out.println("Division:"+ (a/b));
        System.out.println("Multiplication:"+ (a*b));
        System.out.println("Modules:"+ (a%b));
    }
}