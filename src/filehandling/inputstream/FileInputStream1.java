/*
FileInputStream : reading 

*/
package filehandling.inputstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
public class FileInputStream1
{
    public static void main(String[] args)
    {
        try
        {
            FileInputStream fis=new FileInputStream("C://Users//ishh1//OneDrive//Desktop//java/FileOutputStream2.txt");
            
            byte b[]=new byte[fis.available()];// Returns number of bytes available to read from the file 
            fis.read(b); //reading file and storing in b array 
            
            String str=new String(b);//new string to convert from byte to string as we need to print it in Netbeans
            System.out.println("data read from the file is : \n  "+str);
            fis.close();
         }
        catch (FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch(IOException e)
        {
             System.out.println(e);
        }
        
    }
}
