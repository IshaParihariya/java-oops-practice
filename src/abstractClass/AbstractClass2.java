
package abstractClass;

abstract class parent
{
    parent()
    {
   System.out.println("ABSTRACT CLASS 1 : parent"); 
    }
    
    public abstract void method1();
}
abstract class child1 extends parent
{
   child1()
    {
   System.out.println("ABSTRACT CLASS 2 : child1"); 
    } 
   public abstract void method2();
}
abstract class child2 extends child1
{
    child2()
    {
   System.out.println("ABSTRACT CLASS 3 : child2"); 
    } 
    public abstract void method3();
    
    
}
class child3 extends child2
{
    child3()
    {
        System.out.println(" concrete CLASS 1 : child3"); 
    }
    public void method1()
    {
       System.out.println("method 1 overridden"); 
    }
     public void method2()
    {
         System.out.println("method 2 overridden");  
    }
      public void method3()
    {
          System.out.println("method 3 overridden"); 
    }
    
}

public class AbstractClass2
{
    public static void main(String[] args)
    {
        child3 b=new child3();
        b.method1();
        b.method2();
        b.method3();
    }
}
