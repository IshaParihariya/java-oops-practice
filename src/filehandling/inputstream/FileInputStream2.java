/* why read() return int value???

Problem with byte : 
-byte can store only -128 to +127
-But file bytes can be 0 to 255
-AND Java also needs -1 for EOF
-byte is too small

Why int works
-int can store:
0–255 → file data
-1 → end of file
- One variable handles both data + stop signal

-> byte → small cup (can’t hold EOF signal) => EOF(end of file): return -1 
-> int → big cup (can hold data + EOF flag)

Type casting = converting one data type into another
*/
package filehandling.inputstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
public class FileInputStream2 
{
    public static void main(String[] args)
    {
        try
        {
            FileInputStream fis;
            fis=new FileInputStream("C://Users//ishh1//OneDrive//Desktop//java/FileOutputStream2.txt"); //enter file in read mode
            
            int x;
            /* Although file data is stored as bytes, FileInputStream.read() returns an int because 
                                it must represent all byte values (0–255) and the special EOF value -1, 
                                       which cannot be safely stored in a byte.
            -> byte → small cup (can’t hold EOF signal) => EOF(end of file): return -1 
            -> int → big cup (can hold data + EOF flag)
            */
                    
            
            while((x=fis.read())!=-1)
            {
                // System.out.print(x); => prints numbers 
                System.out.print((char)x); //Type casting = converting one data type into another
                /*
                Converts byte value → character
                Makes file content readable
                */
            }
          fis.close();
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
