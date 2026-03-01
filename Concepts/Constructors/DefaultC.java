public class DefaultC
{
    int id;
    String type;

    public DefaultC()
    {
        this.id=1;
        this.type="I'm a default constructor";
    }
    public static void main(String[] args) {
        DefaultC myobj=new DefaultC();

        System.out.println("ID:"+myobj.id);
        System.out.println("TYPE:"+myobj.type);
    }
}

// This keyword is used to access current class variables.