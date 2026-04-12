// Write a ‘java’ program to check whether given number is Armstrong or not. (Use static keyword)
import java.util.Scanner;

class Q4
{

    public int order(int n)
    {
        int t=0;
        while(n!=0)
        {
            t++;
            n=n/10;
        }
        return t;
    }
    
    public double armstrong(int n)
    {
        int tnumber=order(n);
        double sum=0;
        int rem,temp=n;

        while(temp!=0)
        {
            rem=temp%10;
            sum=sum+Math.pow(rem,tnumber);
            temp=temp/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int num;

        Scanner myobj=new Scanner(System.in);

        System.out.print("Enter the number:");
        num=myobj.nextInt();

        Q4 obj=new Q4();

        Double result= obj.armstrong(num);

        if(result==num)
        {
            System.out.println("It's a armstrong number");
        }
        else
        {
            System.out.println("It's not a armstrong number");
        }

    }
}