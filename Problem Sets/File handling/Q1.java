// Create a file & accept the file name from user.

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Q1
{
    public static void main(String[] args) {
        String fileName;
        Scanner myobj=new Scanner(System.in);

        try
        {
            System.out.print("Enter file name:");
            fileName=myobj.nextLine();
            File myfile=new File("/home/aksh/Desktop/Java code/Problem Sets/File handling/filefolder/"+fileName);

            if(myfile.createNewFile())
            {
                System.out.println("File created:"+myfile.getName());
            }
            else
            {
                System.out.println("File already exist!!");
            }
        } catch(IOException e)
        {
            System.out.println("Unexpected error");
        } 
        finally
        {
            myobj.close();
        }
    }
}