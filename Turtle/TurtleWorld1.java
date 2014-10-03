import java.awt.Color;

public class TurtleWorld1
{
    public static void main(String args[])
    {
              
            World turtleWorld = new World();
            Turtle turtle = new Turtle(turtleWorld);
            turtle.setPenColor(Color.RED);
            turtle.penDown();
            
            turtle.turn(60);
            turtle.forward(100);
            turtle.turn(120);
            turtle.forward(100);
            turtle.turn(120);
            turtle.forward(100);
        }
    }