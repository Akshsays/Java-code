import java.util.Scanner;

public class MaxMin
{
    public static void main(String[] args) {
        Scanner myobj=new Scanner(System.in);

        int i,max,min,size;

        System.out.print("Enter the size of array:");
        size=myobj.nextInt();

        int[] ar=new int[size];
        for(i=0;i<size;i++)
        {
            System.out.print("Enter the array element "+(i+1)+":");
            ar[i]=myobj.nextInt();
        }
        
        System.out.println("\n");
        System.out.println("**Array Data**");
        for(i=0;i<size;i++)
        {
            System.out.println("Array "+(i+1)+" :"+ar[i]);
        }

        //max logic
        max=ar[0];
        for(i=1;i<size;i++)
        {
            if(ar[i]>=max)
            {
                max=ar[i];
            }
        }
        //min logic
        min=ar[0];
        for(i=1;i<size;i++)
        {
            if(ar[i]<=min)
            {
                min=ar[i];
            }
        }
        //print max number
        System.out.println("Max number:"+max);
        System.out.println("Min number:"+min);
    }
}