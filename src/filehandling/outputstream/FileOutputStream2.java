/*
same OutputStream1 with loop plus additional thing 
*/
package filehandling.outputstream;

import java.io.FileOutputStream;
import java.io.FileNotFoundException; //for FileNotFoundException
import java.io.IOException;
public class FileOutputStream2 
{
    public static void main(String[] args)
    {
        try
        {
      FileOutputStream fos=new FileOutputStream("C://Users//ishh1//OneDrive//Desktop//java/FileOutputStream2.txt"); //s is the refernce 
      
      String str="Hello1.txt file\n";
      String str1="Learn Java Programming\n";
      
      byte b[]=str.getBytes(); //array of bytes of the String
      byte c[]=str1.getBytes();
      
      fos.write(c, 6, str1.length()-6); //start from 6th index and take str.length-6 bytes i.e; "Learn " isnt counted 
      for (byte x:b)
      {
         // fos.write(b); => writes the whole array multiple times
          fos.write(x); // writes each byte and hence the whole array 
      }
      fos.close();
        }
        catch(FileNotFoundException e) //for FileOutputStream
        {
            System.out.println(e);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
    
}
/*

for deleting file in command prompt :
del filename.txt **

output in command prompt : 

C:\Users\ishh1\OneDrive\Desktop\java>type Hello1.txt
Java Programming
Hello1.txt file

C:\Users\ishh1\OneDrive\Desktop\java>

*/
