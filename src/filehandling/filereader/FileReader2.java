/*
just like FileInputStream  FileReader also returns int again due to same reason of EOF = -1**
*/
package filehandling.filereader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class FileReader2 
{
    public static void main(String[] args)
    {
        try
        {
            //read mode file
        FileReader fr=new FileReader("C://Users//ishh1//OneDrive//Desktop//java/FileWriter1.txt");
        int x;
        
        while((x=fr.read())!=-1) //EOF i.e., end of file : return -1
        {
            System.out.print((char)x); //type casting
        }
        System.out.println();
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
