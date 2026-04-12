// Write a java program to display all the vowels from a given string
import java.util.Scanner;
class Q3
{
    public static void main(String[] args) {
        String userstring;

        Scanner myobj=new Scanner(System.in);

        System.out.print("Enter the string:");
        userstring=myobj.nextLine().toLowerCase();

        int vowelscount=0;

        for(int i=0;i<userstring.length();i++)
        {
            // Comparing char with String: charAt() returns a char.
            if(userstring.charAt(i) == 'a'||userstring.charAt(i) == 'e'||userstring.charAt(i) =='i'||userstring.charAt(i) == 'o'||userstring.charAt(i) == 'u')
            {
                System.out.println("Vowels on "+i+":"+userstring.charAt(i));
                vowelscount++;    
            }
        }
        if(vowelscount==0)
        {
            System.out.println("Voweles not found!!");
        }
    }
}