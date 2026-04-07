// Print even number between 2 to 20 using thread
class Mythread2 implements Runnable
{
    @Override
    public void run()
    {
        for(int i=2;i<=20;i++)
        {
            if(i%2==0)
            {
                int evenn=i;
                System.out.println("Even numbers from 2 to 20:"+evenn);
            }
        }
    }
}

class Q2 
{
    public static void main(String[] args) {
        Mythread2 obj=new Mythread2();
        Thread t1=new Thread(obj);
        t1.start();
    }
}