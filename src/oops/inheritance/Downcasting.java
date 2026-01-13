// Downcasting

// Downcasting allows access to child-specific methods by
// explicitly converting a parent reference to a child reference.
package oops.inheritance;

class animal
{
    void sound()
    {
        System.out.println("animal class :" +" sound ");
    }
}
class dog extends animal
{
    @Override
    void sound()
    {
        System.out.println("dog class :" +" bark sound ");
    }
    void eat()
    {
        System.out.println("dog class :" + " eat ");
    }
}
public class Downcasting
{
    public static void main(String[] args)
    {
        animal a= new dog(); //upcasting
        a.sound();
        
        /* WRONG DOWNCASTING -> runtime errror
        dog d=(dog) a; // Downcasting
        d.sound();
        d.eat();
        */
        
        /* SAFER WAY -> instanceof */
        
        if(a instanceof dog)  //safe Downcasting
        {
          dog d=(dog) a;
          d.eat();
          d.sound();
        }
    }
}
