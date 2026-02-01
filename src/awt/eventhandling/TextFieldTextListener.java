/*
for TextField as siple text and as password
*/

// TWO DIFFERENT FRAMES FOR EACH
package awt.eventhandling;
import java.awt.*;
import java.awt.event.*;

class MyTextFieldFrame extends Frame 
{
    // props
    Label l1,l2;
    TextField tf;
    
    // constructor
    public MyTextFieldFrame()
    {
       super("Text field and Text event"); 
       setLayout(new FlowLayout()); // layout set
       
       l1=new Label("No Text entered. The TextField is empty");
       l2=new Label("Enter key hasnt been hit yet"); // label 2 will be used as a button here
       //tf=new TextField("can give here some string it eill be printed in the text field");
       tf=new TextField(30);//giving size 30
       
       // listeners
       //tf.addTextListener(this); => using the same Frame as listener might crash the program so create an another inner class fro handling the Events
       //tf.addActionListener(this);
       // 
       
       //object of Inner Class Handler
       Handler h=new Handler();
       
       //listeners
       tf.addTextListener(h);
        tf.addActionListener(h);
       
       
       // window closing as the Frames might hide another one if nor closed 
     /*    // Window close handling
       addWindowListener(new WindowAdapter() {
           public void windowClosing(WindowEvent e) {
               dispose();
           }
       
       });
       */
     
       // adding the components
       add(l1);
       add(tf);
       add(l2);
    }

    
    //inner class for handling the Events**
    class Handler implements TextListener,ActionListener
    {
        // overriding textValueChanged()
    @Override
    public void textValueChanged(TextEvent e) 
    {
        // label 1 will get the Text same as the TextField
       l1.setText(tf.getText());
       
       if(tf.getText().isEmpty())
           l1.setText("No Text entered. The TextField is empty");
    }
    //overriding actionPerformed()
    @Override
    public void actionPerformed(ActionEvent e)
    {
        // on clicking enter the text from the textfield gets here
        l2.setText(tf.getText());
    }
    }
    
}


// class for TextField when there's a password
class MyPasswordFrame extends Frame 
{
   Label l1,l2; 
   TextField tf;
   
   //constructor
   public MyPasswordFrame()
   {
       setLayout(new FlowLayout());
       l1=new Label("Enter the password");
       l2=new Label("password hasnt been enetered yet!");// on clicking enter it will pass a msg that password entered so will act as a button
       tf=new TextField(30);
       tf.setEchoChar('*'); //setting text as password ****** 
       
       
       //obj of Handler inner class
       Handler h=new Handler();
       // listeners
   
       tf.addActionListener(h);
       
            // window closing as the Frames might hide another one if nor closed 
     /*    // Window close handling
       addWindowListener(new WindowAdapter() {
           public void windowClosing(WindowEvent e) {
               dispose();
           }
       
       });
       */
       //adding components in the Frame
       add(l1);
       add(tf);
       add(l2);
       
   }
  
  // inner Handler Class
   class Handler implements ActionListener
   {
       // this also works but password must be hidden while typing so added there
 /*   public void textValueChanged(TextEvent e)
   {
       tf.setEchoChar('*'); //' ' as its saying a char
   }
*/
   // overiding method
   @Override
   public void actionPerformed(ActionEvent e)
   {
       l2.setText("The password has been entered"); // on clicking enter
   } 
   }
}
public class TextFieldTextListener 
{
    public static void main(String[] args)
    {
        MyTextFieldFrame m=new MyTextFieldFrame();
        m.setSize(400,500);
        m.setVisible(true);
        
        MyPasswordFrame p=new MyPasswordFrame();
        p.setSize(400,500);
        p.setVisible(true);
    }
}
