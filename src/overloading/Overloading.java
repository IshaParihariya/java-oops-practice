/*
OVERLOADING : 
Method Overloading means having multiple methods with the
same name in the same class, but with different parameter lists.

Methods must differ in:
-Number of parameters
-Type of parameters
-Order of parameters
*/
package overloading;

import java.math.*;
class area
{
   double area(double r) 
   {
       return Math.PI*r*r; 
   }
   
  double area(int l,int b)
   {
       return 2*l*b;
   }
   
   double area(int s)
   {
       return s*s;
   }  
}
public class Overloading 
{
    public static void main(String[] args)
    {
        area a=new area();
        double circle=a.area(2);
        System.out.println(circle);
        double rectangle=a.area(3);
        System.out.println(rectangle);
        double square=a.area(1, 4);
        System.out.println(square);
    }
}
