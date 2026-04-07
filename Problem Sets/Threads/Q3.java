// Create 3 threads & accept n times to print certain string
import java.util.Scanner;

class PrintThread implements Runnable
{
    final String text;
    final  int times;

    public PrintThread(String text,int times)
    {
        this.text=text;
        this.times=times;
    }

    @Override
    public void run()
    {
        for(int i=1;i<=times;i++)
        {
            System.out.println(text+ " "+i);
        }
    }
}

class Q3
{
    public static void main(String[] args) {
        Scanner myobj=new Scanner(System.in);

        System.out.print("Enter how many times you want to print:");
        int n=myobj.nextInt();

        PrintThread t1=new PrintThread("FYBBA CA",n);
        PrintThread t2=new PrintThread("SYBBA CA",n);
        PrintThread t3=new PrintThread("TYBBA CA",n);

        Thread task1 = new Thread(t1);
        Thread task2 = new Thread(t2);
        Thread task3 = new Thread(t3);
        
        task1.start();
        task2.start();
        task3.start();


    }
}