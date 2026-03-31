class BasicE
{
    public static void main(String[] args) {
        int a,b;
        a=10;
        b=0;

        try
        {
            int result=a/b;
            System.err.println("Answer:"+result);
        } catch(ArithmeticException e)
        {
            System.out.println("Can't divde with ZERO!!");
        }
        finally
        {
            System.err.println("Program executed succesfully");
        }

    }
}