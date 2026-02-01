
package awt.eventhandling;
import java.awt.*;
import java.awt.event.*;

class MyRadioButtonFrame extends Frame implements ItemListener
{
    Label l;
    Checkbox cb,cb1,cb2;
    CheckboxGroup cbg;// for radio button
    
    public MyRadioButtonFrame()
    {
        super("Radio button and Item listener");
        setLayout(new FlowLayout());
        l=new Label("Nothing is selected");
        
        cbg=new CheckboxGroup(); 
        cb=new Checkbox("Java",false,cbg); // false means the radio button would be unchecked initially*
        cb1=new Checkbox("python",false,cbg);
        cb2=new Checkbox("C++",false,cbg);
        
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
public class RadioButtonItemListener
{
    public static void main(String[] args)
    {
         MyRadioButtonFrame mf=new MyRadioButtonFrame ();
        mf.setSize(600,400);
        mf.setVisible(true);
        
    }
}
