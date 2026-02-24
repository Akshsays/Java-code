// import java.util.Scanner; // Package for scanner class
import java.io.*; // Package for buffered class


// Scanner Class

// public class Inputmethod
// {
//     public static void main(String[] args) {
//         int a,b,result;
//         System.out.print("Enter first number:");
//         Scanner myobj = new Scanner(System.in);
//         a=myobj.nextInt(); // Read integer 
//         System.out.print("Enter second number:");
//         b=myobj.nextInt();
//         result=a+b;
        
//         System.out.println("Addition:"+result);

//     }
// }

// Buffered Class

public class Inputmethod
{
    public static void main(String[] agrs) throws IOException
    {
        BufferedReader myobj= new BufferedReader(new InputStreamReader(System.in));
        int a,b,result;

        System.out.print("Enter data 1:");
        a=Integer.parseInt(myobj.readLine());

        System.out.print("Enter data 2:");
        b=Integer.parseInt(myobj.readLine());

        result=a+b;

        System.out.println("Sum:"+result);
    }
}

// Command line argument

// public class Inputmethod {
//     public static void main(String[] arg)
//     {
//         int a,b,result;
//         a=Integer.parseInt(arg[0]); 
//         b=Integer.parseInt(arg[1]);
//         result=a+b;
//         System.out.println("Addition :"+result);
//     }
// }
