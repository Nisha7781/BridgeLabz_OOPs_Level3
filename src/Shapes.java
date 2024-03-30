import java.util.Scanner;

interface Shape
{
   void input();
   void area();

}

class Circle implements Shape
{
    double radius;
    public void input()
    {
        radius = 5;
    }
    public void area()
    {
        double area = 3.14 * radius * radius;
        System.out.println("Area of circle is: "+ area);
    }
}

class Rectangle implements Shape
{
    int length, breadth;

    public void input()
    {
        length = 15;
        breadth = 5;
    }

    public void area()
    {
        int area = length * breadth;
        System.out.println("Area od rectangle is: " + area);
    }
}
public class Shapes
{
    public static void main(String[] args)
    {
        Circle c = new Circle();
        c.input();
        c.area();

        Rectangle r = new Rectangle();
        r.input();
        r.area();


    }
}
