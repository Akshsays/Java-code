import java.util.Scanner;

// public class Array 
// {
//     public static void main(String[] args) {
//         int i,n;
//         int[] array = new int[25]; // array declared & initalized with max size 25
//         Scanner myobj = new Scanner(System.in); // Scanner class object to read data

//         System.out.print("Enter the size of array [max 25]:"); // Size input
//         n=myobj.nextInt();

//         // Userinput 
//         for(i=0;i<n;i++)
//         {
//             System.out.println("Enter data "+(i+1)+":");
//             array[i]=myobj.nextInt();
//         }

//         // Display
//         for(i=0;i<n;i++)
//         {
//             System.out.println("Data :"+array[i]);
//         }
//     }
// }

public class Array {
    public static void main(String[] args) {
        int i,n;
        String[] array= new String[25];

        Scanner myobj2= new Scanner(System.in);

        System.out.print("Enter the size of array:");
        n=myobj2.nextInt();
        for(i=0;i<n;i++)
        {
            System.out.print("Enter data "+(i+1)+ ":");
            array[i]=myobj2.nextLine();
        } 

        for(i=0;i<n;i++)
        {
            System.out.println(array[i]);
        }
    }
}