import java.io.FileWriter; // Write file 
import java.io.IOException;

class Writefile
{
    public static void main(String[] args) {
        try
        {
            FileWriter writer=new FileWriter("/home/aksh/Desktop/Java code/Concepts/File handling/Files folder/example.txt"); // write file with obj
            writer.write("Hello, This is me writing in a file created throught Createfile!!!"); // writing in file using write() method
            writer.close();
            System.out.println("Wrote in file!!");
        } catch(IOException e)
        {
            System.out.println("Error: Failed to write");
        }
    }
}