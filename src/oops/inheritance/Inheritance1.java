
// INHERITANCE 

// main method must be inside a class java only understands packages class and all

package oops.inheritance;

public class Inheritance1 //outer class
{
    // outer class cannot be static but inners classes can be
  static class animal  // inner class animal
  {
      public void walk()
      {
          System.out.println(" i can walk ");
      }
  }
  static class bird extends animal // inner class bird inherited from animal
  {
      public void sing()
      {
          System.out.println(" i can sing ");
      }
      public void dance()
      {
          System.out.println(" i can dance ");
      }
  }
  public static void main(String[] args) 
  {
      bird b= new bird();  // object
      b.walk();
      b.sing();
      b.dance();
      
  }
}
