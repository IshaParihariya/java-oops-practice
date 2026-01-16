 /*
  What does ESCAPE mean?
Escape means telling Java :
“Hey Java, don’t treat this character as special — treat it as a normal character.”

Why do we need escaping?
In Java, \ (backslash) is NOT a normal character.
It starts special sequences called escape sequences.
\n   → new line
\t   → tab
\"   → double quote
\\   → backslash

Solution: ESCAPE the backslash :
To write one \, you must type two \\:


=> Simple memory trick : 
-Constructor fails? → FileNotFoundException
-Read / Write / Close fails? → IOException

FileNotFoundException is a child

IOException is a parent
*/
package filehandling.outputstream;

import java.io.*; //for handling

public class FileOutputStream1
{
    public static void main(String[] args)
    {
        try
        {
        //fos is the object 
            //Why forward slash -> avoids escaping
        FileOutputStream fos=new FileOutputStream("C://Users//ishh1//OneDrive//Desktop//java/FileOutputStream1.txt"); //Creates the file (if not present)
        
        String str="hello my first file handling practice";
        fos.write(str.getBytes()); // getBytes() -> Converts String → bytes
        fos.close();
        }
        catch(FileNotFoundException e) //for FileOutputStream
        {
            System.out.println(e);
        }
        catch(IOException e) //for write() and close()
        {
            System.out.println(e);
        }
    }
    
}

/*
output in command prompt :
C:\Users\ishh1\OneDrive\Desktop\java>dir
 Volume in drive C is Windows-SSD
 Volume Serial Number is 443E-17C7

 Directory of C:\Users\ishh1\OneDrive\Desktop\java

01/16/2026  01:34 PM    <DIR>          .
01/16/2026  09:09 AM    <DIR>          ..
01/16/2026  01:34 PM                37 Hello.txt      //Hello.txt file created in java folder
               1 File(s)             37 bytes
               2 Dir(s)  389,778,825,216 bytes free

C:\Users\ishh1\OneDrive\Desktop\java>type Hello.txt  //to type file in the command 
hello my first file handling practice                 //text  
C:\Users\ishh1\OneDrive\Desktop\java>
*/
