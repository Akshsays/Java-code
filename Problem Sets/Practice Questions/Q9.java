/* Create a Java program with a superclass Vehicle (members: vehicleName, price). Derive a subclass Car (member: carType). 
Create objects of Car and display their details. Implement this with appropriate constructors & method. */
import java.util.Scanner;

class Vehicle
{
    String vehicleName;
    float price;

    public Vehicle(String vehicleName,float price)
    {
        this.vehicleName=vehicleName;
        this.price=price;
    }

    // Method to display
    void display()
    {
        System.out.println("Name:"+this.vehicleName+"Price:"+this.price);
    }
} 
class Car extends Vehicle
{
    String carType;

    public Car(String vehicleName,float price,String carType)
    {
        super(vehicleName, price);
        this.carType=carType;
    }

    @Override
    // Override the method 
    public void display()
    {
        super.display(); // call parent class display method
        System.out.println("Type:"+this.carType);
    }
}
class Q9 
{
    public static void main(String[] args) {
        
        Scanner myobj=new Scanner(System.in);

        System.out.print("Enter number of car details to store:");
        int n=myobj.nextInt();

        myobj.nextLine(); // newline

        Car[] carArr=new Car[n]; // array of objects

        for(int i=0;i<n;i++)
        {
            System.out.print("Enter Vehicle name "+(i+1)+":");
            String vehicleName=myobj.nextLine();

            System.out.print("Enter Vehicle price "+(i+1)+":");
            float price=myobj.nextFloat();

            myobj.nextLine();
            System.out.print("Enter car type "+(i+1)+":");
            String carType = myobj.nextLine();

            carArr[i]=new Car(vehicleName,price,carType); // pass value to the constructor
        }

        System.out.println("--- Car Details ---");
        for(int i=0;i<n;i++)
        {
            carArr[i].display();
        }
    }
}