import java.util.Scanner;

public class Q1
{
    int id;
    String empname;
    int age;
    String gender;

    public Q1()
    {
        this.id=1;
        this.empname="Unknown";
        this.age=18;
        this.gender="Male";
    }

    public Q1(int id,int age)
    {
        this.id=id;
        this.age=age;
    }

    public Q1(String empname,String gender)
    {
        this.empname=empname;
        this.gender=gender;
    }

    public void Display()
    {
        System.out.println("ID:"+this.id+" Name:"+this.empname+" Age:"+this.age+" Gender:"+this.gender);
    }

    public static void main(String[] args) {
        Scanner myobj=new Scanner(System.in);

        Q1[] arr=new Q1[5]; // array of objects 
        
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter details of student "+(i+1));

            System.out.print("Enter id:");
            int id=myobj.nextInt();

            myobj.nextLine();

            System.out.print("Enter name:");
            String empname=myobj.nextLine();

            System.out.print("Enter Age:");
            int age=myobj.nextInt();

            myobj.nextLine(); // clear buffer

            System.out.print("Enter Gender:");
            String gender=myobj.nextLine();

            arr[i]=new Q1(id,age);
            arr[i].empname = empname;
            arr[i].gender = gender;
        }

        for (int i = 0; i < 5; i++) {
            arr[i].Display();
        }
    }
}