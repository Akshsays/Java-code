
class Mythread2 implements Runnable
{
    String text;
    int times;
    public Mythread2(String text,int times)
    {
        this.text=text;
        this.times=times;
    }
    @Override
    public void run()
    {
        try
        {
        for(int i=1;i<=times;i++)
        {
            System.out.println(text+i);
            Thread.sleep(2000);
        }
        }
        catch(InterruptedException e)
        {
                System.out.println("Thread Interrupted");
        }
    }
}
class Q4
{
   public static void main(String[] args) {
        Mythread2 obj=new Mythread2("Hello Java",10);
    
        Thread task1=new Thread(obj);
        task1.start();
   }
}