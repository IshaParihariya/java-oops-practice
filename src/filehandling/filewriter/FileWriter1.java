/*
FileWriter is used to write character
data to a file. It creates the file if it does
not exist and overwrites the file by default.

FileWriter :
-Accepts char / String
-Automatically converts characters → bytes
-Uses character encoding
-No need for getBytes()

FileOutputStream :
        -Accepts bytes only***
        -Does NOT understand characters or strings
        -You must convert String → bytes manually
FileWriter writes character data and handles conversion internally, 
whereas FileOutputStream writes raw bytes, so getBytes() is required when writing strings.
   
*/
package filehandling.filewriter;

import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileWriter1
{
    public static void main(String[] args)
    {
        try
        {//open file in write mode or create file if doesnt exist
        FileWriter fw=new FileWriter("C://Users//ishh1//OneDrive//Desktop//java/FileWriter1.txt");
        
        String str="ISHA PARIHARIYA";
        //writing the string 
        fw.write(str);
        //closing the resources
        fw.close();
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
/*
output on command prompt :
C:\Users\ishh1\OneDrive\Desktop\java>type FileWriter1.txt
ISHA PARIHARIYA
*/