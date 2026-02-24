import java.util.Scanner;

public class ElementSum
{
    public static void main(String[] args) {

        Scanner myobj=new Scanner(System.in);
        int sum=0,i,s;

        System.out.print("Enter the size:");
        s=myobj.nextInt();

        // Array creation
        int[] arr=new int[s];
        for(i=0;i<s;i++)
        {
            System.out.print("Enter the array element "+(i+1)+":");
            arr[i]=myobj.nextInt();
        }

        System.out.print("\n");
        System.out.println("***Array Elements***");
        System.out.print("\n");
        // array elements
        for(i=0;i<s;i++)
        {
            System.out.println("Array element "+(i+1)+ ":"+arr[i]);
        }
        // calculate sum
        for(i=0;i<s;i++)
        {
            sum=sum+arr[i];
        }
        System.out.print("\n");
        System.out.println("Sum of array elements:"+sum);
    }
}