import java.io.File; // File class used to handle file operations
import java.io.IOException; // IOException

public class Createfile {
    public static void main(String[] args) {
        File myFile = new File("/home/aksh/Desktop/Java code/Concepts/File handling/Files folder/example.txt"); // Just a reference, no file created yet

        try {
            if (myFile.createNewFile()) {  // Actually creates the file on disk
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}