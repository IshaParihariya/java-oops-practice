/*
USER-DEFINED EXCEPTIONS :
NOTE : A custom exception must extend Exception or RuntimeException**
divide by zero program

-> Why extends Exception?
Because:
To make MyException throwable and catchable.
Only classes that extend Throwable can be:
-thrown using throw
-caught using catch

*/
package exceptionhandling;
import java.util.Scanner;  // for taking i/p 
import java.lang.Exception; //for exception handling

class Exceptions //Exceptions class
{
    public int  dividend;
    public int divisor;
    
    public void scanner() //method for taking i/p
    {
        System.out.print("Enter the dividend : ");
        Scanner sc=new Scanner(System.in);
        dividend=sc.nextInt();
        System.out.print("Enter the divisor : ");
        divisor=sc.nextInt();    
    }
    public void method()
    {
        try
        {
       if(divisor!=0)
       {
            System.out.println(dividend+"/"+divisor+" : "+dividend/divisor);
       }
       else
       {
           throw new MyException("divided by zero");
       }
        }
        catch(MyException e)
        {
            System.out.println("Error : "+e.getMessage());
        }
        finally
        {
            System.out.println("---program ended--");
        }
 
    }
}
//A custom exception must extend Exception or RuntimeException**
//Java’s built-in Exception class
class MyException extends Exception //child class of Exceptions
{
   public MyException(String msg) //constructor
    {
        super(msg);
    }
}
public class ExceptionHandling2
{
    public static void main(String[] args)
    {
       Exceptions a=new Exceptions();
       a.scanner();
       a.method();
    }   
}
