
package awt.eventhandling;
import java.awt.*;
import java.awt.event.*;

class MyTextAreaFrame extends Frame
{
    //data members
    TextArea ta;
    Label l;
    TextField tf;
    Button b1,b2;
    // constructor 
    public MyTextAreaFrame()
    {
       super("TextArea Operations");
       setLayout(new FlowLayout()); 
       ta=new TextArea(10,30); // rows and columns for text area
       l=new Label("No text enetered");
       tf=new TextField(20);
       b1=new Button("Append the text from Tf");
       b2=new Button("Inert at Caret position");
       
       // adding the components
       add(ta);
       add(l);
       add(tf);
       add(b1);
       add(b2);
       
       // obj of Handler class
       Handler h=new Handler();
       
       //Listeners
       b1.addActionListener(h); // for clicking button b1
       b2.addActionListener(h);// for clicking on the button b2
       tf.addActionListener(h); // on clicking enter the label will be changed to ..
    }
    // inner class for handling the events
    class Handler implements ActionListener 
    {
        // on clicking the button the text from text field need to get to text area
        @Override
        public void actionPerformed(ActionEvent e)
        {
            // b1 is clicked
            if(e.getSource()==b1)
            ta.append(tf.getText()); // append adds the text in the end 
            //b2 is clicked
            if(e.getSource()==b2)
                ta.insert(tf.getText(), ta.getCaretPosition()); // insert the text where the cursor is
            // on clicking enter the Label will be changed
            if(e.getSource()==tf)
                l.setText("Text Entered int the Text Field!");
        }
        
        // for the Label to be changed
    }
    
}
public class TextAreaOperations
{
    public static void main(String[] args)
    {
        MyTextAreaFrame ma=new MyTextAreaFrame();
        ma.setSize(600,600);
        ma.setVisible(true);
    }
}
