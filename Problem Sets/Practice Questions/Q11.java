
import java.util.Scanner;

/* Create a Java program to manage students in a college. Create a superclass Student (members: studentName, rollNumber). Derive a subclass EngineeringStudent (member: branch). 
Create objects of EngineeringStudent and display their details with appropriate constructors. */
class Student
{
    String studentName;
    int rollNumber;
    
    public Student(String studentName,int rollNumber)
    {
        this.studentName=studentName;
        this.rollNumber=rollNumber;
    }

    public void display()
    {
        System.out.println("Name:"+this.studentName+"RollNo:"+this.rollNumber);
    }
}

class EngineeringStudent extends Student
{
    String branch;
    
    public EngineeringStudent(String studentName,int rollNumber,String branch)
    {
        super(studentName, rollNumber);
        this.branch=branch;
    }

    @Override
    public void display()
    {
        super.display();
        System.out.println("Branch:"+this.branch);
    }
}

class Q11
{
    public static void main(String[] args) {
        
        Scanner myobj=new Scanner(System.in);

        System.out.print("Enter how many records you want:");
        int n=myobj.nextInt();

        myobj.nextLine();

        EngineeringStudent[] engArr=new EngineeringStudent[n];

        for(int i=0;i<n;i++)
        {
            System.out.print("Enter student name:");
            String name=myobj.nextLine();

            System.out.print("Enter rollno:");
            int rollNumber=myobj.nextInt();

            myobj.nextLine();

            System.out.print("Enter the branch:");
            String branch=myobj.nextLine();

            engArr[i]=new EngineeringStudent(name,rollNumber,branch);
        }

        System.out.println("--- Student details Details ---");
        for(int i=0;i<n;i++)
        {
            engArr[i].display();
        }
    }
}