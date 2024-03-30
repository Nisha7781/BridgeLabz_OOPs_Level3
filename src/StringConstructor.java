class Super {
    String str;

    Super(String s) {
        str = s;
    }

    void display() {
        System.out.println("String is: " + str);
    }
}

class Sub extends Super {
    Sub(String s)
    {
        super(s);
    }
}

public class StringConstructor
{
    public static void main(String[] args)
    {
        Sub obj = new Sub("Hello world");
        obj.display();
    }
}

