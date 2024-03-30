public class AreaOfRectangle
{
        static void calculateArea(int length, int breadth)
        {
            int area = length * breadth;
            System.out.println("Area of Reactangle is: " + area);
        }

        public static void main(String[] args)
        {
           int length = 15;
           int breadth = 10;

           calculateArea(length,breadth);
        }
}
