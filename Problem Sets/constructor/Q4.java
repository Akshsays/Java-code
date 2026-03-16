class Q4
{
    private int num;

    public Q4()
    {
        this.num=0;
    }

    public Q4(int num)
    {
        this.num=num;
    }

    void IsNegative()
    {
        if(this.num<0)
            {
                System.out.println("Negative number");
            }
    } 

    void IsPositive()
    {
        if(this.num>0)
            {
                System.out.println("Postive number");
            }
    }   

    void IsEven()
    {
        if(this.num%2==0)
            {
                System.out.println("Number is even");
            }
    }   

    void IsOdd()
    {
        if(this.num%2!=0)
            {
                System.out.println("Number is odd");
            }
    }

    public static void main(String[] args) {
        
        Q4 myobj=new Q4();
        myobj.num=Integer.parseInt(args[0]);
        myobj.IsPositive();
        myobj.IsNegative();
        myobj.IsOdd();
        myobj.IsEven();
    }
}