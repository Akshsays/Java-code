// WAP to implement a interface integer with a abstract method check for knowing a number is positive or negative.
interface integer
{
    void check(int num);
}
class testclass implements integer
{
    @Override
    public void check(int num)
    {
        if(num<0)
        {
            System.out.println("Number is negative");
        }
        else if(num==0)
        {
            System.out.println("Number is zero");
        }
        else
        {
            System.out.println("Number is positive");
        }
    }
}
class Q2 
{
    public static void main(String[] args) {
        
        testclass myobj=new testclass();
        myobj.check(-1);
    }
}