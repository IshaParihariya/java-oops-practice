

package interfaces;

import java.util.*; //for taking input
import java.lang.Exception; //for exceptions

interface Iarithmetic
{
    int sum(int n); // sum of factors of n 
}
interface Iaddition
{
    int add(int a,int b);
}
interface Isubtraction
{
    int sub(int a,int b);
}
interface Imultiplication
{
    int mult(int a,int b);
}
interface Idivision
{
    int div(int a,int b);
            
}

class calculator implements Iarithmetic,Iaddition,Isubtraction,Imultiplication,Idivision
{
    @Override
    public int sum(int n)
    {
        int sum=0;
       if(n==0)
       {
           return 0;
       }
       else if(n>0)
       {
           for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
            sum=sum+i;
            }
        }
        return sum;
       }
       else 
           return -1;   // for n<-1 (negative input)
    }
    @Override
    public int add(int a,int b)
    {
        int add;
        if(a>0&b>0)
        {
        add=a+b;
        return add;
        }
        else 
            return -1;
    }
    @Override
    public int sub(int a,int b)
    {
        
        int sub;
        if(a>0&b>0)
        {
        sub=a-b;
        return sub;
        }
        else 
            return -1;
        
    }
    @Override
    public int mult(int a,int b)
    {
        int mult;
        mult=a*b;
        return mult;
    }
    @Override
    public int div(int a,int b)
    {
        int div;
       div=a/b;
        return div;
    }
}

public class Interface2
{
    public static void main(String[] args)
    {
        calculator c=new calculator();
        int sum=c.sum(6);
        System.out.println("sum of factors: "+ sum);
        int add=c.add(2, 3);
        System.out.println("addition : "+add);
        int sub=c.sub(10, -5);
        System.out.println("subtaction : " +sub);
        int mult=c.mult(2, -7);
        System.out.println("multiplication : " +mult);
        int div=c.div(2, 1);
        System.out.println("division : " +div);
    }
}
