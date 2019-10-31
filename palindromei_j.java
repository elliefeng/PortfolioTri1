
/**
 * Write a description of class palindromei_j here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*;
public class palindromei_j
{
    scannerIO scan = new scannerIO();
    public void getPalindrome2()
    {    
        if (isPal()==true){
            scannerIO.printout("Your word is a palindrome!");
        }
        else{
            scannerIO.printout("Your word is NOT a palindrome!");
        }
    }
    public boolean isPal()
    {
        //Scanner sc = new Scanner (System.in);
        //scannerIO.printout("Please enter a word!");
        String original = scannerIO.stringInput("Please enter a word!");
        String pal = original.replaceAll("[^A-Za-z]+", "").toLowerCase();
      
        int start=0;
        int end=pal.length()-1;
        
        for (int i = 0; i <= pal.length(); i++) {
            for (int j = 0; j<= pal.length(); j++) {
                
                if(pal.charAt(start)==pal.charAt(end)){
                start++;
                end--;
                return true;
                }
                
                else{
                return false;
                }
             }
            }
        return false;
    }
}


