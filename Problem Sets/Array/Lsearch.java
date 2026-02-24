import java.util.Scanner;

public class Lsearch
{
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);

        int size,i,key,pos=0;
        boolean found=false;

        //input size of array
        System.out.print("Enter the size of array:");
        size=myobj.nextInt();

        //array creation
        int[] ar=new int[size];
        for(i=0;i<size;i++)
        {
            System.out.print("Enter the array "+(i+1)+":");
            ar[i]=myobj.nextInt();
        }
        //accept key element for search
        System.out.print("Enter the key element:");
        key=myobj.nextInt();

        //linear search algo
        for(i=0;i<size;i++)
        {
            if(ar[i]==key)
            {
                found=true;
                pos=i+1;
                break;
            }
        }
        
        if(found==true)
        {
            System.out.println("Key found at index: "+pos);
        }
        else
        {
            System.out.println("Key not found");
        }
    }
    
}