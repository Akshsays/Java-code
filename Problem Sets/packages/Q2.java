import java.util.Scanner;
import packagef.Maths;

class Q2
{
    public static void main(String[] args)
    {
        Maths myobj=new Maths();
        Scanner inp=new Scanner(System.in);

        System.out.print("Enter first number:");
        int a=inp.nextInt();
        System.out.print("Enter Second number:");
        int b=inp.nextInt();

        System.out.println("Max number:"+myobj.max(a,b));

        System.out.print("Enter base number:");
        double base=inp.nextInt();
        System.out.print("Enter exponent number:");
        double expo=inp.nextInt();

        System.out.println("Power:"+myobj.power(base,expo));

    }
}