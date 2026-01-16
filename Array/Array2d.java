import java.util.Scanner;

public class Array2d 
{
    public static void main(String[] args) {
        int i,j,n;
        int[][] array= new int[25][25];

        Scanner myobj= new Scanner(System.in);

        System.out.print("Enter the size of array:");
        n=myobj.nextInt();

        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print("Enter data:");
                array[i][j]=myobj.nextInt();
            }
        }

        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(array[i][j]);
            }
            System.out.println("\n");
        }

    }
}