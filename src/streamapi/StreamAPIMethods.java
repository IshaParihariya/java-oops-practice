/*
IMP METHODS :
filter()
map()
sorted()
forEach()
collect()
distinct()
limit()
count()
reduce()
*/
package streamapi;

import java.util.*;
import java.util.stream.Collectors;


class Methods
{
    public void filter()
    {
  /*
    filter() → Used to select data
Definition:

Filters elements based on condition.
    
    */
    
  List<Integer> list = List.of(1,2,3,4,4,5,6);

list.stream()
    .filter(n -> n > 10)
    .forEach(n->System.out.println(n));
    }
    
    public void map()
    {
        /*
        map() → Used to transform data
Definition:

Converts one form of data into another.
        */
        
      List<Integer> list = List.of(1,2,3,4,4,5,6); 
      list.stream().map(n->n*2).forEach(n->System.out.println(n));
     
    }
    
    public void sorted()
    {
     /*
        sorted() → Used to sort data
Definition:

Sorts elements.
        */
        
        List<Integer> list = List.of(5,2,8,1);

list.stream()
.sorted()
.forEach(System.out::println);
    }
    
    
    public void foreach()
    {
        /*
        forEach() → Used to iterate
Definition:

Performs action on each element.
        */
            
        List<Integer> list = List.of(5,2,8,1);
        list.stream()
.forEach(System.out::println);
    }
    
    public void collect()
    {
        /*
        collect() → Convert stream to List or se , etc
Definition:

Collect result into collection.
        */
        List<Integer> list = List.of(5,2,8,1);
        
        List<Integer> stream= list.stream()
                                      .filter(n->n>2)
                                      .collect(Collectors.toList());
        stream.forEach(n->System.out.println(n));
    }
    
    public void duplicate()
    {
      //  distinct() → Remove duplicates



List<Integer> list = List.of(1,2,2,3);

list.stream()
.distinct()
.forEach(System.out::println);
    }
    
    public void limit()
    {
       // limit() → Limit elements

List<Integer> list = List.of(1,2,2,3);

list.stream()
.limit(3)
.forEach(System.out::println);
    }
    
    public void count()
    {
       // count() → Count elements
List<Integer> list = List.of(1,2,2,3);

long c =
list.stream().count();

System.out.println(c);
    }
    

}
public class StreamAPIMethods
{
    public static void main(String[] args)
    {
        Methods obj=new Methods();
        obj.collect();
        obj.count();
        obj.duplicate();
        obj.filter();
        obj.foreach();
        obj.limit();
        obj.map();
        obj.sorted();
    }
}
