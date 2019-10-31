
/**
 * Write a description of class palindromerecursion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class palindromerecursion
{
    public static void getPalindrome3 ()
    {
        //scannerIO scan = new scannerIO();
        //Scanner sc = new Scanner(System.in);
        //scannerIO.printout("Please input a word: ");
        
        String input = scannerIO.stringInput("Please input a word: ");
        String temp = input.replaceAll("[^A-Za-z]+", "").toLowerCase();
        String reversed = reverse (temp);
        
        if (temp.equals(reversed)){
            scannerIO.printout("Your word is a palindrome!");
        }
        else{
            scannerIO.printout("Your word is NOT a palindrome!");
        }
    }
    
    //recursion method
    public static String reverse(String str){
        if (str.length() <= 1){
            return str;//basecase
        }
        else{
        return reverse(str.substring(1))+str.charAt(0);
    }
    }
}
