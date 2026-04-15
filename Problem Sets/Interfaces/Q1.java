// WAP to calculate area of circle & sphere by implementing a interface with abstract method area().
interface Shape
{
    void area(double r);
}

class Circle implements Shape
{
    final double Pi=3.14;
    @Override
    public void area(double r)
    {
        double result=Pi*(r*r);
        System.out.println("Area of circle:"+result);
    }
}

class Sphere implements Shape
{
    final double Pi=3.14;
    @Override
    public void area(double r)
    {
        double result=4*Pi*(r*r);
        System.out.println("Area of Sphere:"+result);
    }
}
class Q1
{
    public static void main(String[] args) {
        
        Circle myobj=new Circle();
        myobj.area(5.5);
        Sphere myojb2=new Sphere();
        myojb2.area(5.1);
    }
}