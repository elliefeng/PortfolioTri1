
/**
 * Write a description of class scannerIO here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class scannerIO
{
  public String strInput;
  public int intinput;
  public double doubInput;
  
  public scannerIO(){
      //what 
    }
 
  public static String stringInput(String msg){
      //System.out.print('\u000C');
      System.out.println(msg);
      Scanner sc = new Scanner(System.in);
      return sc.nextLine();
    }
    
  public static int integerInput(String msg){
      //System.out.print('\u000C');
      System.out.println(msg);
      Scanner sc = new Scanner(System.in);
      return sc.nextInt();
    }
    
  public static double doubleInput(String msg){
      //System.out.print('\u000C');
      System.out.println(msg);
      Scanner sc = new Scanner(System.in);
      return sc.nextDouble();
    }
    
  public static void printout(String answer){
      System.out.println(answer);
    }
    
  public static void printf(String text, double answer){
      String string=text+"%.2f";
      System.out.printf(string, answer);
    }
}
