class Consoverload
{
    int id;
    String name;
    double percentage;


    public Consoverload(int sid,String sname)
    {
        id=sid; // parameter name cannot be same as class name or else it will throw a error
        name=sname;
    }

    public Consoverload(double per)
    {
        percentage=per;
    }

    public static void main(String[] args) {

        Consoverload myobj=new Consoverload(1,"Aksh");
        Consoverload myobj2=new Consoverload(67.5); // second constructor (double parameter)

        System.out.println("ID:"+myobj.id);
        System.out.println("NAME:"+myobj.name);
        System.out.println("Percentage:"+myobj2.percentage);
    }
}