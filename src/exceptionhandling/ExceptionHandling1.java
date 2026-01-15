/*
ArithmeticException 

exception handling : divide by zero program

with ArithmeticException 

*/
package exceptionhandling;

import java.util.Scanner;  // for taking i/p 
import java.lang.Exception; //for exception handling


class ExceptionHandling//class
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
    public void exceptionhandling() //method for try catch 
    {
        
       try //try block
       {
         if(divisor!=0)
         {
           System.out.println(dividend+"/"+divisor+" : "+dividend/divisor);
         }
         else 
         {
         /* 
             throw divisor; => -throw can throw only objects of Throwable
                               -divisor is an int
                               -Primitive types cannot be thrown
         */
             throw new ArithmeticException("divided by zero"); //throw statement
         }
       }
       catch(ArithmeticException e)  //catch block
       {
           System.out.println("Error : "+ e.getMessage());  /*
            e.getMessage() -> used for ptinting the message thwon 
                                                             */
       }
       finally//finally block => will execute for sure
       {
           System.out.println("---program ended--");
       }
    }
}
public class ExceptionHandling1 
{
    public static void main(String[] args)
    {    
        ExceptionHandling a=new ExceptionHandling();//object of class ExceptionHandling
        a.scanner(); //method call
        a.exceptionhandling();//method calling
    }    
}
