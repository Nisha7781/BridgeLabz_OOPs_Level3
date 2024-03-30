class Outer
{
    static class Inner
    {
        void show()
        {
            System.out.println("static inner class method");
        }
    }
}

public class InnerOuterDemo
{
    public static void main(String[] args)
    {
        Outer.Inner inner = new Outer.Inner();
        inner.show();
    }
}
