/*
Button & ActionListener :

When the button is clicked, it generates an ActionEvent 
which is received by the ActionListener, and the actionPerformed() method is executed.

An Application with a Label 0 and a Button 
on clicking the button the number keeps on increasing
*/
package awt.eventhandling;
import java.awt.*;  // importing awt package
import java.awt.event.*; // importing awt event package

class MyFrame extends Frame implements ActionListener // class extending Frame and implementing ActionListener
{
    int count=0;
    Label l; // props
    Button b;
    
    public MyFrame() // constructor
    {
        super("Button Test");
         setLayout(new FlowLayout());
        l=new Label("  "+count); // label doesnt take only int
        b=new Button("click");
        b.addActionListener(this);
        
        // setting background color 
        l.setBackground(Color.pink);
        b.setBackground(Color.yellow);
        
        // adding the components in the Frame
        add(l);
        add(b);
    }
    // overriding the actionPerormed method
    //Java automatically calls it when button is clicked.**
    public void actionPerformed(ActionEvent e)
    {
        count++;
        l.setText("   "+count+"   ");
    }
}
public class ButtonAndActionListener
{
    public static void main(String[] args)
    {
        MyFrame mf=new MyFrame(); //object of the class
        mf.setSize(300,200);
        mf.setVisible(true);
    }
}
