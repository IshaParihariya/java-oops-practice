// method 1
package awt;

import java.awt.*;

public class AWTMethod1
{
    public static void main(String[] args)
    {
        // created Frame and setLayout so sizes of components dont occupy the whole window
       Frame f=new Frame("My First AWT App");  // frame with title
       FlowLayout fl=new FlowLayout(); // to keep components on the Frame with their original sizes like button here
       f.setLayout(fl);
       
       // adding components
       Label l=new Label("Name "); // label
       l.setBackground(Color.white);
       TextField tf= new TextField(30); // single line text of size 30
        Button b=new Button("OK"); // button with label 
       
       // add : for adding the components on the Frame 
       f.add(l); // adding the label
       f.add(tf); // added the TextField 
       f.add(b);  // added the button on the Frame
       
               
       // these all can be done in the last
       f.setSize(500,400); // setting the size 
       f.setBackground(Color.black);
       f.setVisible(true); // setting the frame visible
       
    }  
}
