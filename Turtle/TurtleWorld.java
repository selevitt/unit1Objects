import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
              
            World turtleWorld = new World();
            Turtle turtle = new Turtle(turtleWorld);
            turtle.setPenColor(Color.RED);
            turtle.penDown();
            turtle.forward(50);
            turtle.turnRight();
            turtle.setPenColor(Color.BLUE);
            turtle.forward(50);
            turtle.turnRight();
            turtle.setPenColor(Color.GREEN);
            turtle.forward(50);
            turtle.turnRight();
            turtle.setPenColor(Color.PINK);
            turtle.forward(50);
            turtle.turnRight();
            turtle.penUp();
            turtle.forward(50);
            turtle.turn(60);
            turtle.penDown();
            turtle.setPenColor(Color.CYAN);
            turtle.forward(50);
            turtle.turn(30);
            turtle.setPenColor(Color.BLACK);
            turtle.forward(50);
            turtle.turn(150);
            turtle.setPenColor(Color.LIGHT_GRAY);
            turtle.forward(50);
            turtle.penUp();
            turtle.turn(300);
            turtle.forward(50);
            turtle.turn(240);
            turtle.penDown();
            turtle.forward(50);
            turtle.turn(300);
            turtle.forward(50);
            
            
            
        }
    }
