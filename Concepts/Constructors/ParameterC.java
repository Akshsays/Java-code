public class ParameterC
{
    int pid;
    String pname;
    String age;

    public ParameterC(int id, String name, String Age)
    {
        pid=id;
        pname=name;
        age=Age;
        // This keyword can be used if class variable name matches with parameter name. 
    }

    public static void main(String[] args) {
        ParameterC myobj=new ParameterC(2,"ikiki","Female");

        System.out.println("Pid:"+myobj.pid);
        System.out.println("Pname:"+myobj.pname);
        System.out.println("Age:"+myobj.age);
    }
}