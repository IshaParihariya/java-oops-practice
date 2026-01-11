
// paramatrised constructors in inheritance

package oops.inheritance;

 class parent 
    {
        parent(int a) //parent constructor
        {
          System.out.println("parent constructor");
        }
    }
   class child extends parent 
    {
      
        child(int a) // child constructor
        {
            super(a); /*super() is used to invoke the constructor of the immediate 
                        parent class and ensures that the parent class is initialized before the child class.*/
           System.out.println("child constructor"); 
        }
    }
public class inheritance3 
{
    
    public static void main(String[] args)
    {
       child a=new child(1); 
    }
}
