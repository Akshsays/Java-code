
import java.util.Scanner;


public class Countlen
{
    public static void main(String[] args) {
        int c;
        String ch;
        
        System.out.print("Enter the strings for count:"); //input string
        Scanner myobj1 = new Scanner(System.in); // Scanner object using scanner class
        ch = myobj1.nextLine(); // Reading the string 
        c=ch.length(); // Calculating length of string
        System.out.println("Length of characters is:"+c);
    }
}