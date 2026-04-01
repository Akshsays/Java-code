// check if the user entered number is palindrome or not & raise expception if the number is zero 
import java.util.Scanner;

class ZeroNumber extends Exception
{
    public ZeroNumber(String message)
    {
        super(message);
    }
}

class Q2
{
    public static void main(String[] args) {
        int num,rem,reverse=0,ognumber;
        Scanner myobj=new Scanner(System.in);


        try
        {
            System.out.print("Enter the number:");
            num=myobj.nextInt();
            ognumber=num;

            if(num==0)
            {
                throw new ZeroNumber("Number is Zero");
            }
            else
            {
                while(num!=0)
                {
                    rem=num%10;
                    reverse=reverse*10+rem;
                    num=num/10;
                }
                if(ognumber==reverse)
                {
                    System.out.println("Its a palindrome");
                }
                else
                {
                    System.out.println("Its not a palindrome");
                }
            }
        } catch(ZeroNumber e)
        {
            System.out.println(e.getMessage());
        } catch(Exception e)
        {
            System.out.println("Invalid Input: Enter valid input");
        }
    }
}