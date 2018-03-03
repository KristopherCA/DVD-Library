
import java.io.File;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kris
 */
public class DVDFileFilter extends javax.swing.filechooser.FileFilter 
{   //  determine if the given file object is a text file
    public boolean accept(File f)
    {
     if(f.isDirectory())  // if its a folder, then return true so it will show in the list
       return true;

     String name = f.getName();
     name = name.toLowerCase(); // convert to lower case
     int ext = name.indexOf(".txt");  // look for .txt in the name

     if(ext >= 0)   // was there a .txt in the name
        return true; // yes
     else
        return false; // no
    }

    public String getDescription()
    {
     return "Text Files (*.txt)";   // return description to show up in dialog box
    }
}
