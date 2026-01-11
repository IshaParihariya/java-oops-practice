
/*
Static methods in Interface :
A static method in an interface belongs to the interface itself, not to the implementing class

//Cannot be overridden or inherited as its static
*/
package interfaces;

interface animal
{
    static void sound()
    {
        System.out.println("animal sound");
    }
}
public class staticMethodsInInterface
{
    public static void main(String[] args)
    {
        animal.sound();   //Called using interface name
                        
       
    }
}
