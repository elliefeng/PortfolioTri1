
/**
 * Write a description of class mathfunlab here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class mathfunlab
{
public static void math() //method math
    {
    scannerIO scan = new scannerIO();
        
    System.out.println('\u000C');
        
    int answer1 = 4+9; 
    scan.printout("4 + 9 = " + answer1);
        
    int answer2 = 46/7;
    scan.printout("46 / 7 = " + answer2);
        
    int answer3 = 46%7;
    scan.printout("46 % 7 = " + answer3);
        
    double answer4 = 2*3.0;
    scan.printout("2 * 3.0 = " + answer4);
        
    double answer5 = 25/4;
    scan.printout("(double) 25 / 4 = " + answer5);
        
    int answer6 = (int)7.75 + (int)2.00;
    scan.printout("(int) 7.75 + 2 = " + answer6);
        
    int answer7 = 'p';
    scan.printout("(int) 'p' = " + answer7);
        
    char answer8 = 105;
    scan.printout("(char)105 = " + answer8);
        
    scan.printout("The largest value of type byte = " + Byte.MAX_VALUE);
    scan.printout("The smallest value of type byte = " + Byte.MIN_VALUE);
    scan.printout("The largest value of type short = " + Short.MAX_VALUE);
    scan.printout("The smallest value of type short = " + Short.MIN_VALUE);
    scan.printout("The largest value of type char = " + Character.MAX_VALUE);
    scan.printout("The smallest value of type char = " + Character.MIN_VALUE);
    scan.printout("The largest value of type int = " + Integer.MAX_VALUE);
    scan.printout("The smallest value of type int = " + Integer.MIN_VALUE);
    scan.printout("The largest value of type long = " + Long.MAX_VALUE);
    scan.printout("The smallest value of type long = " + Long.MAX_VALUE);
    scan.printout("The largest value of type float = " + Float.MAX_VALUE);
    scan.printout("The smallest value of type float = " + Float.MIN_VALUE);
    scan.printout("The largest value of type double = " + Double.MAX_VALUE);
    scan.printout("The smallest value of type double = " + Double.MIN_VALUE);
        
    }
}
