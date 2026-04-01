import java.util.Scanner;

class InvalidName extends Exception
{
    public InvalidName(String message)
    {
        super(message);
    }
}

class Q4
{
    public static void main(String[] args) {
        String name;
        Scanner myobj=new Scanner(System.in);

        try
        {
            System.out.print("Enter doctor name:");
            name=myobj.nextLine();
            
            if(name.matches(".*[0-9!@#$%^&*()_+\\-=\\[\\]{};'\"\\\\/,.<>/?`~].*"))
            {
                throw new InvalidName("Name contains digits or special symbol which is not allowed!!");
            }
            else
            {
                System.out.println("Doctor name is valid:"+name);
            }
        } catch(InvalidName e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            myobj.close();
        }
    }
}