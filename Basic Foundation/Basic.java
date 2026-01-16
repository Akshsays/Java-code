// Public is class type followed by keyword class & Classname
public class Basic {

    // Variable Types 
    int v1=10;
    int v2=20;
    String name= "Akshay";
    char a= 'A';
    float amt = 10.0f;

    // v1 & v2 are variables which has integear datatype
    public static void main(String[] args) {
        Basic myobj= new Basic(); // Classname objectname = keyword new Classname();
        Basic myobj2= new Basic();

        // statements: instructions
        System.out.println("Addition "+ (myobj.v1 + myobj.v2));
        System.out.println("Minus " + (myobj.v2 - myobj.v1));
        System.out.println("Multiply " + (myobj.v1 * myobj.v2));
        System.out.println("Divide " + (myobj.v1 / myobj.v2));
        System.out.println("Modules " + (myobj.v1 % myobj.v2));
         
        System.out.println("Variable outputs:\n");

        System.out.println("My Name is "+ myobj2.name);
        System.out.println("This is a single character " + myobj2.a);
        System.out.println("Total amount is: "+ myobj2.amt);

    }
}