
/**
 * Write a description of class palindromesubstring here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*;
public class palindromesubstring
{
    public static void getPalindrome1()
    {
        //scannerIO scan = new scannerIO();
        //Scanner sc = new Scanner (System.in);
        //scan.printout("Please enter a word!");
        String original = scannerIO.stringInput("Please enter a word!");
        
        String pal = original.replaceAll("[^A-Za-z]+", "").toLowerCase();
        
        boolean isPal=true;
        int startPos=0;
        int endPos=pal.length() -1;
        
        //while loop that goes from outside to in from both ends of the word
        while(startPos<endPos){
            String startLetter=pal.substring(startPos, startPos+1);
            String endLetter=pal.substring(endPos, endPos+1);
            
            if (!startLetter.equals(endLetter)){
                scannerIO.printout(original+ " is NOT a palindrome");
                isPal=false;
                break;
            }
            startPos++;
            endPos--;
        }
        if(isPal==true){
            scannerIO.printout(original+ " is a palindrome");
        }
    }
}
