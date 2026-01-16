/*
try with resources :

try (resource declaration) {
    // use resource
}

-try-with-resources must have a block { }
-You ended the try line with ;, which is not allowed
-You should NOT call fos.close() inside try-with-resources
→ Java does it automatically
*/
package filehandling.outputstream;

import java.io.*; //for handling

public class FileOutputStream3
{
    public static void main(String[] args) throws Exception //throws all possible exceptions
    {
        
        //fos is the object 
            //Why forward slash -> avoids escaping
        try(FileOutputStream fos=new FileOutputStream("C://Users//ishh1//OneDrive//Desktop//java/FileOutputStream3.txt")) //Creates the file (if not present)
        {
        String str="hello my first file handling practice";
        fos.write(str.getBytes());// getBytes() -> Converts String → bytes
        /*
        FileOutputStream
        -Accepts bytes only***
        -Does NOT understand characters or strings
        -You must convert String → bytes manually
        */
        //fos.close();
        }      
    }
    
}