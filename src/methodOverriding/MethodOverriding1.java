
// method overridding

package methodOverriding;

class parent
{
    public void area(int length,int breadth)
    {
      int area=length*breadth; 
      System.out.println("area1 : "+area);
    }   
}
class child extends parent
{
    @Override
    public void area(int length,int breadth)
    {
        int a=length*breadth;
        System.out.println("area2 : "+a);
    }
}

public class MethodOverriding1 
{
    
    public static void main(String[] args)
    {
        parent p=new child(); //dynamic method dispatch
        p.area(2,3);
    }
}
