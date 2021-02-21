/**
 * The abstract class Shape represents any shape in two dimensional space.
 * A Shape has x and y coordinates which are the coordinates of the midpoint of the shape.
 * The printLocation method prints out the x and y coordinates of the midpoint.
 */
public abstract class Shape
{
    /** The x coordinate of the midpoint */
    private double x;

    /** The y coordinate of the midpoint */
    private double y;

    /** The color of the shape */
    private String color;

    /** This method prints out the x and y coordinates of the midpoint of the shape */
    public void printLocation()
    {
        System.out.println(x + ", " + y);
    }

    /** Any concrete subclass of Shape should implement a move method which changes its position */
    public abstract void move(double dx, double dy);


    // Getters and Setters 
    public String getColor()
    {
        return this.color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public double getX()
    {
        return this.x;
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public double getY()
    {
        return this.y;
    }

    public void setY(double y)
    {
        this.y = y;
    }
}
