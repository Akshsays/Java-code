import java.util.Scanner;

class Product
{
    int pid;
    String name;
    double price;

    void acceptDetails()
    {
        Scanner myobj=new Scanner(System.in);

        System.out.print("Enter pid:");
        this.pid=myobj.nextInt();

        myobj.nextLine(); 

        System.out.print("Enter name:");
        this.name=myobj.nextLine();

        System.out.print("Enter price:");
        this.price=myobj.nextDouble();
    }

    void Display()
    {
        System.out.println("Pid:"+this.pid+" Name:"+this.name+" Price:"+this.price);
    }

    double total()
    {
        return price;
    }
}
class Q3
{
    public static void main(String[] args) {
            
        Product p=new Product();
            
        p.acceptDetails();
        p.Display();

        System.out.println("Total:"+p.total());
    }
}
