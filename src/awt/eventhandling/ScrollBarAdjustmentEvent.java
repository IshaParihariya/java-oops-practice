/*
// Scrollbar : In AWT is used to select values within a range.

Scrollbar sb = new Scrollbar(orientation, value, visible, min, max);
orientation	VERTICAL / HORIZONTAL
value	Starting value
visible	Size of thumb
min	Minimum value
max	Maximum value

Start from value means the initial value of the scrollbar when the program starts.*

// BOUNDS : 
-> Bounds = Area + Position of a component
setBounds(int x, int y, int width, int height);
x	Distance from left
y	Distance from top
width	Component width
height	Component height
*/
package awt.eventhandling;
import java.awt.*;
import java.awt.event.*;


class MyScrollbarFrame extends Frame
{
    Scrollbar g,b,r; // green blue red colors
    TextField tf;
    Label l;
    
    public MyScrollbarFrame() // constructor
    {
        super("Scrollbar AdjustmentEvent");
        setLayout(null);
        g=new Scrollbar(Scrollbar.HORIZONTAL,0,10,0,255);// we are taking colors and they are like 256 so 
        b=new Scrollbar(Scrollbar.HORIZONTAL,0,10,0,255);
        r=new Scrollbar(Scrollbar.HORIZONTAL,0,10,0,255);
        tf=new TextField(20);
        l=new Label("Please slide it left or right to change the color.");
        
        //setted layout null so we adding our own layout
        tf.setBounds(50,50,400,100);
        g.setBounds(50,200,400,50);
        b.setBounds(50,250,400,50);
        r.setBounds(50,300,400,50);      
        
        //adding the components on the frame
        add(tf);
        add(g);
        add(b);
        add(r);
        
        //listeners
        Handler h=new Handler();
        g.addAdjustmentListener(h);
        b.addAdjustmentListener(h);
        r.addAdjustmentListener(h);
    }
    // handler
    class Handler implements AdjustmentListener
    {
        @Override
        public void adjustmentValueChanged(AdjustmentEvent e)
        {
           // on sliding color changes as per the values of the r , b and g
           tf.setBackground(new Color(r.getValue(),b.getValue(),g.getValue()));
        }
    }
}
public class ScrollBarAdjustmentEvent 
{
    public static void main(String[] args)
    {
        MyScrollbarFrame ms=new MyScrollbarFrame();
        ms.setSize(600,600);
        ms.setVisible(true);
    }
}
