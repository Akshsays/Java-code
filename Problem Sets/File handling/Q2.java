// Accept data from user to write in a file.

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Q2
{
    public static void main(String[] args) {
        Scanner myobj=new Scanner(System.in);

        
        try
        {
            FileWriter writer=new FileWriter("/home/aksh/Desktop/Java code/Problem Sets/File handling/filefolder/Examplefile1");
            System.out.print("Enter data to write in file:");
            String filedata=myobj.nextLine();

            writer.write(filedata);
            writer.close();
            System.out.println("Wrote in file succesfully!!");
        }catch(FileNotFoundException e)
        {
            System.out.println("File not found!!");
        }  catch(IOException e)
        {
          System.out.println("Unexpected error!!");  
        } catch(Exception e)
        {
            System.out.println("Invalid input!!");
        }
        finally
        {
            myobj.close();
        }
    }
}