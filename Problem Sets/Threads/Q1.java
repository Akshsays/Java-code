
// Print hello java 10 times
class Mythread implements Runnable
{
    @Override
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("Hello Java");
        }
    }
}

class Q1 
{
    public static void main(String[] args) {
        
        Mythread obj=new Mythread();
        Thread t1=new Thread(obj);
        t1.start();
    }
}