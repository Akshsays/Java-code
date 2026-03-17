import java.util.Scanner;
import packagef.Series;
class Q1
{
    public static void main(String[] args) {
        
        int n;
        Series myobj=new Series();
        Scanner inp=new Scanner(System.in);
        
        System.out.print("Enter number:");
        n=inp.nextInt();
            
        myobj.fib(n);
        myobj.cube(n);
        myobj.square(n);
    }
}
