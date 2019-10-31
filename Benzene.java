/**
 * class Benzene draws the Benzene symbol form.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import apcslib.*;
public class Benzene
{
 private static DrawingTool pencil = 
        new DrawingTool (new SketchPad (250, 250));
        
public static void benzeneStart()
{
    Benzene benzene = new Benzene();
    drawCircle();
    drawHexagon();
}
public static void drawCircle()
{
    //drawCircle();
    double r = 22.0;
    pencil.drawCircle(r);
}
public static void drawHexagon()
{
        pencil.up();
        pencil.move(-20,35);
        pencil.down();
        pencil.move(20,35);
        pencil.turn(120);
        pencil.move(40,0);
        pencil.turn(120);
        pencil.move(20,-35);
        pencil.turn(120);
        pencil.move(-20,-35);
        pencil.turn(120);
        pencil.move(-40,0);
        pencil.turn(120);
        pencil.move(-20,35);
}
}
