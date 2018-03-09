import java.io.PrintWriter;
import java.util.Scanner;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kandrew
 */
public class DVD {
    //declare variables
    String title = "";
    String rating = "";
    int runtime = 0;
    String description = "";
    String genre = "";
    boolean threedimensional = false;
//create a no argument constructor
    public DVD()

    {
}
    public void write(PrintWriter pw)
   {
     pw.print(title+"\f");
     pw.print(rating+"\f");
     pw.print(runtime+"\f");
     pw.print(description+"\f");
     pw.print(genre+"\f");
     pw.print(threedimensional+"\f");
   }
      public boolean read(Scanner input)
    {
     try{
         title = input.next();
         rating = input.next(); 
         runtime = input.nextInt();
         description = input.next();
         genre = input.next();
         threedimensional = input.nextBoolean();
         return true;
     }
     catch(Exception ex)
     {
        return false;
     }
    }
    //method that returns a String composed of the title, genre, and rating
     public String toString()
    {
        return title + " " + genre + " " + rating;
     }
}



