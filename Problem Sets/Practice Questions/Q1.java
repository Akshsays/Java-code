// Sum of first & last digit of a number

import java.util.Scanner;

class Q1
{
    public static void main(String[] args) {
        int secondd,firstd=0,n,sum;

        Scanner myobj=new Scanner(System.in);

        System.out.print("Enter the number:");
        n=myobj.nextInt();

        secondd=n%10; // store last digit
        while(n>0)
        {
            firstd=n%10; 
            n=n/10; // get the first digit & remove the remainder
        }
        sum=firstd+secondd; // sum of first+second digit

        System.out.println("Sum of first & last digit:"+sum);
    }
}