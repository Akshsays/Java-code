import java.io.*;

public class Multiply 
{
    public static void main(String[] agrs) throws IOException
    {
        BufferedReader myobj=  new BufferedReader(new InputStreamReader(System.in));
        int i,num;

        System.out.print("Enter the number:");
        num=Integer.parseInt(myobj.readLine());

        System.out.println("**Multiplication Table **\n");

        for(i=1;i<=10;i++)
        {
            System.out.println(num+"*"+i+":"+(num*i));
        }

    }
}