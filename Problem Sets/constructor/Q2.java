public class Q2
{
    static int count=0; // static variables can be used inside the static main function
    public Q2()
    {
        count=count+1;
    }
    public static void main(String[] args) {
        Q2 myobj1=new Q2();
        Q2 myobj2=new Q2();
        Q2 myobj3=new Q2();

        System.out.println("Count of objects:"+count); // static method can call static variables
    }
}