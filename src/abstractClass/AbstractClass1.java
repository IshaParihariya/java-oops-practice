/*

Abstraction class and methods :

NOTE: Top-level abstract class cannot be static
      Inner abstract class CAN be static***
-> because static class and methods cant be overridden because are static methods hidden(method hidding)
and they belong to the class(compile time)
not object and overridding is becasue of object

Abstract class is declared using abstract keyword

object of abstract class cannot be created

Can contain abstract and non-abstract methods

Abstract methods have no body 

Child class must override all abstract methods

Abstract class can have constructors, variables, static & final methods

Used to achieve abstraction and runtime polymorphism

Uses extends keyword

Abstract class does NOT need an abstract method***

Abstract method is used only when enforcement is needed

A class is abstract because of the abstract keyword, not because of method overriding.*** so no overriding
still its an abstract class becuase of the keyword abstract.

*/

// KFC with diff branches 
/*
    recipe same for all
    festiveOffers may differ
    billing system may differ
*/
package abstractClass;

 abstract class KFC //parent abstract class
{
    KFC() //parent constructor
    {
        System.out.println("KFC");
        
    }
    public final void Recipe()   //final method-Recipe => cannot be overridden
    {
        System.out.println("1. 2 kg flour "+"2. litre of water "+"3. x gm chillie "+"4. y gm salt");
    }
    
    public abstract void festiveOffers();  //abstract method1 - festiveOffer
    
    public abstract void Billing(); //abstract method2 - Billing
}
class KFCindia extends KFC
{
    KFCindia()
    {
        System.out.println("---KFC for India---");    
    }
    public void festiveOffers()  //overridden method1 - festiveOffer
    {
    System.out.println("Diwali offer 20% off "+"\n Holi offer 10%");
    }

    public void Billing() //overridden method2 - Billing
    {
    System.out.println("1. burger: 150rs "+ "2. coke: 50rs "+"3. roll:120rs");
    }
}
class KFCchina extends KFC
{
    KFCchina()
    {
        System.out.println("---KFC for China---");
        
    }
    public void festiveOffers()  //overridden method1 - festiveOffer
    {
    System.out.println("New Year offer 30% off "+"\n Spring Festival offer 10%");
    }

    public void Billing() //overridden method2 - Billing
    {
    System.out.println("1. burger: 12.5 Yuan "+ "2. coke: 3 Yuan "+"3. roll:11 Yuan ");
    }
}

public class AbstractClass1
{
    public static void main(String[] args)
    {
        KFC obj1=new KFCindia(); //refernce of parent class holding child class object
        obj1.Recipe();
        obj1.festiveOffers();
        obj1.Billing();
        KFC obj = new KFCchina();
        obj.Recipe();
        obj.festiveOffers();
        obj.Billing();
        
    }
}
