
import java.util.Scanner;

class Animal
{
    String animalName;
    int Age;

    public Animal(String animalName,int Age)
    {
        this.animalName=animalName;
        this.Age=Age;
    }

    void display()
    {
        System.out.println("Name:"+this.animalName+"Age:"+this.Age);
    }
}

class Dog extends Animal
{
    String Breed;

    public Dog(String animalName,int Age,String Breed)
    {
        super(animalName, Age);
        this.Breed=Breed;
    }

    @Override
    public void display()
    {
        super.display();
        System.out.println("Breed:"+this.Breed);
    }
}

class Puppy extends Dog
{
    String color;

    public Puppy(String animalName,int Age,String Breed,String color)
    {
        super(animalName, Age, Breed);
        this.color=color;
    }

    @Override
    public void display()
    {
        super.display();
        System.out.println("Color:"+this.color);
    }
}

class Q10
{
    public static void main(String[] args) {
        
        Scanner myobj=new Scanner(System.in);

        System.out.print("Enter how many records you want:");
        int n=myobj.nextInt();
        myobj.nextLine();

        Dog[] dogArr=new Dog[n];

        for(int i=0;i<n;i++)
        {

            System.out.print("Enter dog name:");
            String dogname=myobj.nextLine();

            myobj.nextLine();
            System.out.print("Enter age:");
            int age=myobj.nextInt();

            myobj.nextLine();
            System.out.print("Enter Breed:");
            String breed=myobj.nextLine();

            dogArr[i]=new Dog(dogname,age,breed); // passing value to contructor
        }

        System.out.println("--- Dog Details ---");
        for(int i=0;i<n;i++)
        {
            dogArr[i].display();
        }
    }
}