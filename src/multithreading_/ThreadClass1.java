/*
sleep() : sleep() pauses the execution of the current thread for a specified time and throws InterruptedException.

Without sleep()
➡️ One thread may finish very fast before another gets CPU time.

With sleep()
➡️ Threads pause + resume, so CPU switches between them → looks like real multitasking.

- Thread class is in java.lang
- run() contains thread logic
- start() creates a new thread**
- Output is unpredictable
- Java does not support multiple inheritance → limitation of Thread class**

Throws Checked Exception**
          Must be handled using:
          try-catch OR
          throws InterruptedException
           
EXAMPLE :

-while typing in the word
-typing , text appearing on the screen , cpu processes , speelling corrections
-all are happenning ALMOST simultaneously 

*/
package multithreading_;

public class ThreadClass1 extends Thread // class extends Thread
{
    public void run() // typing ( run() overridden ) //start of the Thread
    {
        int i=1;
         while(i<=100)
         {
        System.out.println("TYPING ON THE KEYBOARD");
        i++;
         }
    }
   public static void main(String[] args)
   {
       ThreadClass1 t=new ThreadClass1(); //object of ThreadClass1
       //typing 
       t.start(); //starting the thread so run() is called ***
       int i=1;
       while(i<=50)
       {
           // text on the screen 
        System.out.println("TEXT APPEARING ON THE SCREEN");
         //cpu processing
        System.out.println("CPU PROCESSING"); 
        //spelling corrections
        System.out.println("SPELLING CORRECTION");
        i++;
       }
        
   }
}
