
/*
default method in interface :
A default method is a method in an interface that has a method body.
A default method in an interface is a method with implementation
that can be inherited or overridden by implementing classes.
*/
package interfaces;
//note : an interface can exist without any abstract method.
interface hello
{
    void hi();  //abstract method
    
    default void hello() //default method now this can be implemented also overridden
    {
        System.out.println("hello");
    }
    
    static void namaste() //static method cant have an object 
    {
        System.out.println("namste");
    }
}

class greetings implements hello
{
    public void hi() //overridden method
    {
        System.out.println("hi");
    }
    
}
public class DefaultMethodInInterface
{
    public static void main(String[] args)
    {
        greetings a=new greetings();
        a.hello();
        a.hi();
        
       hello.namaste(); //called using the class not its object**
    }
}
