/**
 * Write a description of class changelab here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class changelab
{

    public changelab()
    {
        // initialise instance variables
    }

    public static void changeStart()
    {
        double purchaseAmount = scannerIO.doubleInput("Please enter amount of purchase: ");

        double cashPaid = scannerIO.doubleInput("Please enter amount of cash tendered: ");
        
        double temp = cashPaid - purchaseAmount; //total difference 
        temp = temp - (int)temp + 0.00001; //rounds
        int change = (int)(temp *100); //calculates change required
       
        double cash = cashPaid - purchaseAmount;
        scannerIO.printf("Total change needed: $",cash);
        
        int bills = (int)cash;
        
        scannerIO.printout("\nBills needed: $ "+bills);
        
        scannerIO.printout("\nAmount of coins needed: " + change + " cents");
        
        int quarter = (int)change/25;
        int left1 = change%25;
        int dime = (int)left1/10;
        int left2 = left1%10;
        int nickel = (int)left2/5;
        int left3 = left2%5;
        int penny = left3;
        
        scannerIO.printout("Quarters needed: " + quarter);
        scannerIO.printout("Dimes needed: " + dime);
        scannerIO.printout("Nickels needed: " + nickel);
        scannerIO.printout("Pennies needed: " + penny);
    }
}
