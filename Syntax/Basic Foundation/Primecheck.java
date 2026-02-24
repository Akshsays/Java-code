import java.util.Scanner;

public class Primecheck
{
    public static void main(String[] args)
    {
        Scanner myobj= new Scanner(System.in);
        int i,num;
        Boolean isPrime=true;

        System.out.print("Enter Number:");
        num=myobj.nextInt();

        if(num<=1)
        {
            isPrime=false;
        }
        else
        {
            for(i=2;i<=num/2;i++)
            {
                if(num%i==0)
                {
                    isPrime=false;
                    break;
                }
            }
        }
            if(isPrime)
            {
                System.out.println(num+" Is  Prime");
            }
            else
            {
                System.out.println(num+" Is not Prime");
            }
        }
}