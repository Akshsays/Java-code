import java.util.Scanner;

public class Menu
{
// Create array
         
    static int[] myMethod()
    {
        int size,i;
        Scanner myobj1= new Scanner(System.in);

        System.out.print("Enter the array size:");
        size=myobj1.nextInt();

        int[] ar=new int[size];

         // accept data
        for(i=0;i<size;i++)
        {
            System.out.print("Enter the array "+(i+1)+":"); 
            ar[i]=myobj1.nextInt();
        }

        return ar;
    }

// Display

    static void myDisplay(int ar[])
    {
        int i;
        if(ar == null)
        {
            System.out.println("No array created yet!");
            return;
        }
        System.out.println("**Array output**");
        for(i=0;i<ar.length;i++)
        {
            System.out.println("Output"+(i+1)+" :"+ar[i]);
        }
    }

    public static void main(String[] args) {
        int ch;
        int[] savedArray = null; // store array
        Scanner myobj2 = new Scanner(System.in);
        System.out.print("**Menu Driven**");
        do
        {
            System.out.println("Create array");
            System.out.println("Display array");
            System.out.println("Exit");
            
            System.out.print("Enter your choice:");
            ch=myobj2.nextInt();

            switch (ch) {
                case 1 -> {
                    if (savedArray!=null)
                    {
                        System.out.println("Array already created!!");
                    }
                    else 
                    {
                        savedArray=myMethod();
                        System.out.println("Array created!!");
                    }
                }
                case 2 -> myDisplay(savedArray);
                case 3 -> System.out.println("Exiting...");
                default -> System.out.println("Invaild choice!!");
            }
        }while(ch !=3);
    }
}