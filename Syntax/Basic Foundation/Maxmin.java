import java.util.Scanner;

public class Maxmin
{
    public static void main(String[] args) {
        Scanner myobj= new Scanner(System.in);
        int max,min,n1,n2,n3;

        System.out.print("Enter the 1st Number:");
        n1=myobj.nextInt();

        System.out.print("Enter the 2nd Number:");
        n2=myobj.nextInt();

        System.out.print("Enter the 3rd Number:");
        n3=myobj.nextInt();

        // Max logic
        if(n1>=n2 && n1>=n3)
        {
            max=n1;
        }
        else if(n2>=n1 && n2>=n3)
        {
            max=n2;
        }
        else
        {
            max=n3;
        }

        // Min logic
        if(n1<=n2 && n1<=n3)
        {
            min=n1;
        }
        else if(n2<=n1 && n2<=n3)
        {
            min=n2;
        }
        else
        {
            min=n3;
        }

        System.out.println("Max Number:"+max);
        System.out.println("Min number:"+min);

    }
}