// Define an abstract class Shape with abstract methods rea () and volume (). Derive abstract class Shape into two classes Cone and Cylinder. Write a java Program to calculate area and volume of Cone and Cylinder.

import java.util.Scanner;

abstract class Shape
{
    abstract void area();
    abstract void volume();
}

class Cone extends Shape
{
    int radius,height;
    public Cone(int r,int h)
    {
        this.radius=r;
        this.height=h;
    }
    @Override
    public void area()
    {
        double coneArea = Math.PI * radius * (radius + Math.sqrt(height * height + radius * radius));
        System.out.println("Cone Area: " + coneArea);
    }


    @Override
    public void volume()
    {
        double vol = (1.0 / 3.0)* Math.PI*radius*radius*height;
        System.out.println("Cone Volume: " + vol);
    }
}

class Cylinder extends Shape
{
    int radius, height;

    public Cylinder(int r,int h)
    {
        this.radius=r;
        this.height=h;
    }

    @Override
    public void area()
    {
        double lateral=2*Math.PI*radius*height;
        double bases=2*Math.PI*radius*radius;
        System.out.println("Cylinder Surface Area: " + (lateral + bases));
    }


    @Override
    public void volume()
    {
        double vol=Math.PI*radius*radius*height;
        System.out.println("Cylinder Volume: " + vol);
    }
}

class Q6
{
    public static void main(String[] args) {

        Scanner myobj=new Scanner(System.in);

        System.out.print("Enter height:");
        int height=myobj.nextInt();

        System.out.print("Enter radius:");
        int radius=myobj.nextInt();

        Shape cone=new Cone(radius,height);
        Shape cylinder=new Cylinder(radius,height);

        
        System.out.println("Cone Area & Volume");
        cone.area();
        cone.volume();

        System.out.println("Cylinder Area & Volumne");
        cylinder.area();
        cylinder.volume();
    }
}