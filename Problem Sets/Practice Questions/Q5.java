// WAP to calculate fibonacci series of till the nth number
import java.util.Scanner;

class Q5 
{
    public void fib(int n)
    {
        int firstn=0,secondn=1,cur;

        System.out.println("Default 1:"+firstn);
        System.out.println("Default 2:"+secondn);
        for(int i=2;i<=n;i++)
        {
            cur=firstn+secondn;
            firstn=secondn;
            secondn=cur;
            System.out.println("Fibonacci series:"+cur);
        }

    }

    public static void main(String[] args) {
        
        Scanner myobj=new Scanner(System.in);

        int num;
        
        System.out.print("Enter the n number:");
        num=myobj.nextInt();

        Q5 obj=new Q5();
        obj.fib(num);
    }
}