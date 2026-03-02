/*
STREAM :
Stream does NOT change original data**

Stream = pipeline

Once data passes → finished

What are types of operations?

Answer:

1 Intermediate
2 Terminal

Question 3:

Example of intermediate operation?

Answer:

filter(), map()

Question 4:

Example of terminal operation?

Answer:

forEach(), collect()

*/
package streamapi;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

class StreamSort
{
    public void sort()
    {
        List<Integer> list=new ArrayList<>();
        
        list.add(10);
         list.add(1);
          list.add(3);
           list.add(11);
            list.add(8);
             list.add(2);
            
            /* 
             //printing the list initially
            System.out.println(list);
            
            //sorting the list
            Collections.sort(list);
            
            // printing after sorting
            // NOTE : but here we are changing the original list 
            // so we will use streams as it will not change the original list
            System.out.println(list);
*/
     
            // converting list to stream
            Stream<Integer> stream=list.stream();
            
            // now sorted stream
            Stream<Integer> sortedstream=stream.sorted();
            
            //iterating and printing the stream
            sortedstream.forEach(n->System.out.println(n)); // lambda
             
             // printing the list
             System.out.println(list);// Streams do NOT modify original collection
    }
    
    // IMP 
    public void sortdeveloperway()
    {
        List<Integer> list=new ArrayList<>();
        
        list.add(10);
         list.add(1);
          list.add(3);
           list.add(11);
            list.add(8);
             list.add(2);
            
             // cretaing list -> stream 
             // sorting the stream
             // iterating and printinh it
             
            // list.stream().sorted().forEach(n->System.out.println(n)); 
            // OR 
            
            // this is how a developer writes it 
                list.stream()
                    .sorted()
                    .forEach(n->System.out.println(n)); 
    }
}
public class StreamAPI 
{
    public static void main(String[] args)
    {
        StreamSort obj=new StreamSort();
        obj.sort();
        obj.sortdeveloperway();
    }
}
