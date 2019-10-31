
/**
 * Write a description of class statistics here.
 *
 * @author (Ellie Feng)
 * @version (1.0)
 */
import java.util.*;
public class statistics
{
    public static void getStatistics(){
    int num=scannerIO.integerInput("How many numbers do you want to enter?");

    double userNumbers[] = new double[num];
    //creates new array 
    
    scannerIO.printout("Enter the " + num + " numbers now.");
    for (int i = 0; i < userNumbers.length; i++){
        userNumbers[i]=scannerIO.doubleInput("");
        }
    
    //print out data
    double avganswer = average(userNumbers);
    double stdanswer = sdev(userNumbers);
    double modeanswer = mode(userNumbers);
    scannerIO.printf("Average:",avganswer);
    scannerIO.printf("\nStandard deviation:",stdanswer);
    scannerIO.printf("\nMode:", modeanswer);
    }
    
    public statistics()
    {
        // initialise instance variables
        double avg;
        double std;
        double most;
    }

    public static void returnArray(double array[]){
        for (int i = 0; i < array.length; i++){
            scannerIO.printout(array[i] + " ");
        }
    }
    
    public static double average(double array[]){
        double sum = 0;
        for (int i=0; i < array.length; i++){
            sum = sum + array[i];
    }
        double avg = sum/array.length;
        return avg;
    }
    
    public static double sdev(double array[])
    {
        double sum = 0.0, standardDeviation = 0.0;
        int length = array.length;
        for(double num : array) {
            sum += num;
        }
        double mean = sum/length;
        for(double num: array) {
            standardDeviation += Math.pow(num - mean, 2);
        }
        return Math.sqrt(standardDeviation/length);
    }
    
    public static boolean allDifferent(double array[]){
        for (int i=0; i<array.length; i++){
            for (int j=i+1; j<array.length; j++){
                if (array[i]==array[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static double mode(double array[]){
        double most = 0, maxCount = 0;
        boolean mode;
         
        if (!allDifferent(array)){
            mode=false;
            }
         
         else {
         for (int i = 0; i < array.length; ++i) 
        {
            double count = 0;
            for (int j = 0; j < array.length; ++j) 
            {
                if (array[j] == array[i])
                    ++count;
            }
            if (count > maxCount) 
            {
                maxCount = count;
                most = array[i];
            }
            most = (int) most;
    }
    mode=true;
    }  
    return most;
    }
}