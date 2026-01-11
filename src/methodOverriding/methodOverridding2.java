/*
=> @Override Annotation:

@Override is an annotation used to indicate that a method overrides a superclass method.

It is not mandatory, but its use is recommended.

It provides compile-time checking for method overriding.

If the method does not correctly override a parent method, the compiler generates an error.

It helps prevent accidental method overloading instead of overriding.

It improves code readability and clarity.

It ensures safe refactoring when parent method signatures change.

It is applicable only to methods, not variables or constructors.

It supports runtime polymorphism.

It reduces chances of logical errors in inheritance.
*/
package methodOverriding;

class parent 
{
    String hi()
    {
       return "mohit"; 
    }
}
class child extends parent 
{
    @Override    //should be wrutten before the method
    String hi()
    {
       return "isha"; 
    }
}

public class methodOverridding2
{
    public static void main(String[] args)
    {
      parent a=new child();
 
        System.out.println(a.hi());
        
        
    }
}

