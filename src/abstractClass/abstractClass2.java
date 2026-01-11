
package abstractClass;

abstract class parent
{
    parent()
    {
   System.out.println("ABSTRACT CLASS 1 : parent"); 
    }
}
abstract class child1 extends parent
{
   child1()
    {
   System.out.println("ABSTRACT CLASS 2 : child1"); 
    } 
}
abstract class child2 extends child1
{
    child2()
    {
   System.out.println("ABSTRACT CLASS 3 : child2"); 
    } 
    
    
}
class child3 extends child2
{
    child3()
    {
        System.out.println(" concrete CLASS 1 : child3"); 
    }
    
}

public class abstractClass2
{
    public static void main(String[] args)
    {
        parent a=new child3();
    }
}
