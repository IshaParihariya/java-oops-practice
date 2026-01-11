
/* INTERFACES: FEATURES***
An interface is a blueprint that defines what a class must do, not how it does it.
eg:    class phone (parent child) ***
      -> methods : call() , sms()
interfaces : camera , recorder , etc features
      class smartphone (child class)
      -> methoods inherited fro phone class : call() , sms() 

implemneting features(interfaces)
interfaces have abstract methods that need to be overridden ****
interface cannot have objects***
A class uses implements, not extends
A class must override all methods***
Interface supports multiple inheritance

*/

package interfaces;

class phone //parent class : phone
{
    void call() //method call
    {
        System.out.println("phone call");
    }
    void sms() // method sms
    {
        System.out.println("phone sms");
    }
}
interface Icamera // inerface
{ //abstract method1
    void photo(); //interfaces have abstract methods that need to be overridden ****
}
interface Irecorder
{ //abstract method2
    void record();
}
class smartphone extends phone implements Icamera, Irecorder
{
    @Override
    public void photo()  /*
            Interface methods are public and abstract by deault.**
            While overriding them, the implementing class must declare the methods 
            as public, otherwise Java throws a compile-time error due to reduced access level.
            */
    {
        System.out.println("photo cicking");
    }
    @Override
    public void record()
    {
        System.out.println("voice recording");
    }
    
    void videocall()
    {
        System.out.println("video calling");
    }
}
public class interface1
{
   public static void main(String[] args)
   {
       smartphone a=new smartphone();
       System.out.println("---phone methods---");
       a.call();
       a.sms();
       System.out.println("--smartphone methods and interfaces methods overridden---");
       a.photo();
       a.record();
       a.videocall();
   }
}
