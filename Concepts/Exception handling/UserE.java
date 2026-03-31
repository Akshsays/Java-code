import java.util.Scanner;

//exception class is needed to create a user defined excepti
class MyExp extends Exception
{
    public MyExp(String message) // constructor 
    {
        super(message); // call a method from parent class which will store the message
    }
}

public class UserE
{
    public static void main(String[] args) {
        int age;
        Scanner myobj=new Scanner(System.in); 

        // try contains dangeours code that may raise some error
        try 
        {
            System.out.print("Enter age:");
            age=myobj.nextInt();
            if(age>=18)
            {
                System.out.println("Eligible for vote");
            }
            else
            {
                throw new MyExp("Not eligible"); // throwing a new exception with a message
            }
        } catch (MyExp e) // catching the exception 
        {
            System.out.println(e.getMessage()); // getting the message passed in the exception to display 
        }
        catch (Exception e) // getting every exception as a safety measure 
        {
            System.out.println("Invalid age: Enter valid age");
        }
    }
}