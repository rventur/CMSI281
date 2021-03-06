/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * File name  :  SayHello.java
 * Purpose    :
 * @author    :  Alejandra Vasquez
 * @author    :
 * Date       :  2018-08-29
 * Description:  Greets user after user inputs their name
 *
 * Notes      :  None
 * Warnings   :  None
 *
 *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

import java.util.Scanner;

public class SayHello {
  public static void main( String args[] ) {
   String input = "World";
   String n = "Hello, " + input + "!";
   System.out.println(n);

   Scanner myInput = new Scanner( System.in );
   System.out.println("What is your name? ");
   String inputName = myInput.nextLine();

   n = "Hello, " + inputName + "!";
   System.out.println(n);
  }
}
