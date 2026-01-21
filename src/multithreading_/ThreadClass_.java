/*
Multithreading = executing multiple tasks at the same time within a single program
multi-tasking : multiple process at the same time 

Steps to create thread using Thread class***
✅ Step 1: Extend Thread
✅ Step 2: Override run()
✅ Step 3: Create object
✅ Step 4: Call start() (NOT run())

- Thread class is in java.lang
- run() contains thread logic
- start() creates a new thread**
- Output is unpredictable
- Java does not support multiple inheritance → limitation of Thread class**

here in this example :
-there are two infinite loops but as the method is called first and it will never end 
-so the loop in the ain method will never execute so we used Threads
-so now both would be executed one by one 
-for sometime the 1st loop // HELLO
-then for sometime the 2nd loop // WORLD
*/
package multithreading_;
import java.lang.InterruptedException;
public class ThreadClass_ extends Thread // child class extends Threads(parent class)
{
    public void run() //overriding the run() method already there in the Threads  and its the start of the Threads like main 
    {
        try
        {
        int i=1;
        while(true) //while loop for printing HELLO infinity times
        {
            System.out.println(i+" HELLO"); 
            i++;
            /*
            Throws Checked Exception
          Must be handled using:
          try-catch OR
          throws InterruptedException
            */
            Thread.sleep(100); //Thread goes to Timed Waiting state for 0.1 s so now the other one will be printed**
        }
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        
    }
    public static void main(String[] args) // main method is exceuted first 
    {
        ThreadClass_ t=new ThreadClass_();// object of the child class
        
        t.start(); //built-in mrthod and need to used to start the Threads
        
        int i=1;
        while(true) //while loop for printing HELLO infinity times
        {
            System.out.println(i+" WORLD"); 
            i++;
        }
        
    }
}
/*
Output order is not fixed because threads run independently**
*/