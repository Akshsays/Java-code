import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class Q5
{
    public static void main(String[] args) {
        
        int charcount=0;
        int wordcount=0;
        String content="";

        try(FileReader myFile=new FileReader("/home/aksh/Desktop/Java code/Problem Sets/File handling/filefolder/Examplefile1"); Scanner obj=new Scanner(myFile);) {

            while(obj.hasNextLine())
            {
                content=obj.nextLine()+ "\n";
            }
            charcount=content.length();
            wordcount=content.trim().split("\\s+").length;
            
            System.out.println("Char count:"+charcount);
            System.out.println("Word count:"+wordcount);

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}