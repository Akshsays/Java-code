import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class Q4
{
    public static void main(String[] args) {
        String content="";


        try(FileReader reader=new FileReader("/home/aksh/Desktop/Java code/Problem Sets/File handling/filefolder/Examplefile1"); Scanner rd=new Scanner(reader);)
        {
        while(rd.hasNextLine())
        {
             content=rd.nextLine() + "\n";
        }
        String reversecontent=new StringBuilder(content).reverse().toString();

        System.out.println("Reversed Content:"+reversecontent);
        } catch(FileNotFoundException e)
        {
            System.out.println("File not found: " + e.getMessage());
        }
        catch(IOException e)
        {
            System.out.println("IO Error: " + e.getMessage());
        }
    }
}