import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Readfile
{
    public static void main(String[] args) {

        File myFile=new File("/home/aksh/Desktop/Java code/Concepts/File handling/Files folder/example.txt");
        // passing the file object in scanner constructor
        try(Scanner myreader=new Scanner(myFile))
        {
            
            
            while(myreader.hasNextLine()) // checking for nextline
            {
                String data= myreader.nextLine(); // storing the data in variable
                System.out.println("File included:"+data);
            }
        } catch(FileNotFoundException e)
        {
            System.out.println("File not found!!");
        } catch(Exception e)
        {
            System.out.println("Something went wrong: File doesn't exist!!");
        }
    }
}