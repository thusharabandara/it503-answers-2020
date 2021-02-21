/**
 * The class Line inherits from the class Shape and implements the Scalable interface.
 */
public class Line extends Shape implements Scalable
{
    /** The x coordinate of the starting point of the Line */
    double x0;

    /** The y coordinate of the starting point of the Line */
    double y0;

    /** The x coordinate of the end point of the Line */
    double x1;

    /** The y coordinate of the end point of the Line */
    double y1;

    /**
     * The constructor method of the Line class.
     * @param x0    The x coordinate of the starting point of the Line
     * @param y0    The y coordinate of the starting point of the Line
     * @param x1    The x coordinate of the end point of the Line
     * @param y1    The y coordinate of the end point of the Line
     */
    Line(double x0, double y0, double x1, double y1)
    {
        this.setX((x0 + x1) / 2);
        this.setY((y0 + y1) / 2);
        this.x0 = x0;
        this.x1 = x1;
        this.y0 = y1;
        this.y1 = y1;
    }

    /**
     * The method used to move a Line object.
     * Moves a Line object by the specified distances and updates the location of the midpoint of the Line.
     * @param dx    The distance to be moved in the x direction
     * @param dy    The distance to be moved in the y direction
     */
    public void move(double dx, double dy)
    {
        this.x0 += dx;
        this.x1 += dx;
        this.y0 += dy;
        this.y1 += dy;

        this.setX((x0 + x1) / 2);
        this.setY((y0 + y1) / 2);
    }

    /**
     * The method used to scale a Line object equally in the x and y directions.
     * Scales a Line by the specified scale factor. Scaling is the action of making an object change in size.
     * @param sf    Scale factor
     */
    @Override
    public void scale(double sf)
    {
        this.x0 *= sf;
        this.x1 *= sf;
        this.y0 *= sf;
        this.x1 *= sf;
    }

    /**
     * The method used to scale a Line by variable amounts along the x and y directions.
     * Scales a Line in the x direction by sx, and in the y direction by sy.
     * @param sx    Scale factor along x axis
     * @param sy    Scale factor along y axis
     */
    @Override
    public void scale(double sx, double sy)
    {
        this.x0 *= sx;
        this.x1 *= sx;
        this.y1 *= sy;
        this.y0 *= sy;

        this.setX((x0 + x1) / 2);
        this.setY((y0 + y1) / 2);
    }
}
