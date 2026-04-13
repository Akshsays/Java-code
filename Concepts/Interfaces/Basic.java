interface testInterface 
{
    // Both the methods are abstract by default.
    void display();
    void calculate(int a,int b); // we can pass parameters in a abstract method also.
}

// If a class hasn't implemented all the abstract methods present in a interface then it should be declared abstract.
abstract class TestClass2 implements testInterface
{
    @Override
    public void display()
    {
        System.out.println("Hello I'm a abstract class which has implemented a abstract method");
    }
}

// Class extending a abstract class to implement/use rest of the abstract methods of interface which are not implemented yet.
class TestClass extends TestClass2 {
  
    @Override
    public void calculate(int a,int b){ 
      System.out.println(a+b); 
    }
}
class Basic{
    
    public static void main(String[] args)
    {
        // Abstract class restrict object creation but we can extend it into normal class & create obj of that class to access methods.
        TestClass t=new TestClass();
        t.calculate(10,20);
        t.display();
    }
}