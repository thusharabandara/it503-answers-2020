/**
 * The Rectangle class is a subclass of Shape. It implements the interfaces Scalable, and Fillable.
 * The Rectangle can be moved, scaled and filled/unfilled.
 */
public class Rectangle extends Shape implements Scalable, Fillable
{
    private double width;
    private double height;
    private boolean filled;

    public Rectangle(double x, double y, double width, double height)
    {
        this.setX(x);
        this.setY(y);
        this.width = width;
        this.height = height;
    }

    @Override
    public boolean isFilled()
    {
        return this.filled;
    }

    @Override
    public void setFilled(Boolean filled)
    {
        this.filled = filled;
    }

    @Override
    public void scale(double sf)
    {
        this.width *= sf;
        this.height *= sf;
    }

    @Override
    public void scale(double sx, double sy)
    {
        this.height *= sy;
        this.width *= sx;
    }

    @Override
    public void move(double dx, double dy)
    {
        this.setX(this.getX() + dx);
        this.setY(this.getY() + dy);
    }
}
