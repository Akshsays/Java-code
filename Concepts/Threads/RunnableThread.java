import java.util.Scanner;


class Myrunnable implements Runnable
{
    @Override
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            try
            {
                Thread.sleep(1000);
            } catch(InterruptedException e)
            {
                System.out.println("Thread Interrupted");
            }
            if(i==5)
            {
                System.out.println("Times up!!!");
                System.exit(0);
            }
        }
    }
}
class RunnableThread 
{
    public static void main(String[] args) {
        
        Scanner myobj=new Scanner(System.in);
        Myrunnable obj= new Myrunnable(); // object of thread
        Thread t1=new Thread(obj);
        t1.start();

        System.out.println("You have 5 seconds to enter your name");
        System.out.print("Enter your name:");
        String name=myobj.nextLine();

        System.out.println("hi "+name);
        System.exit(0);

        myobj.close();
    }
}

