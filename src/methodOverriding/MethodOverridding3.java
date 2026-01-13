
/* super keyword: 

super.method() is used to call the overridden method of the parent class

It helps differentiate between parent and child implementations

super always refers to the immediate superclass

imp =>> super.method() bypasses dynamic method dispatch***
-JVM does NOT look at object type

It directly binds the call to the parent class method

-Method is decided at compile time

-No runtime polymorphism***

super() is used for constructors, super.method() for methods
*/


package methodOverriding;

class parent
{
    public void method()
    {
      System.out.println("PARENT CLASS");  
    }
}
class child extends parent 
{
    @Override
    public void method()
    {
      System.out.println("CHILD CLASS");  
    }
    
    child()  // child constructor
    {
        System.out.print("child class : ");
        method();
        
        
        System.out.print("parent class : ");
        super.method();            
    }
}
public class MethodOverridding3 
{
   public static void main(String[] args)
   {
       child c=new child(); // constructor is called the moment object is created so it executes first
                            //  then the method is called
       c.method();
   }
}
