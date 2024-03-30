
public class Calculator
{
    public static void main(String[] args)
    {
        Child c = new Child();
        c.add(6, 7);
        c.subtract(9, 8);
        c.multiply(8, 9);
        c.divide(8, 6);
    }
}
     abstract class Parent
    {
         void add(int a, int b){ };

         void subtract(int a, int b){ };

         void multiply(int a, int b){ };

         void divide(int a, int b){ };

    }

    class Child extends Parent {
        void add(int a, int b) {
            int addition = a + b;
            System.out.println("addition is: " + addition);
        }

        void subtract(int a, int b) {
            int subtraction = a - b;
            System.out.println("subtraction is: " + subtraction);
        }

        void multiply(int a, int b) {
            int multiplication = a * b;
            System.out.println("multiplication is: " + multiplication);
        }

        void divide(int a, int b) {
            int division = a / b;
            System.out.println("division is: " + division);
        }
    }
