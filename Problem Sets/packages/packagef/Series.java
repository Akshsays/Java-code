package packagef;

public class Series
{
    public void fib(int n)
    {
        int prev1=0,prev2=1,cur;

        if(n<=1)
        {
            System.out.println("Invaild input");
            return;
        }

        System.out.println("**Fibonacci Series**");
        System.out.println(prev1);
        System.out.println(prev2);
        for(int i=3;i<=n;i++)
        {
            cur=prev1+prev2;
            prev1=prev2;
            prev2=cur;

            System.out.println(cur);
        }
    }

    public void cube(int n)
    {
        if(n<=1)
        {
            System.out.println("Invaild input");
            return;
        }

        System.out.println("Cube:"+(n*n*n));
    }

    public void square(int n)
    {
        if(n<=1)
        {
            System.out.println("Invaild input");
            return;
        }
        
        System.out.println("Square:"+(n*n));
    }
}
