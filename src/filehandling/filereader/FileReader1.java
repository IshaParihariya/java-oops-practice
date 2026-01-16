/* WHYY?? 
available() is for byte streams, not for character readers.** 

Reason:
-FileReader → character reader
-Characters depend on encoding (UTF-8, UTF-16, etc.)
1 character ≠ 1 byte always
-Java cannot know in advance how many characters will be produced
-So size is unpredictable
*/
package filehandling.filereader;

import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReader1
{
    public static void main(String[] args)
    {
        try
        {
            //read mode 
       FileReader fr=new FileReader("C://Users//ishh1//OneDrive//Desktop//java/FileWriter1.txt");
        
        //char c[]=new char[ffw.available()];
        /*
        available() can be used with byte streams like FileInputStream because bytes are countable, 
        but it is not available for FileReader since character count depends on encoding 
        and cannot be determined in advance.**
        */
        
        char c[]=new char[100]; //character array c of size 100
        //read file and store in array c of character 
        fr.read(c);
        System.out.println(c);
        fr.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }    
}
