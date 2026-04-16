
import java.util.Scanner;

/* Create a Java program with:

Superclass Person (members: personName, age)
Subclass Employee extending Person (member: employeeID)
Subclass Manager extending Employee (member: department)

Create objects of Employee and display their details. Implement with appropriate constructors and methods. */

class Person
{
    String personName;
    int age;

    public Person(String personName,int age)
    {
        this.personName=personName;
        this.age=age;
    }

    public void display()
    {
        System.out.println("Name:"+this.personName+"\nAge:"+this.age);
    }

}

class Employee extends Person
{
    int employeeID;

    public Employee(String personName,int age,int employeeID)
    {
        super(personName, age);
        this.employeeID=employeeID;
    }

    @Override
    public void display()
    {
        super.display();
        System.out.println("EmployeeID:"+this.employeeID);
    }

}

class Manager extends Employee
{
    String department;

    public Manager(String personName,int age,int employeeID,String department)
    {
        super(personName, age, employeeID);
        this.department=department;
    }

    @Override
    public void display()
    {
        super.display();
        System.out.println("Department:"+this.department);
    }

}

class Q12
{
    public static void main(String[] args) {
        
        Scanner myobj=new Scanner(System.in);

        System.out.print("Enter how many records you want:");
        int n=myobj.nextInt();
        myobj.nextLine();

        Employee[] empArr=new Employee[n];

        for(int i=0;i<n;i++)
        {
            System.out.print("Enter name: ");
            String name = myobj.nextLine();

            System.out.print("Enter age: ");
            int age = myobj.nextInt();

            System.out.print("Enter employee ID: ");
            int id = myobj.nextInt();

            System.out.print("Enter department (leave blank for regular employee): ");

            myobj.nextLine(); 

            String dept = myobj.nextLine();

            if (dept.isEmpty()) {
                empArr[i] = new Employee(name, age, id);
            } else {
                empArr[i] = new Manager(name, age, id, dept);
            }
                    
        }

        System.out.println("--- Student details Details ---");
        for(int i=0;i<n;i++)
        {
            empArr[i].display();
        }
    }
}