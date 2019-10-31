
/**
 * Write a description of class rectanglelab here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import apcslib.*;
public class Rectangle
{
    private double myX; //x coordinate
    private double myY; //y coordinate
    private double myWidth; //width of rectangle
    private double myHeight; //height of rectangle
    private double perimeter; //perimeter of rectangle
    private double area; //area of rectangle
    
    //create new sketchpad
    private static DrawingTool pen =
        new DrawingTool (new SketchPad (500, 500));
    
    //constructor
    public Rectangle()//initial dimensions 0
    {
        myX = -200;
        myY = 0;
        myWidth = 0;
        myHeight = 0;
    }
    
    public Rectangle(double x, double y, double width, double height)
    {
        //initializes instance variables to new variables
        myX = x;
        myY = y;
        myWidth = width;
        myHeight = height;
    }
    
    //methods
    public static void rectangleStart ()
{
    double perimeter, area;
    
    Rectangle rectA = new Rectangle (-200, -80, 400, 160);
    rectA.draw();
    perimeter = rectA.getPerimeter();
    area = rectA.getArea();
    
    System.out.println("perimeter = " + perimeter);
    System.out.println("area = " + area);
    
}
    
    public double getPerimeter() //perimeter method
    {   
        double perimeter = 2*(myWidth + myHeight);
        return perimeter;
    }
    
    public double getArea() //area method
    {
        double area = myWidth * myHeight; 
        return area;
    }
    
    public void draw() //draw rectangle method
    {
        pen.up();
        pen.move(myX, myY);
        pen.down();
        pen.move(myX, myY + myHeight);
        pen.move(myX + myWidth, myY + myHeight);
        pen.move(myX + myWidth, myY);
        pen.move(myX, myY);
    }
}
