
// UPCASTING 

// Upcasting: child object referenced by parent type
// Upcasting enables runtime polymorphism
// Upcasting enables dynamic method dispatch
// Actual method call is decided at runtime
//Happens automatically (implicit casting)
//Child-specific methods are not accessible***
package oops.inheritance;

class animal 
{
    void sound()
    {
      System.out.println("animal sound");  
    }
}
class dog extends animal
{
    @Override
    void sound()
    {
        System.out.println("dog : "+"bark sound");
        super.sound();
    }
    void eat()
    {
        System.out.println("dog eat"); 
    }
}

public class Upcasting 
{
    public static void main(String [] args)
    {
       animal a=new dog();
       
       a.sound();
      
       /*     
       a.eat();  -> cannot be called as they are methods of the child class
       */
    }
    
}
