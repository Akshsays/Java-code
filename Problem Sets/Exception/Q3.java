// check if the number is prime & raise exception if its zero or 1
import java.util.Scanner;

class NumZero extends Exception
{
    public NumZero(String message)
    {
        super(message);
    }
}

class Q3
{
    public static void main(String[] args) {
        int num;
        Scanner myobj=new Scanner(System.in);

        try
        {
            System.out.print("Enter the number:");
            num=myobj.nextInt();

            if(num==0)
            {
                throw new NumZero("Number is zero");
            }
            else if(num<=1)
            {
                throw new NumZero("Number should be greater than 1");
            }
            else
            {
                boolean isPrime = true;
                for (int i = 2; i <= Math.sqrt(num); i++)
                {
                    if (num % i == 0)
                    {
                        isPrime = false;
                        break;
                        }
                }
                if (isPrime)
                System.out.println("Prime number");
                else
                System.out.println("Not a prime number");
            }
        } catch(NumZero e)
        {
            System.out.println(e.getMessage());
        } catch(Exception e)
        {
            System.out.println("Invalid input");
        }
        finally
        {
            myobj.close();
        }
    }
}