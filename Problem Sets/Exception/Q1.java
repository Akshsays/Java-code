import java.util.Scanner;

class OutofRange extends Exception
{
    public OutofRange(String message)
    {
        super(message);
    }
}
class Q1
{
    public static void main(String[] args) {
        int num,sum=0;
        Scanner myobj=new Scanner(System.in);

        System.out.print("Enter the number:");
        try
        {
        num=myobj.nextInt();
        if(num>100)
        {
            throw new OutofRange("Number is out of range");
        }
        else
        {
            while(num!=0)
            {
                int rem=num%10;
                sum=sum+rem;
                num=num/10;
            }
            System.out.println("Sum of digits:"+sum);
        } 
        } catch(OutofRange e)
        {
            System.out.println(e.getMessage());
        } catch(Exception e)
        {
            System.out.println("Invalid input:Enter valid input");
        }
        finally
        {
            myobj.close();
        }
    }
}