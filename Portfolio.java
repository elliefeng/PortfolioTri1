/**
 * Write a description of class Portfolio here.
 *
 * @author (Ellie Feng)
 * @version (1.0)
 */
import java.util.Scanner;

public class Portfolio
{
    // instance variables - replace the example below with your own
    private static int errCode;
    private static int exit=10;
    private static int answer;
    public Portfolio()
    {
        // initialise instance variables
        errCode = 0;
    }
    
    public static void main(String [] args){
        countdownsong CountdownSong = new countdownsong(); 
        mathfunlab MathFunLab = new mathfunlab();
        Benzene benzene = new Benzene();
        Rectangle rectangle = new Rectangle();
        changelab ChangeLab = new changelab();
        statistics stat = new statistics();
        palindromesubstring palindrome1 = new palindromesubstring();
        palindromei_j palindrome2 = new palindromei_j();
        palindromerecursion palindrome3 = new palindromerecursion();
        
        Scanner keyboard = new Scanner (System.in);
        Portfolio runner = new Portfolio();
        System.out.print('\u000C');
        System.out.println("Hello welcome to Ellie's Portfolio!");
        //System.out.println("What would you like to see first?");
        System.out.println("Press 0 at any point to exit");
        System.out.println("Press 10 to continue");
        exit=keyboard.nextInt();
        
        while(exit==10){
            menu();
            int answer = keyboard.nextInt();
            if(answer==1){
            countdownsong.song();//calling song method
            }
            if(answer==2){
            mathfunlab.math();//calling math method
            }
            if (answer==3){
            benzene.benzeneStart();//calling benzene method
            }
            if (answer==4){
            rectangle.rectangleStart();//calling rectangle method
            } 
            if (answer==5){
            changelab.changeStart();
            }
            if (answer==6){
            stat.getStatistics();
            }
            if (answer==7){
            palindrome1.getPalindrome1();
            }
            if (answer==8){
            palindrome2.getPalindrome2();
            }
            if (answer==9){
            palindrome3.getPalindrome3();
            }
            if (answer==0){
            System.exit(1);
            }
        }
    }

    public static void menu(){
        System.out.println("=========================");
        System.out.println("MENU SELECTION PORTFOLIO");
        System.out.println("=========================");
        System.out.println("What would you like to see");
        System.out.println("Press 1 for Countdown Song (Octal)");
        System.out.println("Press 2 for Math Fun Lab");
        System.out.println("Press 3 for Benzene Lab");
        System.out.println("Press 4 for Rectangle Lab");
        System.out.println("Press 5 for Change Lab");
        System.out.println("Press 6 for Statistics");
        System.out.println("Press 7 for Palindrome Substring");
        System.out.println("Press 8 for Palindrome Nested For Loop");
        System.out.println("Press 9 for Palindrome Recursion");
    }
}






    