// Return file information like name, size, access & path from given files.
import java.io.File;

class Q3
{
    public static void main(String[] args) {
        
        File myfile=new File("/home/aksh/Desktop/Java code/Problem Sets/File handling/filefolder/Examplefile1");

        try
        {
        if(myfile.exists())
        {
            System.out.println("File name:"+myfile.getName());
            System.out.println("File size in bytes:"+myfile.length());
            System.out.println("Read access:"+myfile.canRead());
            System.out.println("Write acces:"+myfile.canWrite());
            System.out.println("File path:"+myfile.getPath());
        }
        else
        {
            System.out.println("File doesn't exist!!");
        }
        } catch(Exception e)
        {
            System.out.println("Something went wrong!!");
        }
    }
}