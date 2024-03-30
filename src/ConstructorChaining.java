class Constructor
    {
        int x;
        Constructor()
        {
            this(20);
            System.out.println("Default Constructor.");
        }

        Constructor(int x)
        {
            this.x = x;
            System.out.println("Parameterized constructor with x: " + this.x);
        }

        Constructor(int x, int y)
        {
            this();
            System.out.println("Parameterized constructor with x " + x + " and y " + y );
            System.out.println("Sum is: "+ this.x+y);
        }
    }

public class ConstructorChaining
{
    public static void main(String[] args)
    {
        Constructor c= new Constructor(11,12);
    }

}
