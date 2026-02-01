import java.util.Scanner;

public class Revarray
{
    public static void main(String[] args) {
        Scanner myobj=new Scanner(System.in);

        int size,i;

        System.out.print("Enter the size of array:");
        size=myobj.nextInt();

        int[] ar=new int[size];
        for(i=0;i<size;i++)
        {
            System.out.print("Enter the array "+(i+1)+":");
            ar[i]=myobj.nextInt();
        }

        //orignal array
        System.out.println("\n");
        System.out.println("**Original Array **");
        for(i=0;i<size;i++)
        {
            System.out.println("Array "+(i+1)+" :"+ar[i]);
        }
        //reverse array
        System.out.println("\n");
        System.out.println("**Reversed Array **");
        for(i=size-1;i>=0;i--)
        {
            System.out.println("Array "+(i+1)+" :"+ar[i]);
        }
    }
}