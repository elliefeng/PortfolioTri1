/**
 * Write a description of class countdownsong here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class countdownsong
{
    public static void song() //method song
    {
        //scannerIO scan = new scannerIO();
        
        //Scanner myJumper = new Scanner(System.in);
        //scan.printout("Enter a jumper name:");
        //Scanner myCountdown = new Scanner(System.in);
        //scan.printout("Enter a number of jumps:");
        //String jumperName = myJumper.nextLine();
        String bedJumpers = scannerIO.stringInput("Enter a jumper name: ");
        //scannerIO.printout("Your jumper name is: "+bedJumpers);
        int countdown = scannerIO.integerInput("Enter a number of jumps: ");
        //scannerIO.printout("Your number of jumps is: "+countdown);
        
        int i = countdown;
        
        String space = " ";
        while (i > -1) { 
            if (i == 0) { 
                scannerIO.printout("Zero little" + space + bedJumpers);
            } else {
                String octal = Integer.toOctalString(i);
                scannerIO.printout(octal + space + "little" + space + bedJumpers + space + "jumping on the bed");
                scannerIO.printout("One fell off and broke his head");
                scannerIO.printout("Mama called the doctor and the doctor said");
                scannerIO.printout("no more" + space + bedJumpers + space + "jumping on the bed.");
            }
            i--; 
        }    
    }
    }