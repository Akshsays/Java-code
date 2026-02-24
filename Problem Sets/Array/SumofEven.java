import java.util.Scanner;

public class SumofEven
{
    public static void main(String[] args) {
        Scanner myobj=new Scanner(System.in);

        int i,size,sum=0;

        //size of array
        System.out.print("Enter the size of array:");
        size=myobj.nextInt();
        
        //array creation
        int[] ar=new int[size];
        for(i=0;i<size;i++)
        {
            System.out.print("Enter array data "+(i+1)+":");
            ar[i]=myobj.nextInt();
        }

        System.out.println("\n");
        System.out.println("**Array Data**");
        for(i=0;i<size;i++)
        {
            System.out.println("Array "+(i+1)+" :"+ar[i]);
        }

        //calculating sum of even numbers
        for(i=0;i<size;i++)
        {
        if(ar[i]%2==0)
        {
            sum=sum+ar[i];
        }
        }
        //display sum
        System.out.println("Sum of even numbers:"+sum);
    }
}