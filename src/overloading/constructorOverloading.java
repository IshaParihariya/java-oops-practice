/*
CONSTRUCTOR OVERLOADING :
Constructor overloading allows a class to have multiple constructors
with different parameter lists to initialize objects in different ways.
NOTE: different objects with parametrs or not calls the constructor on that basis
*/
package overloading;

class hello
{
    hello()  //constructor with no parameters
    {
      System.out.println(" no parameters constructor : hi!");
    }
    
    hello(int a)
    {
        System.out.println(" constructor with a parameter : hello");
    }
    
    hello(double a)
    {
        System.out.println(" constructor with double a parater : namaste");
    }
    hello(int a,int b)
    {
        System.out.println(" constructor with a and b paramter : konnichiwa");
    }
    
}
public class constructorOverloading 
{
    public static void main(String[] args)
    {
        hello h1=new hello(); //constructor with no parameters will be called
        //hi!
        
        hello h2=new hello(1); //hello
        
        hello h3=new hello(1.2); //namaste
        
        hello h4=new hello(1,2); //konnichiwa
        
        hello h5=new hello(); //hi!   // so one constructor can be called by two different objects**
    }
}
