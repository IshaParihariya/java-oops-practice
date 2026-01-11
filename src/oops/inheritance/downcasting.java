
// downcasting

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
    void sound()
    {
        System.out.println("dog class :" +" bark sound ");
    }
    void eat()
    {
        System.out.println("dog class :" + " eat ");
    }
}
public class downcasting
{
    public static void main(String[] args)
    {
        animal a= new dog(); //upcasting
        a.sound();
        
        /* WRONG DOWNCASTING -> runtime errror
        dog d=(dog) a; // downcasting
        d.sound();
        d.eat();
        */
        
        /* SAFER WAY -> instanceof */
        
        if(a instanceof dog)  //safe downcasting
        {
          dog d=(dog) a;
          d.eat();
          d.sound();
        }
    }
}
