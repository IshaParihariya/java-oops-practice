// method 2 : class extending from Frame
package awt;
import java.awt.*;

class MyFrame extends Frame // MyFrame extending from Frame 
{
  Label l; // label 
  TextField tf; // text field
  Button b; // button 
  
  public MyFrame() // constructor of the class MyFrame
  {
      setLayout(new FlowLayout()); // setting the layout
      tf=new TextField(40); // size of the text field 40
      b=new Button("submit");
      l=new Label("Name ");
      
      // adding the components
      add(l); // adding label
      add(tf); // adding textfield
      add(b); // adding button
  }
  
  public void labelBackground()
  {
      l.setBackground(Color.PINK);
  }
  
  public void frameBackground()
  {
      setBackground(Color.BLACK);
  }
}

public class AWTMethod2 
{
    public static void main(String[] args)
    {
        MyFrame mf=new MyFrame(); // object creation
        
        mf.frameBackground(); // emthod calling for frame background
        
        mf.labelBackground(); // method calling for label background
        
        mf.setSize(500, 500); // setting size
        mf.setVisible(true);// setting visibility
        
        
    }
}
