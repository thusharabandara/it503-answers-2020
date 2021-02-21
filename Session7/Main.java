public class Main
{
    public static void main(String[] args)
    {
        Line line = new Line(5, 5, 10, 10);
        line.move(10, 15);
        line.scale(5);
        line.scale(2, 3);
        line.printLocation();

        Rectangle rectangle = new Rectangle(10, 15, 10, 8);
        rectangle.move(4, 6);
        rectangle.scale(3);
        rectangle.scale(2, 1);
        rectangle.setFilled(true);
        System.out.println(rectangle.isFilled());
    }
}
