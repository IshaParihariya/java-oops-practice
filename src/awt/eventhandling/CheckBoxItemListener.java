
package awt.eventhandling;
import java.awt.*;
import java.awt.event.*;

class MyCheckBoxFrame extends Frame implements ItemListener
{
    Label l;
    Checkbox cb,cb1,cb2;
    
    public MyCheckBoxFrame()
    {
        super("Check Box and Item listener");
        setLayout(new FlowLayout());
        l=new Label("Nothing is selected");
        cb=new Checkbox("Java");
        cb1=new Checkbox("Python");
        cb2=new Checkbox("C++");
        
        // setting background and ItemListeners
        cb.setBackground(Color.pink);
        cb.addItemListener(this); // MyCheckBoxRadioButtonFrame will be the Item Listener
        cb1.setBackground(Color.yellow);
        cb1.addItemListener(this);
        cb2.setBackground(Color.lightGray);
        cb2.addItemListener(this);
        
        // adding the components
        add(l);
        add(cb);
        add(cb1);
        add(cb2);
    }
    // overriding the method itemStateChanged
    public void itemStateChanged(ItemEvent e) 
    {
        String s="";
        boolean cbState=cb.getState();
        boolean cb1State=cb1.getState();
        boolean cb2State=cb2.getState();
       if(cbState==true) // state == true means check box selected
        s=s+" "+cb.getLabel(); // getLabel gets the label
       
       if(cb1State==true)
        s=s+" "+cb1.getLabel();
       
       if(cb2State==true)
       s=s+" "+cb1.getLabel();
       
       if(s.isEmpty())
       s="Nothing is selected";
       
       l.setText(s+" ");
    }
    
}
public class CheckBoxItemListener 
{
    public static void main(String[] args)
    {
        MyCheckBoxFrame mf=new MyCheckBoxFrame ();
        mf.setSize(600,400);
        mf.setVisible(true);
    }
}
