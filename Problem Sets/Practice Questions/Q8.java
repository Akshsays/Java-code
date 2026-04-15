import java.util.Scanner;

class Emp
{
    String name;
    float Salary;

    public Emp(String name,float Salary)
    {
        this.name=name;
        this.Salary=Salary;
    }

    void display()
    {
        System.out.println("Name:"+this.name+" Salary:"+this.Salary);
    }
}
class Developer extends Emp
{
    String projectname;

    public Developer(String name,float Salary,String projectname)
    {
        super(name, Salary);
        this.projectname=projectname;
    }

    @Override
    public void display()
    {
        super.display(); // reuse the method of parent class Emp
        System.out.println("Salary:"+this.projectname);
    }
}
class Programmer extends Developer 
{
    String proglanguage;

    public Programmer(String name,float Salary,String projectname,String proglanguage)
    {
        super(name, Salary, projectname);
        this.proglanguage=proglanguage;
    }

    @Override
    public void display()
    {
        super.display();
        System.out.println("Programming language:"+this.proglanguage);
    }

}
class Q8
{
    public static void main(String[] args) {
        Scanner myobj=new Scanner(System.in);

        System.out.print("Enter how many employee records you want:");
        int n=myobj.nextInt();

        myobj.nextLine();

        Developer[] myArr=new Developer[n];

        for(int i=0;i<n;i++)
        {
            System.out.print("Enter Employee name of "+(i+1)+":");
            String name=myobj.nextLine();

            System.out.print("Enter Salary of employee "+(i+1)+":");
            float Salary=myobj.nextFloat();

            myobj.nextLine();
            System.out.print("Enter project name of employee "+(i+1)+":");
            String project = myobj.nextLine();


            myArr[i] = new Developer(name, Salary, project);
        }
        System.out.println("\n===== Employee Details =====");
        for (int i = 0; i < n; i++) {
            myArr[i].display();
            System.out.println("----------------------------");
        }
    }
}