/*

FUNCTIONAL INTERFACE : excatly one abstract method**
-> A functional interface is an interface that contains exactly one
abstract method and is used mainly with lambda expressions.
-> @FunctionalInterface annotation**
 If you add another abstract method -> compile error so use annotation
*/
package interfaces;

@FunctionalInterface //annotaion**
        
interface Greeting 
{
    void sayHello();   // only ONE abstract method
}

class Hello implements Greeting 
{
    public void sayHello() {
        System.out.println("Hello!");
    }
}

public class FunctionInterface 
{
    public static void main(String[] args)
    {
        Greeting g = new Hello();
        g.sayHello();
    }
}
