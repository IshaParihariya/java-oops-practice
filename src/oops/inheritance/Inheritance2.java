
//constructors in inheritance

package oops.inheritance;

public class Inheritance2
{
    static class parent
    {
        parent()  // constructor
        {
            System.out.println("parent class constructor");
        }
    }
    
    static class child extends parent
    {
        child()  // constructor
        {
            System.out.println("child class constructor");
        }
    }
    public static void main(String[] args)
    {
        parent a=new parent();   // exceution depends on the object 
        
       System.out.println("--------");
       
        child c =new child();
        
        System.out.println("--------");
        
        parent b=new child();    // parent refernce holding a child object
    }
}
